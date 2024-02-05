package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class University {
    private List<Student> students;

    public University() {
        this.students = new ArrayList<>();
    }

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anna opiskelijan nimi?");
        String name = scanner.nextLine();
        System.out.println("Anna opiskelijan opiskelijanumero:");
        String studentNumber = scanner.nextLine();
        students.add(new Student(name, studentNumber));
    }

    public void listStudents() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(i + ": " + students.get(i));
        }
    }

    public void addGrade() {
        listStudents();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mille opiskelijalle suorite lisätään?");
        int studentIndex = scanner.nextInt();
        scanner.nextLine();  

        List<Student> students = getStudents();
        if (studentIndex >= 0 && studentIndex < students.size()) {
            Student student = students.get(studentIndex);
            System.out.println("Mille kurssille suorite lisätään?");
            String course = scanner.nextLine();
            System.out.println("Mikä arvosana kurssille lisätään?");
            int grade = scanner.nextInt();
            student.addGrade(course, grade);
        } else {
            System.out.println("Syöte oli väärä");
        }
    }

    public void listGrades() {
        listStudents();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Minkä opiskelijan suoritteet listataan?");
        int studentIndex = scanner.nextInt();
        scanner.nextLine(); 

        List<Student> students = getStudents();
        if (studentIndex >= 0 && studentIndex < students.size()) {
            Student student = students.get(studentIndex);
            List<Grade> grades = student.getGrades();

            System.out.println("Minkä opiskelijan suoritteet listataan?");
            for (Grade grade : grades) {
                System.out.println(grade);
            }
        } else {
            System.out.println("Syöte oli vääärä");
        }
    }

    public List<Student> getStudents() {
        return students;
    }
}