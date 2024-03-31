// Author: Krittamet Damthongkam (กฤตเมธ ดำทองคำ)
// Student ID: 6609490062

package problem2;

import java.util.Scanner;

public class TelephoneCharge {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    double telephoneUsage = 0.0;
    String input;

    do {
      System.out.print("Enter minutes: ");
      try {
        input = scn.nextLine();
        telephoneUsage = Double.parseDouble(input);
        double telephoneCharge = new TelephoneCharge().chargeByUsage(telephoneUsage);

        System.out.printf("You have to pay %.1f%n", telephoneCharge);
      } catch (NumberFormatException e) {
        break;
      }
    } while (true);

    scn.close();
  }

  public double chargeByUsage(double telephoneUsage) {
    telephoneUsage = Math.ceil(telephoneUsage);

    // In case (usageTime < 0) charge 0
    if (telephoneUsage < 0) return 0.0;

    // In case (usageTime > 0 AND usageTime < 10) charge 3.5 per minutes
    if (telephoneUsage > 0 && telephoneUsage < 10) return telephoneUsage * 3.5;

    if (telephoneUsage >= 10 && telephoneUsage < 60) {
      // In case (usageTime >= 10 AND usageTime < 60 AND usageTime <= 20) charge 3 per minutes
      if (telephoneUsage <= 20) return telephoneUsage * 3;

      // In case (usageTime >= 10 AND usageTime < 60 AND usageTime > 20) charge 1 per minutes + 20 minutes with rate 3 per minutes
      return (20 * 3) + ((telephoneUsage - 20) * 1);
    }
    if (telephoneUsage >= 60) return telephoneUsage * 1.5;

    return 0.0;
  }
}
