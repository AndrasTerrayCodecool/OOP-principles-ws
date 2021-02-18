package hu.terray.oop_principles.codecooler;

public class Student extends Codecooler {
    private GutHubAccount gutHubAccount;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gutHubAccount=" + gutHubAccount +
                '}';
    }
}
