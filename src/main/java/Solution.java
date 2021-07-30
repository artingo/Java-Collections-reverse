import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alfie", "Betty", "Caty", "Dora", "Emilie", "Frida");
        System.out.println("Names = " + names);
        reverseOrder(names);
        System.out.println("Names = " + names);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610);
        System.out.println("\nnumbers = " + numbers);
        reverseOrder(numbers);
        System.out.println("numbers = " + numbers);

        List<Double> doubles = Arrays.asList(-0.9998, -0.7071, 0.0, 0.3746, 0.7660);
        System.out.println("\ndoubles = " + doubles);
        reverseOrder(doubles);
        System.out.println("doubles = " + doubles);
    }

    /**
     * Function that that reverses the order of the elements in a list.
     * @param aList - a List of objects
     */
    public static void reverseOrder(List aList) {
        for (int i = 0; i < aList.size() / 2; i++) {
            Object temp = aList.get(i);
            aList.set(i, aList.get(aList.size() - i - 1));
            aList.set(aList.size() - i - 1, temp);
        }
    }
}
