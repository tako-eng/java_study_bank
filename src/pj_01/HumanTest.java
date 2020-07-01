package pj_01;

public class HumanTest{
	public static void main(String[] args){
		Human human;
        human = new Human("nobuo", 20190501);

        System.out.println("名前：" + human.name);
        System.out.println("生年月日：" + human.birthday);
        System.out.println("満腹度：" + human.manpukudo);
	}
}