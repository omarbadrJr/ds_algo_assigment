package PartTwo;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Get number of elements from user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Get sorted elements from user
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            list.add(element);
        }

        // Remove duplicates
        ArrayList<Integer> result = removeDuplicates(list);

        // Display result
        System.out.println("ArrayList after removing duplicates:");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
        System.out.println();

        scanner.close();
    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return list;
        }

        // Create new ArrayList for unique elements
        ArrayList<Integer> uniqueList = new ArrayList<>();

        // Add first element
        uniqueList.add(list.get(0));

        // Add only elements that differ from previous
        for (int i = 1; i < list.size(); i++) {
            if (!list.get(i).equals(list.get(i - 1))) {
                uniqueList.add(list.get(i));
            }
        }

        return uniqueList;
    }
}