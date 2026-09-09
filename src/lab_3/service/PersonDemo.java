package lab_3.service;

import lab_3.domain.InvalidPhoneNumberException;
import lab_3.domain.Person;
import lab_3.domain.Student;
import lab_3.domain.Subject;

public class PersonDemo {

    private final Person person;

    public PersonDemo(Person person) {
        this.person = person;
    }

    public void demo() {

        System.out.println("=== PersonPrinter ===");

        PersonPrinter.printFI(person);

        System.out.println();

        PersonPrinter.printInfo(person);
    }

    public void studentDemo() {

        System.out.println("\n=== StudentDemo ===");

        try {

            Student student = new Student(
                    "Иван",
                    "Иванов",
                    20,
                    "89991234567",
                    "БМТУ-101",
                    2
            );

            student.addSubject(new Subject("Математика", 5));
            student.addSubject(new Subject("Физика", 4));
            student.addSubject(new Subject("История", 3));
            student.addSubject(new Subject("Программирование", 5));

            StudentPrinter.printInfo(student);

            System.out.println("\n=== StudentManager ===");

            StudentManager manager = new StudentManager();

            manager.addStudent(student);

            Student student2 = new Student(
                    "Пётр",
                    "Петров",
                    21,
                    "89990001122",
                    "БМТУ-102",
                    3
            );

            student2.addSubject(new Subject("Математика", 4));
            student2.addSubject(new Subject("Физика", 4));

            manager.addStudent(student2);

            System.out.println("\nПоиск по имени Иван:");

            Student found = manager.findByName("Иван");

            if (found != null) {
                StudentPrinter.printInfo(found);
            }

            System.out.println("\nСтуденты со средним баллом выше 4:");

            for (Student s : manager.findByAverageGrade(4.0)) {
                StudentPrinter.printInfo(s);
                System.out.println();
            }

            System.out.println("\nУдаление Петра:");

            manager.removeStudent("Пётр");

            System.out.println(
                    "Количество студентов: "
                            + manager.getStudents().size()
            );

        } catch (InvalidPhoneNumberException e) {

            System.out.println(
                    "Ошибка телефона: " + e.getMessage()
            );
        }
    }

    public void exceptionDemo() {

        System.out.println("\n=== ExceptionDemo ===");

        try {

            person.setPhone("8999abc4567");

        } catch (InvalidPhoneNumberException e) {

            System.out.println(
                    "Поймано исключение: " + e.getMessage()
            );
        }
    }
}