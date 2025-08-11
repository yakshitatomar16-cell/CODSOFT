package task2.gradecalculator;
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[]args){

        // creates a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        //Take Student name input
        System.out.println("Enter student's name: ");
        String studentName = sc.nextLine();

        //take number of subjects
        System.out.println("How many subjects do you have?");
        int subjectCount = sc.nextInt();

        //Declare array marks and total sum
        float[]marks = new float[subjectCount];
        float sum = 0;

        //Input marks for each subject
        for(int i=0; i<subjectCount; i++){
            System.out.println("Enter marks for subject " + (i+1) + ": ");
            marks[i] = sc.nextFloat();
            sum += marks[i];
        }

        //Calculate average percentage
        float percentage = sum / subjectCount;

        //Grade calculation logic
        String grade;
        if(percentage >= 95) {
            grade = "O+";
        } else if (percentage >= 90) {
            grade = "O";
        } else if (percentage >= 85) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B+";
        } else if (percentage >= 75) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        //Displaying result
        System.out.println("\n====== Result Summary ======");
        System.out.println("Student Name: " +studentName);
        System.out.println("Total marks obtained: " + sum);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " +grade);

        sc.close();
    }
}
