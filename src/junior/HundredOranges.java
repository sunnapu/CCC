package junior;

import java.util.ArrayList;
import java.util.Random;

/**
 * put 100 oranges into 6 baskets, and the number of oranges in each baskets has
 * to have 6 in the number
 */
public class HundredOranges {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		int[] options = { 6, 16, 26, 36, 46, 56, 66, 76, 86, 96, 60, 61, 62,
				63, 64, 65, 66, 67, 68, 69 };

		ArrayList<Integer> set = new ArrayList<Integer>();

		Random random = new Random();

		int randomNumber = 0;
		int total = 0;
		long count = 0;
		boolean found = false;

		do {
			set.clear();
			while (set.size() < 6) {
				randomNumber = random.nextInt((19 - 0) + 1);
				count++;
				int number = options[randomNumber];
				set.add(number);
			}
			total = 0;
			for (int n : set) {
				total = total + n;
			}
			// System.out.println(set);

			if (total == 100) {
				if (count < 10000) {
					found = true;
				} else {
					count = 0;
				}
			}
		} while (!found);

		long endTime = System.currentTimeMillis();
		long diff = endTime - startTime;

		System.out.println("total generated random number: " + count);
		System.out.println(set);
		System.out.println("Total milliseconds: " + diff);
	}
}
