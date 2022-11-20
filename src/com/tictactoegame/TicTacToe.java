package com.tictactoegame;

//uc1->as a player would like to start fresh by creating a tic tac board

import java.util.Scanner;

public class TicTacToe {
    //creating a default constructor
    public TicTacToe() {
        System.out.println("Welcome to Tic Tac Toe Game ");
        System.out.println("Creating Tic Tac Toe Board");
    }
    static char[] board = new char[10];
    static char player, computer;
    Scanner scanner = new Scanner(System.in);

    public void initialize() {
        for (int i = 0; i < 10; i++) {
            board[i] = ' ';
        }

    }
}