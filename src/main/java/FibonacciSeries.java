import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {

    private static final int F0 = 0;
    private static final int F1 = 1;

    public static void main(String[] args) {

        int numbersQuantity = 10;
        List<Integer> fibonacciNumbers = calculateNumbers(numbersQuantity);
        for (Integer number : fibonacciNumbers) {
            System.out.print(number + " ");
        }
    }

    public static List<Integer> calculateNumbers(int numbersQuantity) {
        List<Integer> fibonacciNumbers = new ArrayList<Integer>();
        int index = 0;
        fibonacciNumbers.add(F0);
        fibonacciNumbers.add(F1);
        while (index < numbersQuantity) {
            int minusOnePositionNumber = fibonacciNumbers.get(index);
            int minusTwoPositionNumber = fibonacciNumbers.get(index + 1);
            fibonacciNumbers.add(calculateNextNumber(minusOnePositionNumber, minusTwoPositionNumber));
            index++;
        }

        return fibonacciNumbers;
    }

    public static int calculateNextNumber(int minusOnePositionNumber, int minusTwoPositionNumber) {
        return minusOnePositionNumber + minusTwoPositionNumber;
    }
}
