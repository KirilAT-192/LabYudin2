package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cubes {
    private final List<Cube> cubes;

    public Cubes(){
        cubes = new ArrayList<>();
    }

    public List<Cube> getCubes() {
        return cubes;
    }

    public void add(Cube cube) {
        this.cubes.add(cube);
    }

    public void remove(Cube cube) {
        this.cubes.remove(cube);
    }

    public void fillRandom(int n){
        for (int i = 0; i < n; i++) {
            cubes.add(Cube.generate());
        }
    }

    public void numMaxSquareCubes(double medsquare){
        int N = 0;
        for (Cube cube : this.cubes){
            if (6 * (int)Math.pow(cube.getA(), 2) > medsquare){
                N++;
            }
        }
        System.out.println("\nКоличество кубов с наибольшей площадью: " + N);
    }

    @Override
    public String toString() {
        return "\n\n\nКубы" + cubes + "; ";
    }
}
