package pj_01;

public class For_extend_01 {
	public static void main(String args[]) {
		String[] array = {"A","B","C"};
		for (String str : array) {
			str = "D";
		}
		for (String str : array) {
			System.out.println(str);
		}
	}

}
