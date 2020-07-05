package bank;

import java.io.IOException;

public class except {

	public static void main(String[] args) throws IOException {
		String san = "三";
		try {
			Integer i = Integer.parseInt(san);
		} catch (Exception e) {
			e.printStackTrace();
		}

		String s = null;
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("例外をキャッチしました");
			System.out.println("stacktraceここから---------");
			e.printStackTrace();
			System.out.println("stacktraceここまで---------");
		}
	}
}
