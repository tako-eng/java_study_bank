package game;

public class PoisonMatango extends Matango {
	private int poisonCount = 5;

	public PoisonMatango(char suffix) {
		super(suffix);
	}

	public void attack(Hero h) {
		super.attack(h);
		if (0 < this.poisonCount) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int damage = (int) (h.getHp() * 0.25);
			h.setHp(h.getHp() - damage);
			System.out.println(damage + "ポイントのダメージ");
			this.poisonCount --;
		}
	}
}
