import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 100) + 1;

        System.out.println("Guess the number: ");
        int guess = scanner.nextInt();

        while (guess != secretNumber) {
            System.out.println("Wrong! Try another number: ");

            if (guess > secretNumber) {
                System.out.println("Too high!");
            } else if (guess < secretNumber){
                System.out.println("Too low!");
            }
            guess = scanner.nextInt();
        }
            System.out.println(guess + " is correct!");


    }
}
