package FirstCODE;

import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Кількість робочих годин на тиждень: ");
        int hoursPerWeek = scanner.nextInt();

        System.out.print("Вартість години: ");
        int hourlyRate = scanner.nextInt();

        System.out.print("Відсоток податку: ");
        int taxPercentage = scanner.nextInt();

        int weeksPerMonth = 4;
        int monthsPerYear = 12;

 //      Розрахунок без податків
        int salaryPerMonthWithoutTax = hoursPerWeek * hourlyRate * weeksPerMonth;
        int salaryPerYearWithoutTax = salaryPerMonthWithoutTax * monthsPerYear;

 //     Розрахунок з податками
        double taxAmount = salaryPerMonthWithoutTax * (taxPercentage / 100.0);
        int salaryPerMonthWithTax = (int) (salaryPerMonthWithoutTax - taxAmount);
        int salaryPerYearWithTax = salaryPerMonthWithTax * monthsPerYear;

        System.out.println("Зарплатня на місяць без податків: " + salaryPerMonthWithoutTax);
        System.out.println("Зарплатня на місяць з податками: " + salaryPerMonthWithTax);
        System.out.println("Зарплатня на рік без податків: " + salaryPerYearWithoutTax);
        System.out.println("Зарплатня на рік з податками: " + salaryPerYearWithTax);
    }
}
