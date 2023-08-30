package IFELSE;

import java.util.Scanner;
public class NumberChecker {
    public static void main (String[] args) {
        Scanner input  = new Scanner(System.in);

    System.out.print("Enter the number: ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " Its even number");
        } else {
            System.out.println(number + " Its odd number ");
        }

        if (number > 0) {
            System.out.println( number + " Its positive number");
        } else if (number < 0) {
            System.out.println(number + " Its negative number");
        } else {
            System.out.println("You enter null");
        }

        boolean isPrime = true ;
        for (int i = 2; i <= number / 2 ; ++i) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(number + " Its prime number");
        else
            System.out.println(number + " Its composite number");
    }
}