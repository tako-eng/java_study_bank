package game;

import java.util.Random;

public class Cleric {
	String name = "";
	static final int MAX_HP = 50;
	int hp = 50;
	static final int MAX_MP = 10;
	int mp = 10;

	public Cleric(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	public Cleric(String name, int hp) {
		this(name, hp, Cleric.MAX_MP);
	}

	public Cleric(String name) {
		this(name, Cleric.MAX_HP, Cleric.MAX_MP);
	}

	public void selfAid() {
		this.mp -= 5;
		this.hp = MAX_HP;
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
