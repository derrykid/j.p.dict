package jp.demo;

public class Cat implements Animal{

    private String name;
    private int age;

    public Cat(String name, int age) {
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
