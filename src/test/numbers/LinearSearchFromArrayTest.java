package test.numbers;

import main.numbers.LinearSearchFromArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinearSearchFromArrayTest {
    @Test
    public void testLinearWithNonExisting() {
        LinearSearchFromArray searcher = new LinearSearchFromArray();
        Integer[]             haystack = {1, 2, 3, 4};
        assertEquals(-1, searcher.linearSearchFromArray(12, haystack));
    }
    
    @Test
    public void testLinearWithExisting() {
        LinearSearchFromArray searcher = new LinearSearchFromArray();
        Integer[]             haystack = {1, 2, 12, 3, 4};
        assertEquals(2, searcher.linearSearchFromArray(12, haystack));
    }
}
