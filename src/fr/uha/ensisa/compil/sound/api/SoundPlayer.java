package fr.uha.ensisa.compil.sound.api;

import java.util.List;

public class SoundPlayer {
	
	public void playSound(AbstractSound sound) {
		sound.playSound();
	}
	
	public void playSoundSimult(List<AbstractSound> listSounds) {
		double maxDuration = 0;
		
		for (AbstractSound sound : listSounds)
		{
			final AbstractSound s = sound;
			
			maxDuration = Math.max(maxDuration, s.getSoundDuration());
			
			new Thread() {
				public void run() {
					s.playSound();
				}
			}.start();
		}
		
		try {
			Thread.sleep((long) (Math.ceil(maxDuration) * 1000));
		} catch (Exception e) { }
	}
}