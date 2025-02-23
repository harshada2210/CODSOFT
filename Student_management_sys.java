package com.demo20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String stud_name;
    private int stud_rollno;
    private String stud_grade;

    public Student(String name, int rollNumber, String grade)    //constructor
    {
        this.stud_name = name;
        this.stud_rollno = rollNumber;
        this.stud_grade = grade;
    }

    public int getRollNumber()    //getRollNumber() method is use to get the student by rollNumber
    {
        return stud_rollno;
    }

    @Override
    public String toString() {
        return "Name: " + stud_name + ", Roll Number: " + stud_rollno + ", Grade: " + stud_grade;
    }
}

class StudentManagementSystem {
    private List<Student> students;   // ArrayList to store students

    public StudentManagementSystem() {
        students = new ArrayList<>();    // Initializing the list
    }

    public void addStudent(Student student) {
        students.add(student);     // Adding student to the list
    }

    public boolean removeStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                students.remove(student);   // removing student from the list
                return true;
            }
        }
        return false;
    }

    public Student searchStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    public List<Student> getAllStudents() {
        return students;
    }
}

public class Student_management_sys{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit\n");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); 
                    System.out.print("\nEnter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter grade: ");
                    String grade = scanner.nextLine();

                    Student newStudent = new Student(name, rollNumber, grade);
                    sms.addStudent(newStudent);
                    System.out.println("\n**...Student added...**");  //to add student in ArrayList<Student> named as students
                    break;

                case 2:
                    System.out.print("Enter roll number of student to remove: ");
                    int rollToRemove = scanner.nextInt();
                    boolean removed = sms.removeStudent(rollToRemove);
                    if (removed) {
                        System.out.println("\n**...Student removed...**");    //to remove student in ArrayList<Student> named as students
                    } else {
                        System.out.println("\nStudent not found...!");    //this msg for record no found
                    }
                    break;

                case 3:
                    System.out.print("\nEnter roll number of student to search: ");  
                    int rollToSearch = scanner.nextInt();
                    Student searchedStudent = sms.searchStudent(rollToSearch);
                    if (searchedStudent != null) {
                        System.out.println("\nStudent found:");   //to search student in ArrayList<Student> named as students
                        System.out.println(searchedStudent);
                    } else {
                        System.out.println("\nStudent not found...!");  //this msg for record no found
                    }
                    break;

                case 4:
                    List<Student> allStudents = sms.getAllStudents();
                    if (allStudents.isEmpty()) {
                        System.out.println("\nNo students to display...!");  //this msg for if NoOne student present in ArrayList<Student> named as students
                    } else {
                        System.out.println("\nAll Students:");   //to display remaining student in ArrayList<Student> named as students
                        for (Student student : allStudents) {
                            System.out.println(student);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");  //exit
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice..! Please choose again..!");
                    break;
            }
        }
    }
}