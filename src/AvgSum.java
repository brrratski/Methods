import java.util.Scanner;

public class AvgSum {
    public static void AvgSum(){
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double sum = (a + b + c) / 3;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        AvgSum();
    }

}
