package PartOne;
import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size from user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create array
        int[] arr = new int[n];

        // Get array elements from user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Get element to remove
        System.out.print("Enter the element to remove: ");
        int elementToRemove = scanner.nextInt();

        // Remove all occurrences
        int[] result = removeAllOccurrences(arr, elementToRemove);

        // Display result
        if (result.length == 0) {
            System.out.println("Array is empty after removal.");
        } else {
            System.out.println("Array after removing all occurrences of " + elementToRemove + ":");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static int[] removeAllOccurrences(int[] arr, int element) {
        // Count elements to keep
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != element) {
                count++;
            }
        }

        // Create new array with remaining elements
        int[] newArr = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != element) {
                newArr[index] = arr[i];
                index++;
            }
        }

        return newArr;
    }
}