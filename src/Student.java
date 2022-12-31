import java.util.Arrays;

public class Student {
    private short rollNumber;
    private String name;
    private Subject[] subjects;

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subs) {
        subjects = subs;
    }

    public Student(short rollNum, String n) {
        rollNumber = rollNum;
        name = n;
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
