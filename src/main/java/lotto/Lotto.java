package lotto;

import java.util.Collections;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        Collections.sort(numbers);
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public int getNumberOfOverlapping(List<Integer> numbers) {
        int overlapCounter = 0;
        for (int number : numbers) {
            if(this.numbers.contains(number)) {
                overlapCounter++;
            }
        }
        return overlapCounter;
    }
    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    public int getRank(List<Integer> numbers, int bonus) {
        int overlapCounter = getNumberOfOverlapping(numbers);

        if (overlapCounter == 6) {
            return 1;
        }
        if (overlapCounter == 5) {
            if (this.numbers.contains(bonus)) return 2;
            return 3;
        }
        return 8 - overlapCounter;
    }
}
