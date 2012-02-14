package fr.uha.ensisa.compil.sound.api;

import java.util.ArrayList;
import java.util.List;

public class SoundSequence extends AbstractSound {
	
	protected List<AbstractSound> listSounds;
	
	public SoundSequence() {
		this.listSounds = new ArrayList<AbstractSound>();
	}
	
	public SoundSequence(List<AbstractSound> listSounds) {
		this.listSounds = listSounds;
	}
	
	public void addSound(AbstractSound sound) {
		this.listSounds.add(sound);
	}
	
	@Override
	public void playSound() {
		for (AbstractSound sound : this.listSounds)
			sound.playSound();
	}

	@Override
	public void stopSound() {
		for (AbstractSound sound : this.listSounds)
			sound.stopSound();
	}
	
	@Override
	public double getSoundDuration() {
		double result = 0;
		
		for (AbstractSound sound : this.listSounds)
			result += sound.getSoundDuration();
			
		return result;
	}
}