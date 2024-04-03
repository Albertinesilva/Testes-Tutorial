package testes.entities;

import org.junit.Test;

import entities.Account;

public class AccountTestes {
  
  @Test
  public void depositShouldIncreaseBalanceWhenPositiveAmount() {
    // Arrange
    double amount = 200.0;
    double expectedValue = 196.0;
    Account acc = new Account(1L, 100.0);
    
    // Act
    acc.deposit(amount);
    
    // Assert
    assertEquals(expectedValue, acc.getBalance());
  }
}
