package fr.uha.ensisa.compil.sound.api;

import java.util.List;

public class SoundLoop extends SoundSequence {
	
	private int repeatTimes;
	
	public SoundLoop() {
		super();
		this.repeatTimes = 0;
	}
	
	public SoundLoop(int repeatTimes, List<AbstractSound> listSounds) {
		super(listSounds);
		this.repeatTimes = repeatTimes;
	}
	
	public void setRepeatTimes(int repeatTimes) {
		this.repeatTimes = repeatTimes;
	}

	@Override
	public void playSound() {
		for (int i = 0; i < repeatTimes; i++)
			super.playSound();
	}

	@Override
	public void stopSound() {
		for (AbstractSound sound : super.listSounds)
			sound.stopSound();
	}
	
	@Override
	public double getSoundDuration() {	
		return super.getSoundDuration() * repeatTimes;
	}
}