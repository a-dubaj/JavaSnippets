package Square;
import java.util.Scanner;

public class Square {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);

        int valueOne = scanner.nextInt();
        int valueTwo = scanner.nextInt();
        int sum = valueTwo + valueOne;

        double square = Math.sqrt(sum);
        System.out.println(square);
    }
}
