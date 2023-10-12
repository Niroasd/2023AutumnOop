package week5;

import java.util.Arrays;
import java.util.Scanner;

public class Asterisks {
    public static void main(String[] args) {
        int[] intArray = { 0, 0, 0, 0, 0 };

        displayAsterisks(fillArray(intArray));
    }

    public static int[] fillArray(int[] arrToFill) {
        int[] xArr = arrToFill;
        Scanner scInput = new Scanner(System.in);
        int index = 0;

        while (index < 5) {
            System.out.println("Give integer to add to list.");
            int x = scInput.nextInt();
            xArr[index] = x;
            index++;
        }

        return xArr;
    }

    public static void displayAsterisks(int[] inputArr) {
        int[] xArr = inputArr;

        for (int i = 0; i < xArr.length; i++) {
            String asterisks = "";
            int x = xArr[i];
            for (int j = 0; j < x; j++) {
                asterisks += "*";
            }
            System.out.println(asterisks);
        }
    }
}
