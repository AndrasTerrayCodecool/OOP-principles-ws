package hu.terray.oop_principles.student;

public class Student {
    private String name;
    private int age;
    private GutHubAccount gutHubAccount;

    public void setAge(int age) {
        if(age >= 0 && age < 120) {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gutHubAccount=" + gutHubAccount +
                '}';
    }
}
