import Calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void squareRootTruePositive(){
        assertEquals("Square Root of number for True Positive", 6, calculator.squareRoot(36), DELTA);
        assertEquals("Square Root of number for True Positive", 12, calculator.squareRoot(144), DELTA);
        assertEquals("Square Root of number for True Positive", 9, calculator.squareRoot(81), DELTA);
        assertEquals("Square Root of number for True Positive", 20, calculator.squareRoot(400), DELTA);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Square Root of number for False Positive", 5, calculator.squareRoot(20), DELTA);
        assertNotEquals("Square Root of number for False Positive", 20.3, calculator.squareRoot(400), DELTA);
    }

    @Test
    public void factorialTruePositive(){
        assertEquals("Factorial of number for True Positive", 5040, calculator.factorial(7), DELTA);
        assertEquals("Factorial of number for True Positive", 120, calculator.factorial(5), DELTA);
        assertEquals("Factorial of number for True Positive", 720, calculator.factorial(6), DELTA);
        assertEquals("Factorial of number for True Positive", 2, calculator.factorial(2), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Factorial of number for False Positive", 5045, calculator.factorial(7), DELTA);
        assertNotEquals("Factorial of number for False Positive", 720.8, calculator.factorial(6), DELTA);
    }

    @Test
    public void naturalLogTruePositive(){
        assertEquals("Natural Log of number for True Positive", 0, calculator.naturalLog(1), DELTA);
        assertEquals("Natural Log of number for True Positive", 2.70, calculator.naturalLog(15), DELTA);
        assertEquals("Natural Log of number for True Positive", 4.60, calculator.naturalLog(100), DELTA);
        assertEquals("Natural Log of number for True Positive", 3.80, calculator.naturalLog(45), DELTA);
    }

    @Test
    public void naturalLogFalsePositive(){
        assertNotEquals("Natural Log of number for False Positive", 1, calculator.naturalLog(1), DELTA);
        assertNotEquals("Natural Log of number for False Positive", 2.45, calculator.naturalLog(15), DELTA);
    }

    @Test
    public void powerFunctionTruePositive(){
        assertEquals("Power Function of number for True Positive", 8, calculator.powerFunction(2, 3), DELTA);
        assertEquals("Power Function of number for True Positive", 1, calculator.powerFunction(0, 0), DELTA);
        assertEquals("Power Function of number for True Positive", 1, calculator.powerFunction(78, 0), DELTA);
        assertEquals("Power Function of number for True Positive", 27, calculator.powerFunction(3, 3), DELTA);
    }

    @Test
    public void powerFunctionFalsePositive(){
        assertNotEquals("Power Function of number for False Positive", 5, calculator.powerFunction(1,5), DELTA);
        assertNotEquals("Power Function of number for False Positive", 8, calculator.powerFunction(2,4), DELTA);
        assertNotEquals("Power Function of number for False Positive", 0, calculator.powerFunction(1, 1), DELTA);
        assertNotEquals("Power Function of number for False Positive", -1, calculator.powerFunction(-1, 0), DELTA);
    }
}
