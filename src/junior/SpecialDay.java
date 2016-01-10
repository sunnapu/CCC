package junior;

import java.util.Date;
import java.util.Scanner;

public class SpecialDay {
	public static void main(String[] args) {
		Date specialDay = new Date(2015 - 1900, 1, 18);

		int specialMonth = specialDay.getMonth();
		int specialDate = specialDay.getDate();
		System.out.println(specialDate);

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		System.out.println("month is " + month);
		int date = scanner.nextInt();

		if (month > specialMonth + 1) {
			System.out.println("After");
		} else if (month < specialMonth + 1) {
			System.out.println("Before");
		} else if (date > specialDate) {
			System.out.println("After");
		} else if (date < specialDate) {
			System.out.println("Before");
		} else {
			System.out.println("Special day");
		}
	}
}
