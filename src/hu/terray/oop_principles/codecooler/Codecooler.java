package hu.terray.oop_principles.codecooler;

public class Codecooler {
    protected String name;
    protected int age;

    public void setAge(int age) {
        if(age >= 18 && age < 120) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }
}
