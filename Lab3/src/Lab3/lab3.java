package Lab3;
import java.util.Scanner;

public class lab3 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter student name: ");
		        String studentName = scanner.nextLine();

		        System.out.print("Enter total marks: ");
		        double totalMarks = scanner.nextDouble();

		        System.out.print("Enter obtained marks: ");
		        double obtainedMarks = scanner.nextDouble();

		        double percentage = calculatePercentage(obtainedMarks, totalMarks);
		        String grade = calculateGrade(percentage);
		        double gpa = calculateGPA(percentage);

		        System.out.println("\n=========== MARK SHEET ===========");
		        System.out.println("Student Name : " + studentName);
		        System.out.println("Total Marks  : " + totalMarks);
		        System.out.println("Obtained Marks : " + obtainedMarks);
		        System.out.printf("Percentage   : %.2f%%\n", percentage);
		        System.out.println("Grade        : " + grade);
		        System.out.printf("GPA          : %.2f\n", gpa);
		        System.out.println("==================================");

		        scanner.close();
		    }

		    private static double calculatePercentage(double obtainedMarks, double totalMarks) {
		        return (obtainedMarks / totalMarks) * 100;
		    }

		    private static String calculateGrade(double percentage) {
		        if (percentage >= 90) {
		            return "A";
		        } else if (percentage >= 80) {
		            return "B";
		        } else if (percentage >= 70) {
		            return "C";
		        } else if (percentage >= 60) {
		            return "D";
		        } else {
		            return "F";
		        }
		    }

		    private static double calculateGPA(double percentage) {
		        if (percentage >= 90) {
		            return 4.0;
		        } else if (percentage >= 80) {
		            return 3.5;
		        } else if (percentage >= 70) {
		            return 3.0;
		        } else if (percentage >= 60) {
		            return 2.5;
		        } else {
		            return 0.0;
		        }
		    }

	   }



