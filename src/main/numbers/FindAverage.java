package main.numbers;

import java.util.List;

public class FindAverage {
    public Double average(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return (double) (sum / list.size());
    }
}
