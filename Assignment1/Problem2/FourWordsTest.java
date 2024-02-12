package Problem2;

import java.util.Scanner;

public class FourWordsTest {
  public static void main(String[] args) {
    FourWords words4 = new FourWords();
    Scanner scanner = new Scanner(System.in);
    words4.printWords();

    for (int i = 0; i < 5; i++) {

      System.out.printf("Enter your word: ");
      String word = scanner.nextLine();
      words4.add(word);
      System.out.printf("Round " + (i+1) + ": ");
      words4.printWords();
    }

    scanner.close(); 
  }

}
