/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

import java.util.*;

/**
 *
 * @author zettopiaa
 */
class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Woof!");
    }
    void fetch() {
        System.out.println("Dog fetches ball");
    }
}

class Bird extends Animal {
    @Override
    void speak() {
        System.out.println("Chirp!");
    }
}

public class Latihan1 {
    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(
            new Dog(), new Bird(), new Dog()
        );

        for (Animal a : animals) {
            a.speak();
            if (a instanceof Dog) {
                ((Dog) a).fetch();
            }
        }
    }
}
