package lab_3.service;

import lab_3.domain.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private final ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findByName(String name) {

        for (Student student : students) {

            if (student.getFirstName().equals(name)) {
                return student;
            }
        }

        return null;
    }

    public List<Student> findByAverageGrade(double minAverage) {

        List<Student> result = new ArrayList<>();

        for (Student student : students) {

            if (student.getAverageGrade() > minAverage) {
                result.add(student);
            }
        }

        return result;
    }

    public void removeStudent(String name) {

        students.removeIf(
                student -> student.getFirstName().equals(name)
        );
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}