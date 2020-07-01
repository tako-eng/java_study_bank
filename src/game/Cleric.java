package game;

import java.util.Random;

public class Cleric {
	String name = "クレ";
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;

	public void selfAid() {
		this.mp -= 5;
		this.hp = this.MAX_HP;
	}

	public int pray(int praySecond) {
		Random random = new Random();
		// rironnjou の回復量
		int recovery = random.nextInt(3) + praySecond;
		int tempMp = this.mp + recovery;
		if (tempMp > this.MAX_MP) {
			this.mp = this.MAX_MP;
		} else {
			this.mp += recovery;
		}
		return recovery;
	}
}
