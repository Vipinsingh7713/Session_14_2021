package app;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
    }

    protected void displayDetails() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
