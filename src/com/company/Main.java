package com.company;

public class Main {

    public static void main(String[] args) {
        GamePiece pieceOne = new GamePiece();
        System.out.println(pieceOne.getPosition());
        System.out.println(pieceOne.isFrozen());
        pieceOne.move(30, 40);
        System.out.println(pieceOne.getPosition());
        pieceOne.freeze();
        pieceOne.move(40,99);
        System.out.println(pieceOne.getPosition());
        pieceOne.unfreeze();
        System.out.println(pieceOne.isFrozen());
        pieceOne.move(40, 99);
        System.out.println(pieceOne.getPosition());
        pieceOne.move(101, 101);
        System.out.println(pieceOne.getPosition());



    }
}
