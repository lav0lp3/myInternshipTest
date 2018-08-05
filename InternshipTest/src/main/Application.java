package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {
        University university = new University("cH.U.I.");
        university.addStudent(new Student("Andrew Kostenko").withKnowledge(new Knowledge(5)));
        university.addStudent(new Student("Julia Veselkina").withKnowledge(new Knowledge(1)));
        university.addStudent(new Student("Maria Perechrest").withKnowledge(new Knowledge(7)));


        Internship internship = university.getInternship();
        //university.setSmartStudents();
        System.out.println(university.getStudents());
        System.out.println(internship.getStudents());
    }
}
