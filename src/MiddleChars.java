import java.util.Scanner;

public class MiddleChars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = scanner.next();

        int n;
        int max = 0;
        System.out.println("Enter the number of elements you want to present in an array: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        middleCharsOfaString(str);
        maxElementOfArray(n, max, arr);
    }


    public static void middleCharsOfaString(String str) {
        int length = str.length();

        if (length % 2 == 1) {

            char ch1 = str.charAt(length / 2);
            System.out.println("The middle char is:" + ch1);

        } else {

            char ch = str.charAt(length / 2);
            char ch2 = str.charAt((length / 2) - 1);
            System.out.println("The middle characters are :" + ch + " and " + ch2);

        }

    }

    public static void maxElementOfArray(int n, int max, int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("The largest element presented in the array is: " + max);


    }

}