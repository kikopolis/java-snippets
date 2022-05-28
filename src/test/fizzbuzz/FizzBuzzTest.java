package test.fizzbuzz;

import main.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void ofZeroIsZero() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("0", fizzBuzz.of(0));
    }
    
    @Test
    public void ofOneIsOne() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.of(1));
    }
    
    @Test
    public void ofThreeIsFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.of(3));
    }
    
    @Test
    public void ofFiveIsBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.of(5));
    }
    
    @Test
    public void ofFifteenIsFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.of(15));
    }
    
    @Test
    public void ofFortyFiveIsFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.of(45));
    }
    
    @Test
    public void ofFiftyIsFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.of(50));
    }
    
    @Test
    public void ofNinetyNineIsFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.of(99));
    }
    
    @Test
    public void ofHundredIsBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.of(100));
    }
    
    /**
     * Just a simple visual for a printed list of FizzBuzz
     */
    @Test
    public void print() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.print();
    }
}
