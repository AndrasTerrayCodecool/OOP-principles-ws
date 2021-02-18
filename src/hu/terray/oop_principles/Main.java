package hu.terray.oop_principles;

import hu.terray.oop_principles.codecooler.Codecooler;
import hu.terray.oop_principles.codecooler.Mentor;
import hu.terray.oop_principles.codecooler.Student;

import java.util.HashSet;
import java.util.Set;

public class Main {

    // Encapsulation
    // Inheritance
    // Polymorphism - overloading; overriding
    // Abstraction

    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(-6.0);
        System.out.println(student);

        Mentor mentor = new Mentor();
        mentor.setAge(38);
        System.out.println(mentor);

        Set<Codecooler> codecoolers = new HashSet<>();
        System.out.println(student.equals(mentor));
        codecoolers.add(mentor);
        codecoolers.add(student);

        for (Codecooler codecooler : codecoolers) {
            System.out.println(codecooler.getName());
        }

        Codecooler c = student;
        student.goToPa();

    }
}
