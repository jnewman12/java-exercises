// Question; Is a a given year a leap year?
// Answer; if divisible by 400 or by 4, but not 100

public class LeapYear {
	public static void main(String [] args) {
		int year = Integer.parseInt(args[0]);
		boolean isLeapYear;

		// divisible by 4 but not 100
		isLeapYear = (year % 4 == 0) && (year % 100 != 0);

		// or divisible by 400
		isLeapYear = isLeapYear || (year % 400 == 0);

		System.out.println(isLeapYear);
	}
}
// command line; java LeapYear 1900
// false