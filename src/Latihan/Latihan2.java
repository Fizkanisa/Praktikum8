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
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double r;
    Circle(double r){ this.r = r; }
    @Override
    double area(){ return Math.PI * r * r; }
}

class Rectangle extends Shape {
    double w, h;
    Rectangle(double w, double h){ this.w = w; this.h = h; }
    @Override
    double area(){ return w * h; }
}

public class Latihan2 {
     public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(
            new Circle(2),
            new Rectangle(3, 4),
            new Circle(1)
        );

        double total = 0;
        for (Shape s : shapes) total += s.area();

        System.out.println("Total area = " + total);
    }
}
