package pj_01;

public class ForTest {
	public static void main(String args[]) {
		int array[][] = new int[][] { { 1, 2 }, { 2, 3, 4 } };
		int total = 0;
		for (int i = 0; i < array.length; i++) { // ２より小さいまで
			System.out.println("--------------------");
			System.out.println("i_" + i);
			System.out.println("array.length_" + array.length);
			for (int j = i; j < array[i].length; j++) {
				total += array[i][j];
				System.out.println("*******************");
				System.out.println("i_" + i);
				System.out.println("array[i][0]_" + array[i][0]);
				System.out.println("array[i].length_" + array[i].length);
				System.out.println("array[i][j]_" + array[i][j]);
				System.out.println("j_" + j);
				System.out.println("total_" + total);
			}
		}
		System.out.println("==================");
		System.out.println("last_" + total);
	}
}
