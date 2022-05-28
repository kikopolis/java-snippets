package test.numbers;

import main.numbers.FindMaximum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMaximumTest {
    @Test
    public void testMaximum() {
        FindMaximum finder   = new FindMaximum();
        Integer[]   haystack = {19, 27, 31, 47, 64, 34, 59, 63};
        assertEquals(64, finder.maximum(haystack));
    }
    
    @Test
    public void testMaximumTwo() {
        FindMaximum finder   = new FindMaximum();
        int[]       haystack = {19, 27, 31, 47, 64, 34, 59, 63};
        assertEquals(64, finder.maximumTwo(haystack));
    }
}
