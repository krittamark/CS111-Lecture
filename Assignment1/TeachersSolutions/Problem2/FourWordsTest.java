import java.util.Scanner;

public class FourWordsTest {
	public static void main(String[] args) {
		String word;
		int i;

		Scanner scan = new Scanner(System.in);
		FourWords words4 = new FourWords();

		words4.printWords();
		for (i = 1; i <= 5; i++) {
			System.out.print("Enter your word: ");
			word = scan.nextLine();
			words4.add(word);
			System.out.print("Round " + i + ": ");
			words4.printWords();
			System.out.printf("\n");

		}
		/*
		 * /////////////////////////// ข้อ 2.1
		 * words4.add("cash");
		 * words4.add("apple");
		 * words4.add("trees");
		 * words4.add("bee");
		 * words4.add("something");
		 * words4.printWords();
		 */
	}

}
