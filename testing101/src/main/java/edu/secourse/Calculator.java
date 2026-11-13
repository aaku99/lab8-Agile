package edu.secourse;
import  java.util.*;
public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double sqrt(double a){
        return Math.sqrt(a);
    }

    public static void main(String[] args){
        double a = 4.0;
        System.out.println(sqrt(a));

    }
}

