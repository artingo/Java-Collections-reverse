import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void reverseOrder_names() {
        List<String> names = Arrays.asList("Alfie", "Betty", "Caty", "Dora", "Emilie", "Frida");
        List<String> names2 = new ArrayList<>(names);
        Collections.reverse(names2);
        Solution.reverseOrder(names);
        assertEquals(names, names2);
    }

    @Test
    void reverseOrder_numbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610);
        List<Integer> numbers2 = new ArrayList<>(numbers);
        Collections.reverse(numbers2);
        Solution.reverseOrder(numbers);
        assertEquals(numbers, numbers2);
    }

    @Test
    void reverseOrder_doubles() {
        List<Double> doubles = Arrays.asList(-0.9998, -0.7071, 0.0, 0.3746, 0.7660);
        List<Double> doubles2 = new ArrayList<>(doubles);
        Collections.reverse(doubles2);
        Solution.reverseOrder(doubles);
        assertEquals(doubles, doubles2);
    }
}