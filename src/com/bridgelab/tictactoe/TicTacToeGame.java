package com.bridgelab.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	static Scanner scan = new Scanner(System.in);
    static char[] board = new char[10];
    static char playerSymbol;
    static char cpSymbol;
    public static void main(String[] args) {
        System.out.println("Welcome to the Tic Tac Toe Game");
        System.out.println("Select the Letter you wanted \n  Press 1 . Choose X \n  Press 2 . Choose O\n\nEnter your Choice : ");
        int choice = scan.nextInt();

        createBoard();
        allowPlayer(choice);
        choicesToss();
        playerWon(board);
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
    /* Create a method to allow player to
     * input X or O and call from main
     */
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
    /* write a method showBoard to
     * display current board
     */
    public static void showBoard() {
        System.out.println("Tic Tac Toe Board");
        System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
    }
    /*Ability for user to make
     * a move to a desired
     * location in the board
     */
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
    /*
    * Ability to check for the
    * free space before
    * making the desired
    */
    static void move() {
        boolean played = false;
        while (!played) {
            int playMove = (int) (Math.random() * 10) % 9 + 1;
            if (playMove > 0 && playMove < 10) {
                if (board[playMove] == ' ') {
                    board[playMove] = cpSymbol;
                    played = true;
                }
            }
        }
        showBoard();
    }
        static void choicesToss(){
        int win = (int) Math.floor(Math.random() * 10) % 2;
        System.out.println("Choose\n 0. Heads\n 1. Tails\nEnter you choice [0-1] : ");
        Scanner sc = new Scanner(System.in);
        int tossChoices = sc.nextInt();
        if (tossChoices == win) {
            System.out.println("Player won the toss, enter your first Move");
            choicesLocation();
            move();
        } else {
            System.out.println("Computer won the toss, enter your first move");
            move();
            choicesLocation();
        }
    }
    public static char playerWon(char[] board){
        int[][] game = {{1,2,3},{4,5,6},{7,8,9},{1,5,9},{3,5,7},{1,4,7},{2,5,8},{3,6,9}};
        char won = 'W';
        for(int i=0;i<game.length;i++){
            if(board[game[i][0]] == board[game[i][1]] && board[game[i][1]] == board[game[i][2]]){
                if(board[game[i][0]]!=' '){
                    won = board[game[i][0]];
                    break;
                }
            }
        }
        return won;
    }
    // check for empty spaces on game board
    public static boolean BoardFilled(char[] board){
        boolean filled = true;
        for(int i=1;i<board.length;i++){
            if(board[i]==' '){
                filled = false;
                break;
            }
        }
        return filled;
    }
    // check game state
    public static char getGameState(char[] board,char user,char computer,char current) {
        char won = playerWon(board);
        char tie = ' ', state = ' ';
        if (current == user) {
            tie = computer;
        } else {
            tie = user;
        }
        switch (won) {
            case 'F':
                state = tie;
                break;
            case 'X':
                System.out.println("X has won the game");
                state = 'E';
                break;
            case 'O':
                System.out.println("O has won the game");
                state = 'E';
                break;
        }
        if (BoardFilled(board)) {
            state = 'E';
        }
        return state;

}
}
