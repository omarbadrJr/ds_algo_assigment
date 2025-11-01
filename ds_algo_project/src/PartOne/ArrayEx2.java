package PartOne;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ask user for array size
        System.out.print("Enter number of elements: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        // read sorted elements
        System.out.println("Enter the sorted elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        // remove duplicates
        int[] cleanArr = removeDuplicates(arr);

        // print result
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < cleanArr.length; i++) {
            System.out.print(cleanArr[i] + " ");
        }
        System.out.println();

        input.close();
    }

    public static int[] removeDuplicates(int[] arr) {
        if (arr.length == 0)
            return arr;

        // count unique values
        int unique = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                unique++;
            }
        }

        // store unique values
        int[] result = new int[unique];
        result[0] = arr[0];
        int index = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result[index++] = arr[i];
            }
        }

        return result;
    }
}
