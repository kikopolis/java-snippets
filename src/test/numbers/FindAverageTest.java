package test.numbers;

import main.numbers.FindAverage;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindAverageTest {
    @Test
    public void testAverage() {
        FindAverage   finder   = new FindAverage();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(2.0, finder.average(list));
    }
}
