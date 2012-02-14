package fr.uha.ensisa.compil.sound.api;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

public class AvailableInstruments {

	/**
	 * Display the list of available instruments
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Synthesizer synthesizer = MidiSystem.getSynthesizer();
			synthesizer.open();
			
			Instrument[] instruments = synthesizer.getDefaultSoundbank().getInstruments();
			
			for (int i = 0; i < instruments.length; i++)
				System.out.println(i + " : " + instruments[i].getName());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}