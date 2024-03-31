// Author: Krittamet Damthongkam (กฤตเมธ ดำทองคำ)
// Student ID: 6609490062

package problem1;

import java.util.Scanner;

public class RomanSymbol {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String input, romanNumber = romanNumberToText(input(scn));

    do {
      if (romanNumber.isEmpty()) {
        System.out.printf("Unknown Number.%n");
      } else {
        System.out.printf("It is %s%n", romanNumber);
      }

      input = input(scn);
      romanNumber = romanNumberToText(input);
    } while(!input.isEmpty());

    scn.close();
  }

  public static String input(Scanner scn) {
    System.out.print("Input the roman number: ");
    return scn.nextLine();
  }

  public static String romanNumberToText(String romanNumber) {
    return switch (romanNumber) {
      case "I" -> "One";
      case "II" -> "Two";
      case "III" -> "Three";
      case "IV" -> "Four";
      case "V" -> "Five";
      case "VI" -> "Six";
      default -> "";
    };
  }
}
