package org.designs;

import org.designs.TicTacToe.TicTacToe;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Welcome to Low Level Designs!!1!");
        System.out.println("1. Tic-Tac-Toe");

        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        if(d==1){
            TicTacToe game = new TicTacToe();
            game.play();
        }
    }
}