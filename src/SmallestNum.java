import java.util.Scanner;

public class SmallestNum {
    public static void SmallestNum() {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < b && b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }


    public static void main(String[] args) {
        SmallestNum();


    }


}

