package jp.demo;

public class Dog implements Animal{

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getAge() {
        return null;
    }
}
