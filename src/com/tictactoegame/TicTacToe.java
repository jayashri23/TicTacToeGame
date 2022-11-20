package com.tictactoegame;

//uc1->as a player would like to start fresh by creating a tic tac board
//uc2->Ability to allow the player to choose a letter X or O
//uc3->As a Player would like to see the board, so I can choose the valid cells to make my move during my turn
//uc4->Ability for user to make a move to a desired location in the board

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    //creating a default constructor
    public TicTacToe() {
        System.out.println("Welcome to Tic Tac Toe Game ");
        System.out.println("Player Move ");
    }
    static char[] board = new char[10];
    static char player, computer;
    static Scanner sc = new Scanner(System.in);

    public void initialize() {
        for (int i = 0; i < 10; i++) {
            board[i] = ' ';
        }
    }

    //Allow player to choose X or O
    public static void chooseOption(){
        System.out.println("Please Select your choice Letter :\nProvide 'X or O' ");
        char choice =sc.next().charAt(0);
        if (choice == 'X' ||choice =='x'){
            player = 'X';
            computer ='O';
        }else if (choice == 'O' || choice == 'o'){
            player ='O';
            computer = 'X';
        }
        System.out.println("Player choosing option:"+player);
    }

    //To see board
    public static void showBoard(){
        System.out.println(board[1] +" |"+board[2]+"|"+board[3]);
        System.out.println("-------------");
        System.out.println(board[4] +" |"+board[5]+"|"+board[6]);
        System.out.println("---------------");
        System.out.println(board[7] +" |"+board[8]+"|"+board[9]);
    }
    //make player move
    public static void playerMove(){
        System.out.println("Enter the position between (1-9) your move first");
        int playerLocation =sc.nextInt();
        if (playerLocation > 0 && playerLocation <10){
            board[playerLocation] = player;
            showBoard();
        }else if (board[playerLocation] != ' '){
            System.out.println("Position is already choose..enter a valid position");
            showBoard();
            playerMove();
        }
    }
}