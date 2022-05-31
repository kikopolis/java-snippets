package test.strings;

import main.strings.StringReverser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReverserTest {
    private StringReverser reverser;
    
    @BeforeEach
    void setUp() {
        reverser = new StringReverser();
    }
    
    @Test
    public void testReverse() {
        assertEquals("esrever", reverser.reverse("reverse"));
    }
    
    @Test
    public void testReverseTwo() {
        assertEquals("esrever", reverser.reverseTwo("reverse"));
    }
}
