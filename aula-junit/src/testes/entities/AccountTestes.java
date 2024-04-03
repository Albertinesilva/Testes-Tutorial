package testes.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;
import testes.factory.AccountFactory;

public class AccountTestes {

  @Test
  public void depositShouldIncreaseBalanceWhenPositiveAmount() {
    // Arrange
    double amount = 200.0;
    double expectedValue = 196.0;
    Account acc = AccountFactory.createEmptyAccount();

    // Act
    acc.deposit(amount);

    // Assert
    Assertions.assertEquals(expectedValue, acc.getBalance());
  }

  @Test
  public void depositShouldDoNothingWhenNegativeAmount() {
    // Arrange
    double expectedValue = 100.0;
    Account acc = AccountFactory.createAccount(expectedValue);
    double amount = -200.0;

    // Act
    acc.deposit(amount);

    // Assert
    Assertions.assertEquals(expectedValue, acc.getBalance());
  }

  @Test
  public void fullWithdrawShouldClearBalanceAndReturnFullBalance() {
    // Arrange
    double expectedValue = 0.0;
    double initialBalance = 800.0;
    Account acc = AccountFactory.createAccount(initialBalance);

    // Act
    double result = acc.fullWithdraw();

    System.out.println("expectedValue: " + expectedValue);
    // Assert
    Assertions.assertTrue(expectedValue == acc.getBalance());
    Assertions.assertTrue(result == initialBalance);
  }
}
