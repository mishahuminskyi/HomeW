package IFELSE;

import java.util.Scanner;

public class SALARYCHECKER {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter hourly rate: ");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Enter the tax percentage: ");
        double taxPercentage = scanner.nextDouble();

        int workingDays = calculateWorkingDays(month);

        double salaryWithoutTax = hourlyRate * workingDays * 8;
        double taxAmount = salaryWithoutTax * (taxPercentage / 100);
        double salaryWithTax = salaryWithoutTax - taxAmount;

        System.out.println("Salary for one month without tax: " + salaryWithoutTax);
        System.out.println("Salary for month with tax: " + salaryWithTax);
    }

    static int calculateWorkingDays(int month){
        int startDayOfWeek = calculateStartDayOfWeek(month);
        int daysInMonth = calculateDaysInMonth(month);
        int workingDays = 0;

        for (int day = 1; day <= daysInMonth; day++) {
            if (startDayOfWeek == 1 || startDayOfWeek >= 5){
                workingDays++;
            }

            startDayOfWeek = (startDayOfWeek % 7) + 1;
        }
        return workingDays;
    }

    static int calculateStartDayOfWeek(int month) {
        return 1;
    }

    static int calculateDaysInMonth(int month){
        return 30;
    }
}
