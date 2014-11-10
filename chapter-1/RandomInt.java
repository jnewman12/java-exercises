public class RandomInt {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]); // string to int method
		double r = Math.random(); // double between 0.0 and 1.0
		int n = (int) (r * N); // doublt to int, int to double

		System.out.println("random integer is " + n);
	}
}