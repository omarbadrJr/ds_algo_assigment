package PartTwo;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Get number of elements from user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Get elements from user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            list.add(element);
        }

        // Calculate sum
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        // Display result
        System.out.println("Sum of ArrayList elements: " + sum);

        scanner.close();
    }
}