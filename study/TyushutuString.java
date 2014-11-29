package study;

import java.util.Scanner;

public class TyushutuString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] array = sc.nextLine().split("[\\s]+");

		String tag1 = array[0];
		String tag2 = array[1];

		String line = sc.nextLine();
		sc.close();

		String line2 = line.substring(line.indexOf(tag1) + tag1.length(),
				line.indexOf(tag2));
		if (line2.isEmpty()) {
			System.out.println("<blank>");
		} else {
			System.out.println(line2);
		}
		if (line.indexOf(tag2) != -1) {
			line2 = line.substring(line.indexOf(tag2) + tag2.length());
		}
		while (true) {
			if (line2.indexOf(tag2) != -1) {
				line2 = line2.substring(line2.indexOf(tag1) + tag1.length(),
						line2.indexOf(tag2));
				if (line2.isEmpty()) {
					line2 = "<blank>";
				}
				System.out.println(line2);
			} else {
				break;
			}
		}
	}

}
