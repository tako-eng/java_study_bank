package game;

public class Main {
	public static void main(String args[]) {
		//勇者よ、この世界に生まれよ！
		Hero hero = new Hero();
		hero.hp = 50;
		hero.name = "ミナト";

		//お化けきのこよ、この世界に生まれよ！
		Matango matango1 = new Matango();
		matango1.hp = 50;
		matango1.suffix = 'A';

		Matango matango2 = new Matango();
		matango2.hp = 48;
		matango2.suffix = 'B';

		// 冒険のはじまり;
		hero.slip();
		matango1.run();
		matango2.run();
		hero.run();
	}

}
