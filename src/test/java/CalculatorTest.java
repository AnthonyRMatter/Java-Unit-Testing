import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

  Calculator calculator = new Calculator();

  @Test
  public void testAdd() {
    int expected = 3;

    int actual = calculator.add(1, 2);

    assertEquals(expected, actual);
  }

  @Test
  public void testSubtract() {
    int expected = 5;

    int actual = calculator.subtract(10, 5);

    assertEquals(expected, actual);

  }

  @Test
  public void testMultiply() {
    int expected = 5;

    int actual = calculator.multiply(1, 5);

    assertEquals(expected, actual);

  }

  @Test
  public void testDivide() {
    int expected = 2;

    int actual = calculator.divide(5, 2);

    assertEquals(expected, actual);
  }

}
