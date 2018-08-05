package institution.interlink;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class Internship {
    private String name;
    private List<Student> students;

    public Internship(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }


}
