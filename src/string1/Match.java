package string1;

public class Match {

	public static void main(String[] args) {
		String a1 = "hogefugapiyo";//true
		String b1 = "A1";// true
		String b2 = "A12b";// false
		String c1 = "UAIU";//true
		String c2 = "UAIUE";//false
		System.out.println(a1 + " " + a1.matches(".*"));
		System.out.println(b1 + " " + b1.matches("A[0-9]{1,2}"));
		System.out.println(b2 + " " + b2.matches("A¥d{1,2}"));
		System.out.println(c1 + " " + c1.matches("U[A-Z]{3}"));
		System.out.println(c2 + " " + c2.matches("U[A-Z]{3}"));
	}

}
