package test.numbers;

import main.numbers.FindMaximum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMaximumTest {
    private FindMaximum finder;
    
    @BeforeEach
    void setUp() {
        finder = new FindMaximum();
    }
    
    @Test
    public void testMaximum() {
        Integer[] haystack = {19, 27, 31, 47, 64, 34, 59, 63};
        assertEquals(64, finder.maximum(haystack));
    }
    
    @Test
    public void testMaximumTwo() {
        int[] haystack = {19, 27, 31, 47, 64, 34, 59, 63};
        assertEquals(64, finder.maximumTwo(haystack));
    }
}
