package _05_cow_timer;

import game_tools.Sound;

public class CowTimer {
	private int seconds;

	public CowTimer(int seconds) {
		setTime(seconds);

	}

	public void setTime(int seconds) {
		this.seconds = seconds;
		System.out.println("Cow time set to " + this.seconds + " seconds.");
	}

	public void start() throws InterruptedException {
		for (int x = seconds; x > -1; x -= 1) {
			System.out.println(x);
			Thread.sleep(1000);
		}

		playSound("moo.wav");

	}

	public void playSound(final String file) {
		String fileName = "_05_cow_timer/" + file;
		Sound sound = new Sound(fileName);
		sound.play();
	}
}
