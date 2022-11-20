package com.tictactoegame;

//uc1->as a player would like to start fresh by creating a tic tac board
//uc2->Ability to allow the player to choose a letter X or O
//uc3->As a Player would like to see the board, so I can choose the valid cells to make my move during my turn
//uc4->Ability for user to make a move to a desired location in the board
//uc5->Ability to check for the free space before making the desired move
//uc6->As a User would like to do a toss to check who plays first.
//uc7->As player would expect the Tic Tac Toe App to determine after every move the winner or the tie or change the turn

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    //creating a default constructor
    public TicTacToe() {
        System.out.println("Welcome to Tic Tac Toe Game ");
        System.out.println("Tossing between player and computer");
    }

    static char[] board = new char[10];
    static char player, computer;
    static int toss;
    static  boolean computerFlag=false,playerFlag=false;
    static Random random =new Random();
    static Scanner sc = new Scanner(System.in);


    //starting game
    public static void startGame(){
        int freeSpace=9;
        initialize();
        showBoard();
        chooseOption();
        toss();
        while (freeSpace !=0){
            System.out.println();
            turn();
            break;
        }
    }
    public static void initialize() {
        for (int i = 0; i < 10; i++) {
            board[i] = ' ';
        }
    }

    //a toss for playing first
    public static void  toss(){
        toss =random.nextInt(2);
        switch (toss){
            case 0:
                System.out.println("Tail.\nComputer starts first");
                computerMove();
                computerFlag =true;
                break;
            case 1:
                System.out.println("Head.\nPlayer starts first");
                playerMove();
                playerFlag =true;
                break;
        }
        if (computerFlag == true){
            System.out.println("Now its player turn");
            System.out.println();
            playerMove();
        }else if (playerFlag){
            System.out.println("Now its computer turn");
            System.out.println();
            computerMove();
        }
    }

    private static void computerMove() {
    }

    //Allow player to choose X or O
    public static void chooseOption() {
        System.out.println("Please Select your choice Letter :\nProvide 'X or O' ");
        char choice = sc.next().charAt(0);
        if (choice == 'X' || choice == 'x') {
            player = 'X';
            computer = 'O';
        } else if (choice == 'O' || choice == 'o') {
            player = 'O';
            computer = 'X';
        }
        System.out.println("Player choosing option:" + player);
    }

    //To see board
    public static void showBoard() {
        System.out.println(board[1] + " |" + board[2] + "|" + board[3]);
        System.out.println("-------------");
        System.out.println(board[4] + " |" + board[5] + "|" + board[6]);
        System.out.println("---------------");
        System.out.println(board[7] + " |" + board[8] + "|" + board[9]);
    }

    //make player move
    public static void playerMove() {
        System.out.println("Enter the position between (1-9) your move first");
        int playerLocation = sc.nextInt();
        if (playerLocation > 0 && playerLocation < 10) {
            board[playerLocation] = player;
            showBoard();
        } else if (board[playerLocation] != ' ') {
            System.out.println("Position is already choose..enter a valid position");
            showBoard();
            playerMove();
        }
    }

    //To check for free space
    public static void checkFreeSpace() {
        boolean spaceAvailable = false;
        int numberOfFreeSpaces = 0;
        for (int index = 1; index < board.length; index++) {
            if (board[index] == ' ') {
                spaceAvailable = true;
                numberOfFreeSpaces++;
            }
        }
            if (spaceAvailable == false) {
                System.out.println("Board is full");
            } else {
                System.out.println("Free space is available  " + numberOfFreeSpaces);
            }
        }

        //check for winning tie or turn change
    public static void checkGame() {
        if ((board[1] == player && board[2] == player || board[2] == player && board[3] == player || board[1] == player && board[3] == player) ||
                (board[4] == player && board[5] == player || board[5] == player && board[4] == player || board[6] == player && board[6] == player) ||
                (board[7] == player && board[8] == player || board[8] == player && board[7] == player || board[9] == player && board[9] == player) ||
                (board[1] == player && board[5] == player || board[5] == player && board[1] == player || board[9] == player && board[9] == player) ||
                (board[3] == player && board[5] == player || board[5] == player && board[3] == player || board[7] == player && board[7] == player) ||
                (board[1] == player && board[4] == player || board[4] == player && board[1] == player || board[7] == player && board[7] == player) ||
                (board[2] == player && board[5] == player || board[5] == player && board[2] == player || board[8] == player && board[8] == player) ||
                (board[3] == player && board[6] == player || board[6] == player && board[3] == player || board[9] == player && board[9] == player)) {
            System.out.println("Player going  to win");
        } else if ((board[1] == player && board[2] == player || board[2] == player && board[3] == player || board[1] == player && board[3] == player) ||
                (board[4] == player && board[5] == player || board[5] == player && board[4] == player || board[6] == player && board[6] == player) ||
                (board[7] == player && board[8] == player || board[8] == player && board[7] == player || board[9] == player && board[9] == player) ||
                (board[1] == player && board[5] == player || board[5] == player && board[1] == player || board[9] == player && board[9] == player) ||
                (board[3] == player && board[5] == player || board[5] == player && board[3] == player || board[7] == player && board[7] == player) ||
                (board[1] == player && board[4] == player || board[4] == player && board[1] == player || board[7] == player && board[7] == player) ||
                (board[2] == player && board[5] == player || board[5] == player && board[2] == player || board[8] == player && board[8] == player) ||
                (board[3] == player && board[6] == player || board[6] == player && board[3] == player || board[9] == player && board[9] == player)) {
            System.out.println("Computer going to win");
        } else {
            System.out.println("It may be tie");
        }
    }
        //turn until its over
        public static void turn(){
            if (computerFlag ==true){
                System.out.println("Player turn");
                playerMove();
                computerFlag = false;
                playerFlag = true;
            }else if (playerFlag == true){
                System.out.println("Computer turn");
                computerMove();
                computerFlag =true;
                playerFlag =false;
            }
            checkGame();
            System.out.println("Turn change");
        }
      }

