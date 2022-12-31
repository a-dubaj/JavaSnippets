package Calculating;

import java.util.Scanner;

/**
 *
 * @author coffeina
 */

public class Calculating {
    public static void main(String[] main){
        Scanner scanner = new Scanner(System.in);
        
        int first = 1;
        int second = 2;
       
        first = Integer.valueOf(scanner.nextLine());
        second = Integer.valueOf(scanner.nextLine());
        
        int product = first * second;
        System.out.println("The product of " + first + " and " + second + " is " + product);
    }
}
