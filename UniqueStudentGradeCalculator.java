import java.util.Scanner;

public class UniqueStudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input the number of subjects
        System.out.print("Enter the number of subjects: ");
        int subjectCount = scanner.nextInt();

        // Initialize total marks
        int totalMarks = 0;

        // Step 2: Input marks for each subject
        for (int i = 0; i < subjectCount; i++) {
            System.out.print("Enter the marks for subject " + (i + 1) + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        // Step 3: Calculate the average percentage
        double averagePercentage = (double) totalMarks / subjectCount;

        // Step 4: Determine the grade based on the average percentage
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Step 5: Display the results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
