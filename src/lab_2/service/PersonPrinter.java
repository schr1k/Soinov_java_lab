package lab_2.service;

import lab_2.domain.Person;

public class PersonPrinter {

    public static void printFI(Person p) {
        System.out.println(
                p.getFirstName() + " " + p.getSecondName()
        );
    }

    public static void printInfo(Person p) {
        System.out.println("Имя: " + p.getFirstName());
        System.out.println("Фамилия: " + p.getSecondName());
        System.out.println("Возраст: " + p.getAge());
        System.out.println("Телефон: " + p.getPhone());
    }
}