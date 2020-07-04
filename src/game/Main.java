package game;

public class Main {
	public static void main(String args[]) {
		//勇者よ、この世界に生まれよ！
		Hero hero = new Hero();
		hero.setHp(50);
		hero.setName("ミナト");

		//お化けきのこよ、この世界に生まれよ！
		Matango matango1 = new Matango('A');
		matango1.hp = 50;

		Matango matango2 = new Matango('B');
		matango2.hp = 48;

		// 冒険のはじまり;
		hero.slip();
		matango1.run();
		matango2.run();
		hero.run();
	}

}
