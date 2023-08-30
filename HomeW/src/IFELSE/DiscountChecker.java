package IFELSE;

import java.util.Scanner;

public class DiscountChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price for one item: ");
        double itemPrice = scanner.nextDouble();

        System.out.print("Enter the quantity of items: ");
        int quantity = scanner.nextInt();

        double totalPriceWithoutDiscount = itemPrice * quantity;

        double discount = 0;


        if (quantity > 80) {
            discount = 0.13;
        } else if (quantity > 30) {
            int additionalItems = quantity - 30;
            discount = 0.12 + additionalItems * 0.004;
        } else if (quantity > 20) {
            discount = 0.10;
        } else if (quantity > 10) {
            discount = 0.05;
        }

        double totalPriceWithDiscount = totalPriceWithoutDiscount * (1 - discount);

        System.out.println("Total sum with discount: " + totalPriceWithDiscount);
        System.out.println("Total sum without discount: " + totalPriceWithoutDiscount);
        System.out.println("Discount: " + (discount * 100) + "%");
    }
}
