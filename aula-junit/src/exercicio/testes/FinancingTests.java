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
}
