package fr.uha.ensisa.compil.sound.api;

import java.util.ArrayList;
import java.util.List;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

public class SoundMidi extends AbstractSound {
	
	private static final int EMPTY_SOUND = -100;
	private static final int VELOCITY = 74;
	private static final int DURATION = 500;
	
	private Synthesizer synthesizer;
	private Instrument instrument;
	private MidiChannel channel;
	private List<Integer> listNotes;
	
	public SoundMidi(String instrumentName, List<String> listNotes) {
		try {
			SoundMidi.velocity = VELOCITY;
			SoundMidi.duration = DURATION;
			
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
			this.listNotes = new ArrayList<Integer>();
			for (String s : listNotes)
				this.listNotes.add(convertNote(s.charAt(0)));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void playSound() {
		for (Integer note : this.listNotes)
		{
			if (note != EMPTY_SOUND)
				channel.noteOn(note, SoundMidi.velocity);
			
			try {
				Thread.sleep(SoundMidi.duration);
			} catch (Exception e) { }
			
			if (note != EMPTY_SOUND)
				channel.noteOff(note);
		}
	}

	@Override
	public void stopSound() {
		for (Integer note : this.listNotes)
			channel.noteOff(note);
	}
	
	@Override
	public double getSoundDuration() {
		return (SoundMidi.duration / 1000.0) * this.listNotes.size();
	}
	
	private static final int[] offsets = { // add these amounts to the base value
        // A   B  C  D  E  F  G
          -4, -2, 0, 1, 3, 5, 7
    };

	private static int convertNote(char note) {
		if (note > 'G')
			return EMPTY_SOUND;
		else
		{
			int basekey = 60; // 60 is middle C. Adjusted up and down by octave
			return basekey + offsets[note - 'A'];
		}
	}
}