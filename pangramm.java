import java.util.Scanner;

public class StringAnalyse {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String name = obj.nextLine();
		name = name.toLowerCase();
		int length = name.length();
		int value = 0;
		if (length < 26) {
			System.out.println("given string is not pangram");
		} else {
			for (char character = 'a'; character <= 'z'; character++) {
				int index = name.indexOf(character);
				if (index == -1) {
					value = 1;
					break;
				}
			}

			if (value == 1) {
				System.out.println("given string is not pangram");
			} else {
				System.out.println("given sring is pangram");
			}
		}
	}
}