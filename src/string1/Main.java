package string1;

public class Main {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; 100 >= i; i++) {
			sb.append(i);
			sb.append(",");
		}
		System.out.println(sb);
		String s = sb.toString();
		String[] a = s.split(",");
		System.out.println(a);
		for (int i = 1; a.length >= i; i++) {
			System.out.println(a[i]);
		}
	}
}
