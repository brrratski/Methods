import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number: ");
        int number = scanner.nextInt();
        System.out.println("Is " + number + " an even number? Answer: " + (isEven(number) == true ? "true" : "false"));
    }
    public static boolean isEven(int number) {

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }
}
