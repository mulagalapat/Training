package projectr1;

import java.util.Scanner;

public class project1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 7;
        String[] names = new String[n];
        int[] marks = new int[n];

        // 1. Input student names and marks
        System.out.println("Enter names and marks of 10 students:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + " Name: ");
            names[i] = sc.nextLine();

            System.out.print("Student " + (i + 1) + " Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine(); // consume newline
        }

        // 2. Find Topper
        int max = marks[0];
        int topperIndex = 0;

        for (int i = 1; i < n; i++) {
            if (marks[i] > max) {
                max = marks[i];
                topperIndex = i;
            }
        }

        System.out.println("\nTopper:");
        System.out.println(names[topperIndex] + " with marks " + marks[topperIndex]);

        // 3. Search student by name
        System.out.print("\nEnter student name to search: ");
        String searchName = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                System.out.println("Student Found: " + names[i] + " - Marks: " + marks[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        // 4. Display students with marks > 75
        System.out.println("\nStudents with marks greater than 75:");
        for (int i = 0; i < n; i++) {
            if (marks[i] > 75) {
                System.out.println(names[i] + " - " + marks[i]);
            }
        }

        // 5. Calculate class average
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += marks[i];
        }

        double average = (double) sum / n;
        System.out.println("\nClass Average: " + average);

        // 6. Sort students by marks (ascending order)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (marks[i] > marks[j]) {
                    // swap marks
                    int tempMarks = marks[i];
                    marks[i] = marks[j];
                    marks[j] = tempMarks;

                    // swap corresponding names
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }

        // 7. Display sorted list
        System.out.println("\nStudents sorted by marks:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " - " + marks[i]);
        }

        sc.close();
    }
}