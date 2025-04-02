import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ScoreEntry {
    int score;
}

public class Records_arrlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<ScoreEntry> entryList = new ArrayList<>();
        int totalScore = 0;
        int highestScore = 0;

        System.out.println("Enter the scores for " + n + " students:");

        for (int i = 0; i < n; i++) {
            ScoreEntry entry = new ScoreEntry();
            System.out.print("Enter score for student " + (i + 1) + ": ");
            entry.score = scanner.nextInt();
            scanner.nextLine();

            entryList.add(entry);

            totalScore += entry.score;

            if (entry.score > highestScore) {
                highestScore = entry.score;
            }
        }

        System.out.println("\nTotal score of all students: " + totalScore);
        System.out.println("Highest score among all students: " + highestScore);

        scanner.close();
    }
}