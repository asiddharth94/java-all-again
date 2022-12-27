import java.util.Arrays;

public class Student {
    private short rollNumber;
    private String name;
    private Subject[] subjects;

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public Student(short rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}
