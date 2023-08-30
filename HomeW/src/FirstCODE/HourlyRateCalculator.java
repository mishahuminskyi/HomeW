package FirstCODE;

import java.util.Scanner;

public class HourlyRateCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість робочих годин на тиждень: ");
        int weeklyHours = scanner.nextInt();

        System.out.print("Введіть річну зарплату з податками: ");
        int annualSalaryWithTax = scanner.nextInt();

        System.out.print("Введіть відсоток податку: ");
        int taxPercentage = scanner.nextInt();

        int workHoursPerMonth = weeklyHours * 4;
        int workHoursPerYear = workHoursPerMonth * 12;

        double hourlyRateWithoutTax = (double) annualSalaryWithTax / workHoursPerYear / (100 - taxPercentage) * 100;

        System.out.println("При " + weeklyHours + " робочих годинах на тиждень з річною зарплатою в " + annualSalaryWithTax + " та податком " + taxPercentage + "%");
        System.out.println("Година часу коштує " + hourlyRateWithoutTax);
    }
}
