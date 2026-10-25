public class SmallestNumber {
    public static void main (String[] args){
        int[] numbers = {14, 6, 19, 2, 11};
        int max = numbers[0];
        int sum = 0;

        sum += numbers[0];

        for (int i = 1; i < numbers.length; i++){

            if(numbers[i] > max){
                max = numbers[i];
            }
            sum += numbers[i];
        }

        System.out.println("The maximum number in the array is: " + max);
        System.out.println("The sum of all array numbers is: " + sum);


    }
}
