import calculator.Calculator;
import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    private static final double delta = 1e-15;
    Calculator c = new Calculator();

    @Test
    public void squareRoot() {
        assertEquals("Testing for squareRoot", 8.0, c.squareRoot(64.0), delta);
    }

    @Test
    public void factorial() {
        assertEquals("Testing for factorial", 120.0, c.factorial(5.0), delta);
    }

    @Test
    public void logarithm() {
        assertEquals("Testing for logarithm", 2.302585092994046, c.logarithm(10.0), delta);
    }

    @Test
    public void power() {
        assertEquals("Testing for PowerFunction", 8.0, c.power(2.0, 3.0), delta);
        assertNotEquals("TNegative test for PowerFunction", 8.0, c.power(0.0, 0.0), delta);
    }


}