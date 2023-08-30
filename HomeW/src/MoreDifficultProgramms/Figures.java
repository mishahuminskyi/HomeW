package MoreDifficultProgramms;

import java.util.Scanner;

public class Figures {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String response;

       do {
           System.out.println("Choose a figure to draw");
           System.out.println("1. Rectangle");
           System.out.println("2. Right-angled triangle (bottom-left)");
           System.out.println("3. Right-angled triangle (bottom-right)");
           System.out.println("4. Triangle");
           System.out.println("Enter the figure number: ");
           int figureChoice = scanner.nextInt();

           switch (figureChoice) {
               case 1:
                   drawRectangle();
                   break;
               case 2:
                   drawRightAngledTriangleLeft();
               case 3:
                   drawRightAngledTriangleRight();
               case 4:
                   drawTriangle(); // Викликаємо метод для малювання трикутника
                   break;
               default:
                   System.out.println("Invalid choice!");
           }

           System.out.print("Do you want to draw another figures? (yep/nah): ");
           response = scanner.next().toLowerCase();
       } while (response.equals("yep"));

       System.out.println("Here we go again!");
    }

    private static void drawRectangle() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawRightAngledTriangleLeft() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

            }
        }

    private static void drawRightAngledTriangleRight() {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("");
            }

            for (int k = 0; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void drawTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.print("");
        }

        for (int k = 0; k < 2 * 1 + 1; k++) {
            System.out.print("*");
        }
        System.out.println();
    }

    }
