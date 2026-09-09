package lab_3.service;

import lab_3.domain.Student;
import lab_3.domain.Subject;

public class StudentPrinter {

    public static void printInfo(Student student) {

        System.out.println("Имя: " + student.getFirstName());
        System.out.println("Фамилия: " + student.getSecondName());
        System.out.println("Возраст: " + student.getAge());
        System.out.println("Телефон: " + student.getPhone());
        System.out.println("Группа: " + student.getGroup());
        System.out.println("Курс: " + student.getCourse());

        System.out.println("Дисциплины:");

        for (Subject subject : student.getSubjects()) {
            System.out.println("  " + subject);
        }

        System.out.println(
                "Средний балл: " + student.getAverageGrade()
        );
    }
}