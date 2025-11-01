package PartTwo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an ArrayList to store the elements
        ArrayList<Integer> numbers = new ArrayList<>();

        // Get elements from the user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        // Ask for the element to remove
        System.out.print("Enter the element to remove: ");
        int elementToRemove = scanner.nextInt();

        // Remove all occurrences of that element
        removeAllOccurrences(numbers, elementToRemove);

        // Display the updated list
        if (numbers.isEmpty()) {
            System.out.println("Array is empty after removal.");
        } else {
            System.out.println("Array after removing all occurrences of " + elementToRemove + ":");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    // Method to remove all occurrences of a specific element
    public static void removeAllOccurrences(ArrayList<Integer> list, int element) {
        // Use removeIf to delete all matching elements in one go
        list.removeIf(num -> num == element);
    }
}
