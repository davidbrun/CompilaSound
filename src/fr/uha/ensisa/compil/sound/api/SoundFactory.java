package fr.uha.ensisa.compil.sound.api;

import java.util.ArrayList;
import java.util.List;

public class SoundFactory {
	
	private static final String BLANK_SEPARATOR = "#";
	
	public AbstractSound createSoundMidi(String instrumentName, List<String> notes) {
		return new SoundMidi(instrumentName.replace(BLANK_SEPARATOR, " ").replace("\"", ""), notes);
	}

	public AbstractSound createSoundFile(String filename) {
		return new SoundFile(filename.replace("\"", ""));
	}
	
	public List<AbstractSound> createListSounds() {
		return new ArrayList<AbstractSound>();
	}
	
	public List<String> createListNotes() {
		return new ArrayList<String>();
	}
	
	public SoundSequence createSoundSequence(List<AbstractSound> listSounds) {
		return new SoundSequence(listSounds);
	}
	
	public SoundLoop createSoundLoop(int repeatTimes, List<AbstractSound> listSounds) {
		return new SoundLoop(repeatTimes, listSounds);
	}
}