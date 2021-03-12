import Calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void squareRootTruePositive(){
        assertEquals("Square Root of number for True Positive", 4, calculator.squareRoot(16), DELTA);
        assertEquals("Square Root of number for True Positive", 10, calculator.squareRoot(100), DELTA);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Square Root of number for False Positive", 6, calculator.squareRoot(16), DELTA);
        assertNotEquals("Square Root of number for False Positive", 10.3, calculator.squareRoot(100), DELTA);
    }

    @Test
    public void factorialTruePositive(){
        assertEquals("Factorial of number for True Positive", 720, calculator.factorial(6), DELTA);
        assertEquals("Factorial of number for True Positive", 120, calculator.factorial(5), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Factorial of number for False Positive", 720.63, calculator.factorial(6), DELTA);
        assertNotEquals("Factorial of number for False Positive", 121, calculator.factorial(5), DELTA);
    }

    @Test
    public void naturalLogTruePositive(){
        assertEquals("Natural Log of number for True Positive", 0, calculator.naturalLog(1), DELTA);
        assertEquals("Natural Log of number for True Positive", 2.302585092994046, calculator.naturalLog(10), DELTA);
    }

    @Test
    public void naturalLogFalsePositive(){
        assertNotEquals("Natural Log of number for False Positive", 1, calculator.naturalLog(1), DELTA);
        assertNotEquals("Natural Log of number for False Positive", 2.23, calculator.naturalLog(10), DELTA);
    }

    @Test
    public void powerFunctionTruePositive(){
        assertEquals("Power Function of number for True Positive", 1, calculator.powerFunction(1, 3), DELTA);
        assertEquals("Power Function of number for True Positive", 1, calculator.powerFunction(0, 0), DELTA);
        assertEquals("Power Function of number for True Positive", 1, calculator.powerFunction(10, 0), DELTA);
        assertEquals("Power Function of number for True Positive", 1024, calculator.powerFunction(2, 10), DELTA);
    }

    @Test
    public void powerFunctionFalsePositive(){
        assertNotEquals("Power Function of number for False Positive", 2, calculator.powerFunction(1,2), DELTA);
        assertNotEquals("Power Function of number for False Positive", 1, calculator.powerFunction(2,1), DELTA);
        assertNotEquals("Power Function of number for False Positive", 0, calculator.powerFunction(1, 0), DELTA);
        assertNotEquals("Power Function of number for False Positive", -1, calculator.powerFunction(-1, 0), DELTA);
    }
}
