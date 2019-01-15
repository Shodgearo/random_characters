import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String s = "";
        String result = "";

        do {
            System.out.print("Typed quantity characters (typed 0 for exit): ");

            s = scan.next();

            try {
                int x = Integer.parseInt(s);

                while (x > 0) {
                    result += (char) rand.nextInt(127);
                    x--;
                }
            } catch (NumberFormatException exc) {
                System.out.println("Enter number, please.");
            }

            System.out.println(result);
        } while (!s.equals("0"));
    }
}