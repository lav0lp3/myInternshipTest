package person;

import person.consciousness.Knowledge;

public class Student {
    private String name;
    private Knowledge knowledge;

    public Student(String name) {
        this.name = name;
    }

    public Student withKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }

}
