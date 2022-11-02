package jp.demo;

import java.util.ArrayList;
import java.util.List;

public class DemoMain {


    public static void main(String[] args) {

        List<Animal> list = new ArrayList<>();

        Cat blonde = new Cat("Catie", 13);
        Dog black = new Dog("Barf", 33);

        // we can add 2 different class to one list
        list.add(blonde);
        list.add(black);

    }
}
