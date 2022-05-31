package test.fizzbuzz;

import main.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;
    
    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }
    
    @Test
    public void ofZeroIsZero() {
        assertEquals("0", fizzBuzz.of(0));
    }
    
    @Test
    public void ofOneIsOne() {
        assertEquals("1", fizzBuzz.of(1));
    }
    
    @Test
    public void ofThreeIsFizz() {
        assertEquals("Fizz", fizzBuzz.of(3));
    }
    
    @Test
    public void ofFiveIsBuzz() {
        assertEquals("Buzz", fizzBuzz.of(5));
    }
    
    @Test
    public void ofFifteenIsFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.of(15));
    }
    
    @Test
    public void ofFortyFiveIsFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.of(45));
    }
    
    @Test
    public void ofFiftyIsFizz() {
        assertEquals("Buzz", fizzBuzz.of(50));
    }
    
    @Test
    public void ofNinetyNineIsFizz() {
        assertEquals("Fizz", fizzBuzz.of(99));
    }
    
    @Test
    public void ofHundredIsBuzz() {
        assertEquals("Buzz", fizzBuzz.of(100));
    }
    
    /**
     * Just a simple visual for a printed list of FizzBuzz
     */
    @Test
    public void print() {
        fizzBuzz.print();
    }
}
