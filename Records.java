import java.util.Scanner;

class Student {
    int marks;
}

public class Records {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        Student[] obj = new Student[n];
        int totalScore = 0;
        int highestScore = 0;

        System.out.println("Enter the marks for " + n + " students:");

        for (int i = 0; i < n; i++) {
            obj[i] = new Student();
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            obj[i].marks = scanner.nextInt();


            totalScore += obj[i].marks;

            if (obj[i].marks > highestScore) {
                highestScore = obj[i].marks;
            }
        }

        System.out.println("Total score of all students: " + totalScore);
        System.out.println("Highest score among all students: " + highestScore);

        scanner.close();
    }
}