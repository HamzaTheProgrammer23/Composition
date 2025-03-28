import java.util.ArrayList;

public class Classroom {
    private String subject;
    private Teacher teacher;
    private ArrayList<String> students;

    public Classroom(String subject, Teacher teacher, ArrayList<String> students) {
        this.subject = subject;
        this.teacher = teacher;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "subject='" + subject + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
