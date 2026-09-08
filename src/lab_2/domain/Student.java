package lab_2.domain;

public class Student extends Person {

    private String group;
    private int course;

    public Student(String firstName, String secondName, int age,
                   String group, int course) {

        super(firstName, secondName, age);

        this.group = group;
        this.course = course;
    }

    public Student(String firstName, String secondName, int age,
                   String phone, String group, int course) {

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
}