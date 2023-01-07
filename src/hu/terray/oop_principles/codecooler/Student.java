package hu.terray.oop_principles.codecooler;

public class Student extends Codecooler {
    private GitHubAccount gitHubAccount;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gutHubAccount=" + gitHubAccount +
                '}';
    }

    public void goToPa() {

    }
}
