package fr.uha.ensisa.compil.sound.api;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

public class SoundMidi extends AbstractSound {
	
	private static final int VELOCITY = 74;
	private static final int DURATION = 500;
	
	private Synthesizer synthesizer;
	private Instrument instrument;
	private MidiChannel channel;
	private int note;
	
	public SoundMidi(String instrumentName, char note) {
		try {
			this.synthesizer = MidiSystem.getSynthesizer();
			this.synthesizer.open();
			
			Instrument[] instruments = synthesizer.getDefaultSoundbank().getInstruments();
			MidiChannel[] channels = synthesizer.getChannels();
			int instrumentIndex = -1;
			for (int i = 0; i < instruments.length; i++)
				if (instruments[i].getName().equalsIgnoreCase(instrumentName))
				{
					instrumentIndex = i;
					break;
				}
			
			this.channel = channels[(instrumentIndex >= 128 ? 9 : 0)];
			this.instrument = instruments[instrumentIndex];
			this.synthesizer.loadInstrument(instrument);
			this.channel.programChange(instrumentIndex);
			this.note = convertNote(note);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void playSound() {
		channel.noteOn(note, VELOCITY);
		try {
			Thread.sleep(DURATION);
		} catch (Exception e) { }
		channel.noteOff(note);
	}

	@Override
	public void stopSound() {
		channel.noteOff(note);
	}
	
	private static final int[] offsets = { // add these amounts to the base value
        // A   B  C  D  E  F  G
          -4, -2, 0, 1, 3, 5, 7  
    };

	private static int convertNote(char note) {
		int basekey = 60; // 60 is middle C. Adjusted up and down by octave
		return basekey + offsets[note - 'A'];
	}
}