package test.strings;

import main.strings.StringReverser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReverserTest {
    @Test
    public void testReverse() {
        StringReverser reverser = new StringReverser();
        assertEquals("esrever", reverser.reverse("reverse"));
    }
    
    @Test
    public void testReverseTwo() {
        StringReverser reverser = new StringReverser();
        assertEquals("esrever", reverser.reverseTwo("reverse"));
    }
}
