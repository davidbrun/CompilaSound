package fr.uha.ensisa.compil.sound.api;

public class SoundPlayer {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean test1 = false;
		
		if (test1) {
			String[] files = new String[] { "audio/1-welcome.wav",
					"audio/22-new.aif", "audio/destMouse_Peru.AIF",
					"audio/sfx-medley.rmf", "audio/spacemusic.au",
					"audio/trippygaia1.mid" };

			for (String filename : files)
				new SoundFile(filename).playSound();
		} else {
//			String instrumentName = "Piano";
			String instrumentName = "Open Hi-Hat";
//			String instrumentName = "Closed Hi-Hat";
			char[] notes = "A B C D E F G F E D C B A".replaceAll("\\s", "").toCharArray();
			
			for (char note : notes)
				new SoundMidi(instrumentName, note).playSound();
		}
	}
}