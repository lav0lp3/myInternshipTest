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
}
