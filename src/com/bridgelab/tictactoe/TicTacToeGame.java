package com.bridgelab.tictactoe;

public class TicTacToeGame {

		    static char[] board = new char[10]; // board size 10
		    public static void main(String[] args) {
		        createBoard();//calling method
		        System.out.printf("Welcome to Tic Tac Toe Game");
		    }
		    /*why this Method use:
		     *in method data is character
		     *and using for loop to iteration from 1 to 9 by ignoring 0
		     */
		    public static void createBoard() {
		        for (int index = 1; index < board.length; index++) {
		            board[index] = ' ';
		        }
	}

}
