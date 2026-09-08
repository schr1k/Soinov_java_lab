package lab_2;

import lab_2.domain.Person;
import lab_2.service.PersonDemo;

public class Main {

    static void main(String[] args) {

        Person person = new Person(
                "Пётр",
                "Петров",
                25,
                "89990001122"
        );

        PersonDemo demo = new PersonDemo(person);

        demo.demo();

        demo.studentDemo();
    }
}