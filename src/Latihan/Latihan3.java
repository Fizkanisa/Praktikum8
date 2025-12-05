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
interface Payable {
    double pay();
}

class Employee implements Payable {
    double salary;
    Employee(double salary){ this.salary = salary; }
    @Override
    public double pay(){ return salary; }
}

class Contractor implements Payable {
    double rate; int hours;
    Contractor(double rate, int hours){
        this.rate = rate; this.hours = hours;
    }
    @Override
    public double pay(){ return rate * hours; }
}

public class Latihan3 {
    public static void main(String[] args) {
        List<Payable> list = Arrays.asList(
            new Employee(5000),
            new Contractor(100, 40),
            new Employee(4500)
        );

        double total = 0;
        for (Payable p : list) total += p.pay();

        System.out.println("Total pay = " + total);
    }
}
