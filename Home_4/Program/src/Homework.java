import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Homework {
    public static void main(String[] args) {
        Homework hw = new Homework();

        Deque result = hw.multiple(new ArrayDeque(Arrays.asList(1, 1, 1)), new ArrayDeque(Arrays.asList(0, 0, 1)));
        System.out.println(result);

        result = hw.sum(new ArrayDeque(Arrays.asList(-5,-2)), new ArrayDeque(Arrays.asList(5)));
        System.out.println(result);
    }

    public Deque multiple(Deque d1, Deque d2) {
        Integer[] numbers = new Integer[Math.max(d1.size(), d2.size())];

        for(int i = 0; i < numbers.length; i++) {
            int num1 = (d1.isEmpty()) ? 0 : (int) d1.removeFirst();
            int num2 = (d2.isEmpty()) ? 0 : (int) d2.removeFirst();

            numbers[i] = num1 * num2;
        }

        return new ArrayDeque(Arrays.asList(numbers));
    }

    public Deque sum(Deque d1, Deque d2){
        Integer[] numbers = new Integer[Math.max(d1.size(), d2.size())];

        for(int i = 0; i < numbers.length; i++) {
            int num1 = (d1.isEmpty()) ? 0 : (int) d1.removeFirst();
            int num2 = (d2.isEmpty()) ? 0 : (int) d2.removeFirst();

            numbers[i] = num1 + num2;
        }

        return new ArrayDeque(Arrays.asList(numbers));
    }
}