package com.tictactoegame;
import static com.tictactoegame.TicTacToe.*;

public class TicTacToeMain {

    //main class
    public static void main(String [] args) {

        //initialize the object
        TicTacToe obj = new TicTacToe();

        //creating the board
        System.out.println(board[1] + "|" +board[2] + "|" +board[3]);
        System.out.println("-----------");
        System.out.println(board[4] + "|" +board[5] + "|" +board[6]);
        System.out.println("-----------");
        System.out.println(board[7] +"|" + board[8] + "|"+board[9]);

        //checking for player choice
        chooseOption();

        //Showing board
        showBoard();

        //player move
        playerMove();

        //tossing between player and computer
        toss();
        //check free space
        checkFreeSpace();

        //start game
        startGame();

    }
}
