package pj_01;

public class Human {
	String name;
	int birthday;
	int manpukudo;

	Human(String name, int birthday) {
		this.name = name;
		this.birthday = birthday;
		this.manpukudo = 50;
	}

	void eat() {
		this.manpukudo += 60;
	}
}