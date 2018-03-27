package Quadratic_equation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x1 = 0;
        double x2 = 0;
        boolean flag = true;

        while (flag) {
            System.out.println("Quadratic equation viev is: ax² + bx + c = 0. Enter 666 to exit or just enter a: ");
            int a = sc.nextInt();
            if (a == 666) {
                flag = false;
                continue;
            }
            if (a == 0) {
                System.out.println(" If a = 0 it is not a uadratic equation!!!");
                continue;
            }
            System.out.println("b is: ");
            int b = sc.nextInt();
            System.out.println("c is: ");
            int c = sc.nextInt();

            if (a != 0 && b != 0 && c != 0) {
                double d = Math.pow(b, 2) - 4 * a * c;
                if (d > 0) {
                    x1 = (-b + Math.sqrt(d)) / (2 * a);
                    x2 = (-b - Math.sqrt(d)) / (2 * a);
                    System.out.println("Answer for your equation is: " + x1 + " and " + x2 + ".");
                } else if (d == 0) {
                    x1 = -b / 2 * a;
                    System.out.println("Answer for your equation is: " + x1 + ".");
                } else {
                    System.out.println("Your equation has no answers");
                }
            } else if (c == 0 && b != 0) {
                x1 = 0;
                x2 = -b / a;
                System.out.println("Your answers are: " + x1 + " and " + x2 + ".");
            } else if (a != 0 && b == 0 && c != 0) {
                x1 = Math.sqrt(c / a);
                x2 = -1 * x1;
                System.out.println("Your answers are: " + x1 + " and " + x2 + ".");
            }
        }
    }
}