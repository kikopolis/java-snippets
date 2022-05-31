package test.calculator;

import main.calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator;
    
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    public void additionOfIntegers() {
        assertEquals(4, calculator.add(1, 2, 1));
    }
    
    @Test
    public void additionOfFloats() {
        assertEquals(1.5f, calculator.add(0.75f, 0.75f));
    }
    
    @Test
    public void subtractionOfIntegers() {
        assertEquals(2, calculator.subtract(8, 4, 2));
    }
    
    @Test
    public void subtractionOfFloats() {
        assertEquals(1.5f, calculator.subtract(8.6f, 4.6f, 2.5f), 1);
    }
}
