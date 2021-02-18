package hu.terray.oop_principles;

import hu.terray.oop_principles.student.Student;

public class Main {

    // Encapsulation
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(-6);
        System.out.println(student);
    }
}
