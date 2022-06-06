import java.util.Scanner;

public class IsNumPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number to check if it is a palindrome: ");
        int number = scanner.nextInt();
        System.out.println("Is " + number + " a Palindrome number? Answer: " + (isPalindrome(number) == true ? "true" : "false"));

    }

    static int reverseDigits(int num) {
        int reverse_Number = 0;
        while (num > 0) {
            reverse_Number = reverse_Number * 10 + num % 10;
            num = num / 10;
        }

        return reverse_Number;
    }

    static boolean isPalindrome(int n) {


        int rev_n = reverseDigits(n);

        if (rev_n == n)
            return true;
        else
            return false;
    }
}
