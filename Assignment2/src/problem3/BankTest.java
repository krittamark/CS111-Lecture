// Author: Krittamet Damthongkam (กฤตเมธ ดำทองคำ)
// Student ID: 6609490062

package problem3;

import java.util.ArrayList;
import java.util.Scanner;

public class BankTest {
  private static final Bank myBank = new Bank();

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    printMenu();
    System.out.print("Enter your choice: ");
    String input = scn.next();

    do {
      switch (input) {
        case "1":
          menuAddNewAccount(scn);
          break;
        case "2":
          menuShowAccountDetail(scn);
          break;
        case "3":
          menuFindAccount(scn);
          break;
        case "4":
          menuAddInterest(scn);
          break;
        case "5":
          menuReport(scn);
          break;
      }
      System.out.printf("%nPress enter to continue...");
      scn.nextLine();
      scn.nextLine();
      printMenu();
      System.out.print("Enter your choice: ");
      input = scn.next();
    } while (!input.equalsIgnoreCase("q"));
  }

  private static void printMenu() {
    System.out.printf("================ Bank System ================%n%n");
    System.out.printf("----------------[ MAIN MENU ]----------------%n");
    System.out.printf("* [1] Add a new account                     *%n");
    System.out.printf("* [2] Show account details                  *%n");
    System.out.printf("* [3] Find accounts by balance              *%n");
    System.out.printf("* [4] Add an interest to all accounts       *%n");
    System.out.printf("* [5] Report bank summary                   *%n");
    System.out.printf("* [Q] Quit program                          *%n");
    System.out.printf("---------------------------------------------%n%n");
    System.out.printf("Choose one of the options from above. (E.g: Type '1' to add a new account)%n%n");
  }

  private static void menuAddNewAccount(Scanner scn) {
    System.out.print("[ADD ACCOUNT]: New account initial balance: ");
    double balance = scn.nextDouble();
    myBank.addAccount(new Account(balance));
    System.out.printf("[ADD ACCOUNT]: Successfully add a new account with %.2f balance to the bank.%n", balance);
  }

  private static void menuShowAccountDetail(Scanner scn) {
    if (myBank.getAllAccounts() == null) {
      System.out.print("[SHOW ACCOUNT]: There are no accounts yet. Please add an account with [MENU 1] first.");
      return;
    }
    System.out.print("[SHOW ACCOUNT]: An index of account to be shown: ");
    int accountIndex = scn.nextInt();
    Account account = myBank.getAccount(accountIndex);
    System.out.printf("%n[SHOW ACCOUNT]: Index account at %d balance is %.2f%n", accountIndex, account.getBalance());
  }

  private static void menuFindAccount(Scanner scn) {
    if (myBank.getAllAccounts() == null) {
      System.out.print("[FIND ACCOUNT]: There are no accounts yet. Please add an account with [MENU 1] first.");
      return;
    }

    System.out.print("[FIND ACCOUNT]: The account with amount: ");
    double balance = scn.nextDouble();
    ArrayList<Account> accounts = myBank.findAccounts(balance);
    System.out.printf("[FIND ACCOUNT]: There are %d accounts with amount \"%.2f\" ", accounts.size(), balance);
    System.out.print("[");
    int i = 1;
    for (Account account : accounts) {
      System.out.printf("Account %d", account.getAccountNumber());
      if (i < accounts.size()) {
        System.out.print(", ");
      }
      i++;
    }
    System.out.printf("]%n");
    System.out.printf("[FIND ACCOUNT]: The least balance: %.2f%n", myBank.findMin().getBalance());
    System.out.printf("[FIND ACCOUNT]: The most balance: %.2f%n", myBank.findMax().getBalance());
  }
  private static void menuAddInterest(Scanner scn) {
    if (myBank.getAllAccounts() == null) {
      System.out.print("[INTEREST]: There are no accounts yet. Please add an account with [MENU 1] first.");
      return;
    }

    myBank.addInterest();
    System.out.printf("[INTEREST]: Successfully add an interest to all accounts%n");
    int accountIndex = 0;
    for (Account account : myBank.getAllAccounts()) {
      System.out.printf("[INTEREST]: Index account at %d balance is %.2f%n", accountIndex, account.getBalance());
      accountIndex++;
    }
  }
  private static void menuReport(Scanner scn) {
    System.out.printf("[REPORT]: Total balance: %.2f%n", myBank.getTotal());
    System.out.printf("[REPORT]: Average balance: %.2f%n", myBank.getAverage());
  }

}
