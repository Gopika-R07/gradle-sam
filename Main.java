
package org.example;

import java.util.Scanner;

// ==================================================
// QUESTION 21: SIMPLE INTEREST
// Class Name: Main
// ==================================================

public class Main {

    public static double calculateSimpleInterest(
            double principal, double rate, double time) {

        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        double si = calculateSimpleInterest(
                principal, rate, time);

        System.out.println("Simple Interest = " + si);
    }
}


// ==================================================
// QUESTION 22: AVERAGE OF FIVE NUMBERS
// Class Name: Average
// ==================================================

class Average {

    public static double calculateAverage(int[] numbers) {

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += numbers[i];
        }

        return (double) sum / 5;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter five numbers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        double average = calculateAverage(numbers);

        System.out.println("Average = " + average);
    }
}


// ==================================================
// QUESTION 23: VOWEL OR CONSONANT
// Class Name: VowelConsonant
// ==================================================

class VowelConsonant {

    public static String checkCharacter(char ch) {

        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {

            return "Vowel";

        } else if (ch >= 'a' && ch <= 'z') {

            return "Consonant";

        } else {

            return "Invalid character";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        System.out.println(checkCharacter(ch));
    }
}


// ==================================================
// QUESTION 24: AREA AND PERIMETER OF RECTANGLE
// Class Name: Rectangle
// ==================================================

class Rectangle {

    public static double calculateArea(
            double length, double breadth) {

        return length * breadth;
    }

    public static double calculatePerimeter(
            double length, double breadth) {

        return 2 * (length + breadth);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        double length = sc.nextDouble();

        System.out.print("Enter Breadth: ");
        double breadth = sc.nextDouble();

        System.out.println(
                "Area = " + calculateArea(length, breadth));

        System.out.println(
                "Perimeter = "
                + calculatePerimeter(length, breadth));
    }
}
