// Author: Krittamet Damthongkam (กฤตเมธ ดำทองคำ)
// Student ID: 6609490062

package problem3;

import java.util.ArrayList;

public class Bank {
  private final ArrayList<Account> accountList = new ArrayList<Account>();

  public void addAccount(Account account) {
    accountList.add(account);
  }

  public Account getAccount(int index) throws IndexOutOfBoundsException {
    try {
      return accountList.get(index);
    } catch (IndexOutOfBoundsException e) {
      throw new IndexOutOfBoundsException();
    }
  }

  public ArrayList<Account> findAccounts(double amount) {
    if (this.accountList.isEmpty()) return null;

    ArrayList<Account> resultAccount = new ArrayList<Account>();
    for (Account account : this.accountList) {
      if (account.getBalance() >= amount) { resultAccount.add(account); }
    }
    return resultAccount;
  }

  public Account findMin() {
    if (this.accountList.isEmpty()) return null;

    Account minimumAccount = accountList.get(0);
    for (Account account : this.accountList) {
      if (account.getBalance() < minimumAccount.getBalance()) {
        minimumAccount = account;
      }
    }
    return minimumAccount;
  }

  public Account findMax() {
    if (this.accountList.isEmpty()) return null;

    Account maximumAccount = accountList.get(0);
    for (Account account : this.accountList) {
      if (account.getBalance() > maximumAccount.getBalance()) {
        maximumAccount = account;
      }
    }
    return maximumAccount;
  }

  public void addInterest() {
    double interestRatePercentage = 3.0;
    for (Account account : this.accountList) {
      double balance = account.getBalance();
      account.deposit(balance * (interestRatePercentage / 100));
    }
  }

  public double getTotal() {
    if (this.accountList.isEmpty()) return 0.0;

    double totalBalance = 0;
    for (Account account : this.accountList) {
      totalBalance += account.getBalance();
    }
    return totalBalance;
  }

  public double getAverage() {
    if (this.accountList.isEmpty()) return 0.0;

    double totalBalance = 0;
    int accountCount = 0;
    for (Account account : this.accountList) {
      accountCount++;
      totalBalance += account.getBalance();
    }
    return totalBalance / accountCount;
  }

  public ArrayList<Account> getAllAccounts() {
    return accountList;
  }
}

