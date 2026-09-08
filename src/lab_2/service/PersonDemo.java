package lab_2.service;

import lab_2.domain.Person;
import lab_2.domain.Student;

public class PersonDemo {

    private final Person person;

    public PersonDemo(Person person) {
        this.person = person;
    }

    public void demo() {

        System.out.println("=== Демонстрация Person ===");

        PersonPrinter.printFI(person);

        System.out.println();

        PersonPrinter.printInfo(person);

        System.out.println();
    }

    public void studentDemo() {

        System.out.println("=== Демонстрация StudentDismisser ===");

        Student student = new Student(
                "Иван",
                "Иванов",
                20,
                "89991234567",
                "А-1",
                2
        );

        StudentDismisser dismisser = new StudentDismisser();

        dismisser.dismiss(student);
    }
}