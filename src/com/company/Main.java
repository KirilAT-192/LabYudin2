package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(5)+1;
        Squares squares = new Squares();
        squares.fillRandom(n);
        System.out.println(squares);
        double medsquare = squares.findMediumSquare();

        n = r.nextInt(5)+1;
        Cubes cubes = new Cubes();
        cubes.fillRandom(n);
        System.out.println(cubes);
        cubes.numMaxSquareCubes(medsquare);
    }
}
