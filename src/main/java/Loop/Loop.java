package Loop;

public class Loop {
    public static void main(String[] main) {
        int number = 1;
        while (true) {
            System.out.println(number);
            if (number >= 5) {
                break;
            }
            number = number + 1;
        }
        System.out.println("Ready!");
    }
}