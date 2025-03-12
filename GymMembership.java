import java.util.Scanner;

public class GymMembership {


    int age;
    String name;
    int duration;
    boolean isActive;
    int fee;
    int prfee;


    void inputValues() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the member's name: ");
        name = scanner.nextLine();

        System.out.print("Enter the member's age: ");
        age = scanner.nextInt();

        System.out.print("Enter the membership duration (in months): ");
        duration = scanner.nextInt();

        System.out.print("Is the member active? (true/false): ");
        isActive = scanner.nextBoolean();

        System.out.print("Enter the membership fee (monthly): ");
        fee = scanner.nextInt();

        System.out.print("Enter the promotional fee (if any): ");
        prfee = scanner.nextInt();


    }


    int calculateTotalFee() {
        int totalFee = fee * duration;


        if (isActive) {
            totalFee -= prfee;
        }

        return totalFee;
    }


    void displayValues() {
        System.out.println("\nMember Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Active Member: " + (isActive ? "Yes" : "No"));
        System.out.println("Membership Fee (Monthly): " + fee);
        System.out.println("Promotional Fee: " + prfee);
        System.out.println("Total Fee: " + calculateTotalFee());
    }

    // Main method to run the program
    public static void main(String[] args) {
        GymMembership member = new GymMembership();
        member.inputValues();
        member.displayValues();
    }
}

/*"C:\Program Files\Java\jdk-22\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.4\lib\idea_rt.jar=58412" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Admin\IdeaProjects\1BM23AI121\out\production\1BM23AI121 GymMembership
Enter the member's name: prerna
Enter the member's age: 19
Enter the membership duration (in months): 6
Is the member active? (true/false): true
Enter the membership fee (monthly): 2000
Enter the promotional fee (if any): 500

Member Details:
Name: prerna
Age: 19
Duration: 6 months
Active Member: Yes
Membership Fee (Monthly): 2000
Promotional Fee: 500
Total Fee: 11500

Process finished with exit code 0*/

