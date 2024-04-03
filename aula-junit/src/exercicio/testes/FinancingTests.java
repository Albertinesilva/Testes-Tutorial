package exercicio.testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import exercicio.entities.Financing;

public class FinancingTests {

  @Test
  public void constructorShouldCreateObjectWhenValidData() {

    // Arrange

    // Action
    Financing f = new Financing(100000.0, 2000.0, 80);

    // Assert
    Assertions.assertEquals(100000.0, f.getTotalAmount());
    Assertions.assertEquals(2000.0, f.getIncome());
    Assertions.assertEquals(80, f.getMonths());
  }

  @Test
  public void constructorShoulgThrowIllegalArgumentExceptionWhenInvalidData() {
    // Action
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      Financing f = new Financing(100000.0, 2000.0, 20);
    });
  }

  @Test
  public void setTotalAmountShouldSetDatWhenValidData() {

    // Arrange
    Financing f = new Financing(100000.0, 2000.0, 80);

    // Action
    f.setTotalAmount(90000.0);

    // Assert
    Assertions.assertEquals(90000.0, f.getTotalAmount());
  }

  @Test
  public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {

    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      Financing f = new Financing(100000.0, 2000.0, 80);
      f.setTotalAmount(110000.0);
    });
  }

  @Test
  public void setIncomeShouldSetDatWhenValidData() {

    // Arrange
    Financing f = new Financing(100000.0, 2000.0, 80);

    // Action
    f.setIncome(2100.0);

    // Assert
    Assertions.assertEquals(2100.0, f.getIncome());
  }

  @Test
  public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {

    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      Financing f = new Financing(100000.0, 2000.0, 80);
      f.setIncome(1900.0);
    });
  }

  @Test
  public void setMonthsShouldSetDatWhenValidData() {

    // Arrange
    Financing f = new Financing(100000.0, 2000.0, 80);

    // Action
    f.setMonths(81);

    // Assert
    Assertions.assertEquals(81, f.getMonths());
  }

  @Test
  public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {

    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      Financing f = new Financing(100000.0, 2000.0, 80);
      f.setMonths(79);
    });
  }

  @Test
  public void entryShouldCalculateEntryCorrectly() {

    // Arrange
    Financing f = new Financing(100000.0, 2000.0, 80);

    // Action
    double entry = f.entry();

    // Assert
    Assertions.assertEquals(20000.0, entry);
  }

  @Test
  public void quotaShouldCalculateQuotaCorrectly() {

    // Arrange
    Financing f = new Financing(100000.0, 2000.0, 80);

    // Action
    double quota = f.quota();

    // Assert
    Assertions.assertEquals(1000.0, quota);
  }
}
