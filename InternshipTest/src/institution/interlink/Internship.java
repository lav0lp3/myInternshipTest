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

    public String getStudents() {
        return toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Internship name : ");
        sb.append(name);
        sb.append("\nList of internship's students:\n");
        for (Student student : students) {
            sb.append(student.getName());
            sb.append(" - ");
            sb.append(student.getKnowledge().getLevel());
            sb.append("\n");
        }
        return sb.toString();
    }


}
