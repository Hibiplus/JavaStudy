package study;
import java.util.Arrays;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();
		sc.close();

		String[] lineArray = line.split("[\\s]+");

		int length = lineArray.length;
		int[] countArray = new int[length];
		Arrays.fill(countArray, 1);
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {

				if (!(lineArray[i].isEmpty())) {
					if (lineArray[i].equals(lineArray[j])) {
						lineArray[j] = " ";
						countArray[i]++;
					}
				}

			}
		}

		for (int i = 0; i < length; i++) {
			if (countArray[i] != 0 && !(lineArray[i].equals(" "))) {
				System.out.println(lineArray[i] + " " + countArray[i]);

			}
		}

	}

}
