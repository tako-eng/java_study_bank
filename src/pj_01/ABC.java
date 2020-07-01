package pj_01;

public class ABC {
	public static void main(String args[]) {
		System.out.println(calcTriangleArea(10, 10));
		System.out.println(calcCircleArea(10));
	}

	public static double calcTriangleArea(double bottom, double height) {
		double answer = bottom * height / 2;
		return answer;
	}
	public static double calcCircleArea(double radius) {
		double answer = radius * radius * 3.14;
		return answer;
	}

}
