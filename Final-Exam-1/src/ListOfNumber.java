import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfNumber {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers (enter a negative number to stop):");

        int number;
        while (true) {
            number = scanner.nextInt();

            if (number < 0) {
                break;
            }

            numbers.add(number);
        }

        System.out.println("Input numbers:");
        for (int inputNumber : numbers) {
            System.out.println(inputNumber);
        }

        scanner.close();
    }

}
