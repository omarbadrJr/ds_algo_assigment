package PartOne;

import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ask user for size
        System.out.print("Enter number of elements: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        // read elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        // find sum
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        // print result
        System.out.println("Sum = " + sum);

        input.close();
    }
}
