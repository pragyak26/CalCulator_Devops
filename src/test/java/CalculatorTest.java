import calculator.Calculator;
import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    private static final double delta = 1e-15;
    Calculator c = new Calculator();

    @Test
    public void squareRootPositive() {
        assertEquals("Testing True Positive for squareRoot", 5.0, c.squareRoot(25.0), delta);
        assertEquals("Testing for True Negative for squareRoot", Double.NaN, c.squareRoot(-25.0), delta);
    }

    @Test
    public void squareRootNegative() {
        assertNotEquals("Testing False Negative for squareRoot", 6.0, c.squareRoot(-24.0), delta);
        assertNotEquals("Testing for False Positives for squareRoot", Double.NaN, c.squareRoot(36.0), delta);
    }

    @Test
    public void factorialPositive() {
        assertEquals("Testing True Positive for factorial", 24.0, c.factorial(4.0), delta);
        assertEquals("Testing for True Negative for factorial", Double.NaN, c.factorial(-25.0), delta);

    }

    @Test
    public void factorialNegative() {
        assertNotEquals("Testing False Negative for factorial", 6.0, c.factorial(-24.0), delta);
        assertNotEquals("Testing for False Positives for factorial", Double.NaN, c.factorial(36.0), delta);
    }

    @Test
    public void logarithmPositive() {
        assertEquals("Testing True Positive for logarithm", 2.302585092994046, c.logarithm(10.0), delta);
        assertEquals("Testing for True Negative for logarithm", Double.NaN, c.logarithm(-25.0), delta);
    }

    @Test
    public void logarithmNegative() {
        assertNotEquals("Testing False Negative for logarithm", 6.0, c.logarithm(-24.0), delta);
        assertNotEquals("Testing for False Positives for logarithm", Double.NaN, c.logarithm(36.0), delta);
    }

    @Test
    public void powerPositive() {
        assertEquals("Testing True Positive for PowerFunction", 8.0, c.power(2.0, 3.0), delta);
        assertEquals("Testing True Negative for PowerFunction", 0.125, c.power(2.0, -3.0), delta);
    }

    @Test
    public void powerNegative() {
        assertNotEquals("Testing False Negative for PowerFunction", 8.0, c.power(0.0, 0.0), delta);
        assertNotEquals("Testing False Positive for PowerFunction", 6.0, c.power(2.0, -3.0), delta);
    }

}