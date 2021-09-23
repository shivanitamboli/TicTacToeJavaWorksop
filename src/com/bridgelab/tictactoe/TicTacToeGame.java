package com.bridgelab.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	public static char playerSymbol;
	public static char cpSymbol;
	static char[] board = new char[10]; // board size 10

	public static void main(String[] args) {
		createBoard();// calling method
		System.out.println(
				"Select the Letter you wanted \n  Press 1 . Choose X \n  Press 2 . Choose O\n\nEnter your Choice : ");
		Scanner scan = new Scanner(System.in); // Create scanner object
		int choice = scan.nextInt();

		TicTacToeGame.allowPlayer(choice);
		TicTacToeGame.showBoard();
		scan.close();
	}

	/*
	 * Method use: in method data is character and using for loop to iteration from
	 * 1 to 9
	 */
	public static void createBoard() {
		for (int index = 1; index < board.length; index++) {
			board[index] = ' ';
		}

	}

	public static void allowPlayer(int choice) {
		switch (choice) {
		case 1: {
			playerSymbol = 'X';
			cpSymbol = 'O';
			break;
		}
		case 2: {
			playerSymbol = 'O';
			cpSymbol = 'X';
			break;
		}
		default: {
			System.out.println("Invalid Choice . Retry Again!");
			return;
		}
		}
	}

	public static void showBoard() {
		System.out.println("Board Display\n");
		System.out.println(" | " + board[1] + " | " + board[2] + " | " + board[3] + " |\n");
		System.out.println(" | " + board[4] + " | " + board[5] + " | " + board[6] + " |\n");
		System.out.println(" | " + board[7] + " | " + board[8] + " | " + board[9] + " |\n");
	}

}
