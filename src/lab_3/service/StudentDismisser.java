package lab_3.service;

import lab_3.domain.Person;
import lab_3.domain.Student;

public class StudentDismisser implements Dismissable {

    @Override
    public void dismiss(Person p) {

        if (p instanceof Student student) {

            System.out.println("Информация об отчислении:");

            StudentPrinter.printInfo(student);

        } else {
            System.out.println(
                    "Переданный объект не является студентом"
            );
        }
    }
}