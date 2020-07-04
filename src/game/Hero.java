package game;

public class Hero {
	private String name;
	private int hp;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	void sit(int sec){
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した！");
	}
	void slip(){
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
	void run(){
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAME OVER");
		System.out.println("最終HPは" + this.hp + "でした。");

	}
}
