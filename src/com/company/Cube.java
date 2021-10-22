package com.company;

import java.util.Random;

public class Cube extends Square {
    public Cube(int a) {
        super(a);
    }

    public static Cube generate(){
        Random r = new Random();
        return new Cube(r.nextInt(5)+1);
    }

    @Override
    public String toString() {
        return "\n\nКуб{\n" +
                "a: " + super.getA() +
                "\nОбъём: " + (int)Math.pow(super.getA(), 3) +
                "\nПлощадь: " + 6 * (int)Math.pow(super.getA(), 2) +
                "\n}";
    }
}
