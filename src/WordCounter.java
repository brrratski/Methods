import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str1 = scanner.nextLine();
        System.out.print("Number of words in the string: " + countWords1(str1) + "\n");




    }

    public static int countWords1(String str1) {
        int count = 0;
        if (!(" ".equals(str1.substring(0, 1))) || !(" ".equals(str1.substring(str1.length() - 1)))) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == ' ') {
                    count++;
                }
            }
            count = count + 1;
        }

        return count; //
    }




}
