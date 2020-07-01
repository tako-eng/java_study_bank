package pj_01;

public class For_extend_02_4_14 {

	public static void main(String args[]) {
		String[] array = {"A","B"};
		for (String a: array) {
			for (String b:array) {
				if("B".equals(b))
					break;
				System.out.println(b);
			}
		}
	}
}
