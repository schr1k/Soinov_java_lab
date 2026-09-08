package lab_2.service;

import lab_2.domain.Person;
import lab_2.domain.Student;

public class StudentDismisser implements Dismissable {

    @Override
    public void dismiss(Person p) {

        if (p instanceof Student student) {

            System.out.println("Информация об отчислении:");
            System.out.println("Имя: " + student.getFirstName());
            System.out.println("Фамилия: " + student.getSecondName());
            System.out.println("Возраст: " + student.getAge());
            System.out.println("Телефон: " + student.getPhone());
            System.out.println("Группа: " + student.getGroup());
            System.out.println("Курс: " + student.getCourse());

        } else {
            System.out.println("Переданный объект не является студентом");
        }
    }
}