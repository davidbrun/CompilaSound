package fr.uha.ensisa.compil.sound.api;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.URL;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

public class SoundFile extends AbstractSound {
	
	private static final int DURATION_OFFSET = 150;

	private AudioClip song;
	private URL songPath;
	private double songDuration;

	public SoundFile(String filename) {
		try {
			File file = new File(filename);
			if (file.exists()) {
				songPath = new URL("file", "", file.getCanonicalPath());
				song = Applet.newAudioClip(songPath);
				songDuration = computeSoundDuration();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void playSound() {
		song.play();

		try {
			Thread.sleep((long) (Math.ceil(this.songDuration) * 1000 + DURATION_OFFSET));
		} catch (Exception e) { }
	}
	
	@Override
	public void stopSound() {
		song.stop();
	}
	
	/**
	 * Get the duration of this sound in seconds
	 * 
	 * @return The duration of this sound in seconds
	 */
	public double getSoundDuration() {
		return this.songDuration;
	}

	private double computeSoundDuration() {
		double durationInSeconds = 0;
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(songPath);
			AudioFormat format = audioInputStream.getFormat();
			long frames = audioInputStream.getFrameLength();
			durationInSeconds = (frames + 0.0) / format.getFrameRate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return durationInSeconds;
	}
}