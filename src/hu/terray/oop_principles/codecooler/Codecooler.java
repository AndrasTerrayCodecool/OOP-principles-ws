package hu.terray.oop_principles.codecooler;

public class Codecooler {
    protected String name;
    protected int age;

    public void setAge(int age) {
        if(age >= 18 && age < 120) {
            this.age = age;
        }
    }

    public void setAge(double age) {
        if(age >= 18 && age < 120) {
            this.age = (int)age;
        }
    }


    // Overloading
    public void setAge(String name, int age) {
        if(name.equals(this.name)) {
            this.setAge(age);
        }
    }

    public String getName() {
        return name;
    }
}
