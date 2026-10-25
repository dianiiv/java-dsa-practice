import java.util.Arrays;
public class ArrayAnalyzer {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 27, 8, 16};

        if (numbers.length == 0) {
            System.out.println("The array is empty.");
        }else {
            int max = numbers[0];
            int min = numbers[0];
            int sum = 0;
            double average = 0.0;


            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];

                if (numbers[i] > max) {
                    max = numbers[i];
                } else if (numbers[i] < min) {
                    min = numbers[i];
                }


            }
            average = (double) sum / numbers.length;

            System.out.println("Array: " + Arrays.toString(numbers));
            System.out.println("The maximum number is: " + max);
            System.out.println("The minimum number is: " + min);
            System.out.println("The sum of all numbers in arrays: " + sum);
            System.out.println("The average number of array is: " + average);


        }
    }
}

