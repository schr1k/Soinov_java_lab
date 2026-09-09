package lab_3.domain;

import java.util.ArrayList;
import java.util.Comparator;

public class Student extends Person {

    private String group;
    private int course;

    private final ArrayList<Subject> subjects = new ArrayList<>();

    public Student(String firstName, String secondName, int age,
                   String group, int course) {

        super(firstName, secondName, age);

        this.group = group;
        this.course = course;
    }

    public Student(String firstName, String secondName, int age,
                   String phone, String group, int course)
            throws InvalidPhoneNumberException {

        super(firstName, secondName, age, phone);

        this.group = group;
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);

        subjects.sort(
                Comparator.comparing(Subject::getName).reversed()
        );
    }

    public double getAverageGrade() {

        if (subjects.isEmpty()) {
            return 0.0;
        }

        int sum = 0;

        for (Subject subject : subjects) {
            sum += subject.getGrade();
        }

        return (double) sum / subjects.size();
    }
}