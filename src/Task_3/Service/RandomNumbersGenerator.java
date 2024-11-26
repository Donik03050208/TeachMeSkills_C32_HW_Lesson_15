package Task_3.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbersGenerator {

    public static List<Integer> generateRandomNumbers(int size, int bound) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(bound));
        }
        return numbers;
    }
}
