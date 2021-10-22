package com.company;

import java.util.ArrayList;
import java.util.List;

public class Squares {
    private final List<Square> squares;

    public Squares() {
        squares =new ArrayList<>();
    }

    public List<Square> getSquares() {
        return squares;
    }

    public void add(Square square) {
        this.squares.add(square);
    }

    public void remove(Square square) {
        this.squares.remove(square);
    }

    public void fillRandom(int n){
        for (int i = 0; i < n; i++) {
            squares.add(Square.generate());
        }
    }

    public double findMediumSquare(){
        double medsquare = 0;
        for (Square square : this.squares){
            medsquare += (int)Math.pow(square.getA(), 2);
        }
        medsquare /= squares.size();
        System.out.println("\nСредняя площадь квадратов: " + medsquare);
        return medsquare;
    }

    @Override
    public String toString() {
        return "\n\n\nКвадраты" + squares + "; ";
    }
}
