package codingQuestion4;

import java.util.Random;
import java.util.Scanner;

public class MyRandom {
  public static int genRandom(int min, int max) {
    if (min < 0 || max < 0) {
      System.out.print("error range cannot be negative value");
      return -1;
    }
    return new Random().nextInt(min, max + 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int min, max, random;
    String choice;
    do {
      System.out.print("Please enter min: ");
      min = sc.nextInt();

      System.out.print("Please enter max: ");
      max = sc.nextInt();

      if (min > max) {
        int tmp = min;
        min = max;
        max = tmp;
      }
      random = genRandom(min, max);
      if (random > 0) System.out.printf("Value after Random(Min: %d, Max: %d) = %d", min, max, random);

      System.out.printf("%nPress Y to Continue, Q to Exit: ");
      choice = sc.next();
    } while (choice.equalsIgnoreCase("Y"));

  }
}
