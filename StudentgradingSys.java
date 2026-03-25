import java.util.Scanner;

class Student {
    private int studentRollno;
    private String studentName;
    private int marks1, marks2, marks3;
    private double average;
    private char grade;

    Scanner sc = new Scanner(System.in);

   
    public void inputRollNo() {
        System.out.print("Enter Roll Number: ");
        studentRollno = sc.nextInt();
    }

    
    public void inputStudentName() {
        sc.nextLine(); 
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();
    }

   
    public void inputMarks() {
        System.out.print("Enter marks of first subject: ");
        marks1 = sc.nextInt();

        System.out.print("Enter marks of second subject: ");
        marks2 = sc.nextInt();

        System.out.print("Enter marks of third subject: ");
        marks3 = sc.nextInt();
    }

    public void calculateAverage() {
        int sum = marks1 + marks2 + marks3;
        average = sum / 3.0;
    }

    public void calculateGrade() {
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }
    }

    
    public void displayResult() {
        System.out.println("\n---- Student Result -----");
        System.out.println("Roll Number: " + studentRollno);
        System.out.println("Name: " + studentName);
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class StudentgradingSys {
    public static void main(String[] args) {
        System.out.println("Welcome to Grading System");

        Student obj = new Student();

        obj.inputRollNo();
        obj.inputStudentName();
        obj.inputMarks();
        obj.calculateAverage();
        obj.calculateGrade();
        obj.displayResult();
    }
}