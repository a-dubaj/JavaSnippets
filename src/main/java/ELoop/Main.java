package ELoop;

import java.util.Scanner;

public class Main {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Exit? (y exit)");
            String input = scanner.nextLine();
            if (input.equals("y")) {
                break;
            }
            System.out.println("Ok! Let's carry on.;");
        }
        System.out.println("Ready");
    }
}
