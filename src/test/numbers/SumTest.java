package test.numbers;

import main.numbers.Sum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {
    @Test
    public void testMultiplesOfFifteen() {
        Sum summer = new Sum();
        assertEquals(3 + 5 + 6 + 9 + 10 + 12 + 15 + 15, summer.sum(15));
    }
}
