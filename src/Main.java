import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String n;

        while (true) {
            System.out.print("Typed quantity characters (typed 0 for exit): ");

            n = scan.next();

            try {
                int x = Integer.parseInt(n);
            } catch (NumberFormatException exc) {
                System.out.println("Enter number, please.");
            }

//                if (n != 0) {
//                    while (n > 0) {
//
//                    }
//                } else break;

            break;
        }
    }
}