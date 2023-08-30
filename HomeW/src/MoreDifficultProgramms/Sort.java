package MoreDifficultProgramms;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Original array: ");
        printArray(array);

        // Сортування від найменшого до найбільшого
        Arrays.sort(array);
        System.out.println("Sorted array in ascending order: ");
        printArray(array);

        // Сортування від найбільшого до найменшого
        Arrays.sort(array);
        reverseArray(array);
        System.out.println("Sorted array in descending order: ");
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Зворотнє сортування масиву
    private static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
