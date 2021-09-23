package com.bridgelab.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	public static char playerSymbol;
	public static char computer_Player_Symbol;
	static char[] board = new char[10]; // board size 10

	public static void main(String[] args) {
		createBoard();// calling method
		System.out.println(
				"Select the Letter which you want\n  Press 1 . Choose X \n  Press 2 . Choose O\n\nEnter your Choice : ");
		Scanner scan = new Scanner(System.in); // Create scanner object
		int choice = scan.nextInt();

		TicTacToeGame.allowPlayer(choice);
		scan.close();
	}

	/*
	 * why Method use: in method data is character and using for loop to iteration
	 * from 1 to 9
	 */
	public static void createBoard() {
		for (int index = 1; index < board.length; index++) {
			board[index] = ' ';
		}

	}

	/*
	 * define method to allow the player in tictactoe game and by using switch which
	 * u want to choice you can directly choice it
	 */
	public static void allowPlayer(int choice) {
		switch (choice) {
		case 1: {
			playerSymbol = 'X';
			computer_Player_Symbol = 'O';
			break;
		}
		case 2: {
			playerSymbol = 'O';
			computer_Player_Symbol = 'X';
			break;
		}
		default: {
			System.out.println("Invalid Choice so please Retry Again");
			return;
		}
		}
	}

}
