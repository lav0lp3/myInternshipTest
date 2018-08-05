package institution;

import institution.interlink.Internship;
import person.Student;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Student> students;
    private Internship internship;

    public University(String name) {
        this.name = name;
        students = new ArrayList<>();
        internship = new Internship("Interlink");
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Internship getInternship() {
        return internship;
    }

    private double getStudentKnowledgeMediumLevel() {
        double medLevel;
        double sum = 0;
        for (Student student : students) {
            sum += student.getKnowledge().getLevel();
        }
        medLevel = sum / students.size();
        return medLevel;
    }

    public void setSmartStudents() {
        List<Student> smartStudents = new ArrayList<>();
        double medLevel = getStudentKnowledgeMediumLevel();
        for (Student student : students) {
            if (student.getKnowledge().getLevel() >= medLevel)
                smartStudents.add(student);
        }
        internship.setStudents(smartStudents);
    }
}
