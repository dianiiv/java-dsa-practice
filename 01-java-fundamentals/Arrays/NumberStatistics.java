import java.util.Arrays;
public class NumberStatistics {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 27, 8, 16, 3, 20};
        Arrays.sort(numbers);
        int median = numbers[numbers.length /2];
        System.out.println(Arrays.toString(numbers));
        System.out.println("The median number is: " + numbers[3]);

    }
}
