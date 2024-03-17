import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int y = scanner.nextInt();

        if (y < 0) {
            System.out.println("The number is negative");
        }
        else if (y == 0) {
            System.out.println("The value equals 0");
        }
        else {
            System.out.println("The number is positive");
        }
    }
}