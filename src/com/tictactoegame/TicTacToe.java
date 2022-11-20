package com.tictactoegame;

//uc1->as a player would like to start fresh by creating a tic tac board
//uc2->Ability to allow the player to choose a letter X or O
import java.util.Scanner;

public class TicTacToe {
    //creating a default constructor
    public TicTacToe() {
        System.out.println("Welcome to Tic Tac Toe Game ");
        System.out.println(" Choose letter X or O");
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
}