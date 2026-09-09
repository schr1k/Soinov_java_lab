package lab_3;

import lab_3.domain.InvalidPhoneNumberException;
import lab_3.domain.Person;
import lab_3.service.PersonDemo;

public class Main {

    static void main(String[] args) {

        try {

            Person person = new Person(
                    "Пётр",
                    "Петров",
                    25,
                    "89990001122"
            );

            PersonDemo demo = new PersonDemo(person);

            demo.demo();

            demo.studentDemo();

            demo.exceptionDemo();

        } catch (InvalidPhoneNumberException e) {

            System.out.println(
                    "Ошибка создания человека: " + e.getMessage()
            );
        }
    }
}