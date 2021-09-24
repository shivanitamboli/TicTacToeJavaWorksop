package com.bridgelab.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	static Scanner scan =new Scanner(System.in); //Create scanner object class
    public static char playerSymbol;
    public static char cpSymbol;
    static char[] board = new char[10]; // board size 10
    public static void main(String[] args) {
        createBoard();//calling method
        System.out.println("Select the Letter you wanted \n  Press 1 . Choose X \n  Press 2 . Choose O\n\nEnter your Choice : ");
        int choice = scan.nextInt();


        TicTacToeGame.allowPlayer(choice);
        TicTacToeGame.showBoard();
        choicesLocation();
        scan.close();
    }

    /*Method use:
     *in method data is character
     *and using for loop to iteration from 1 to 9
     */
    public static void createBoard() {
        for (int index = 1; index < board.length; index++) {
            board[index] = ' ';
        }


    }
    public  static void allowPlayer( int choice){
        switch(choice){
            case 1 : {
                playerSymbol='X';
                cpSymbol='O';
                break;
            }
            case 2 :{
                playerSymbol='O';
                cpSymbol='X';
                break;
            }
            default: {
                System.out.println("Invalid Choice . Retry Again!");
                return;
            }
        }
    }
    public  static void showBoard() {
        System.out.println("Board Display\n");
        System.out.println(" | "+board[1]+" | "+board[2]+" | "+board[3]+" |\n");
        System.out.println(" | "+board[4]+" | "+board[5]+" | "+board[6]+" |\n");
        System.out.println(" | "+board[7]+" | "+board[8]+" | "+board[9]+" |\n");
    }
    static void choicesLocation() {
        System.out.println("Enter board index(1-9) to set your game move ");
        int userMove = scan.nextInt();
        switch (userMove) {
            case 1:
                if (board[1] == ' ') {
                    board[1] = playerSymbol;
                }
                break;
            case 2:
                if (board[2] == ' ') {
                    board[2] = playerSymbol;
                }
                break;
            case 3:
                if (board[3] == ' ') {
                    board[3] = playerSymbol;
                }
                break;
            case 4:
                if (board[4] == ' ') {
                    board[4] = playerSymbol;
                }
                break;
            case 5:
                if (board[5] == ' ') {
                    board[5] = playerSymbol;
                }
                break;
            case 6:
                if (board[6] == ' ') {
                    board[6] = playerSymbol;
                }
                break;
            case 7:
                if (board[7] == ' ') {
                    board[7] = playerSymbol;
                }
                break;
            case 8:
                if (board[8] == ' ') {
                    board[8] = playerSymbol;
                }
                break;
            case 9:
                if (board[9] == ' ') {
                    board[9] = playerSymbol;
                }
                break;
            default:
                System.out.println("Invalid Move");
        }
        showBoard();
}
}
