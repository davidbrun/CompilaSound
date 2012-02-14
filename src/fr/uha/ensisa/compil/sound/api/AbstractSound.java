package fr.uha.ensisa.compil.sound.api;

public abstract class AbstractSound {
	
	protected static int velocity;
	protected static int duration;
	
	public abstract void playSound();
	public abstract void stopSound();
	public abstract double getSoundDuration();
	
	/**
	 * Set the duration of the note, if possible
	 * 
	 * @param duration The new duration of the note
	 */
	public static void setNoteDuration(int duration) {
		AbstractSound.duration = duration;
	}
	/**
	 * Set the velocity of the sound, if possible
	 * 
	 * @param velocity The new velocity of the sound
	 */
	public static void setSoundVelocity(int velocity) {
		AbstractSound.velocity = velocity;
	}
}