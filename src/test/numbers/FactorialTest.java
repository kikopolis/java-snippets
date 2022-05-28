package test.numbers;

import main.numbers.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    public void testFactorial() {
        Factorial factorial = new Factorial();
        assertEquals(24, factorial.calculate(4));
    }
}
