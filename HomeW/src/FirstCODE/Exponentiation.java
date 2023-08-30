package FirstCODE;

import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int base = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int exponent = scanner.nextInt();

        double result = Math.pow(base, exponent);

        System.out.println("Результат піднесення до степеня: " + result);
    }
}
