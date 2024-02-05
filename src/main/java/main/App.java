package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        University university = new University();

        int valinta = -1;

        while (valinta != 0) {
            System.out.println("1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, " +
                    "4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, " +
                    "6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, " +
                    "8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma");

            valinta = scanner.nextInt();
            scanner.nextLine(); 

            switch (valinta) {
                case 1:
                    university.addStudent();
                    break;
                case 2:
                    university.listStudents();
                    break;
                case 3:
                    university.addGrade();
                    break;
                case 4:
                    university.listGrades();
                    break;
                case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    break;
                default:
                    System.out.println("Syöte oli väärä");
            }
        }
        scanner.close();
    }
}