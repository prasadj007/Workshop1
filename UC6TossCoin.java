package com.bridgelabz.workshop1;

import java.util.*;
public class UC6TossCoin {

	public static char[] board = new char [10];
	static char playerChoose;
	static char compChoose;
	static int position;
	static int userMove;

	public static void boardOfGame() {

		for (int index=1; index<board.length; index++) {

			board[index]=' ';

			System.out.println(board);
		}

	}

	public static void Toss() {
		if (Math.random() < 0.5){
			System.out.println("Heads: Computer starts first");
		}else{
			System.out.println("Tails: Player starts first");
		}	
	}


	public static void chooseSymbol() {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your Choose Symbol X or O");

		char symbol=sc.next().charAt(0);
		sc.close();

		if(symbol=='X'||symbol=='x') {
			playerChoose='X';
			compChoose='O';		
		}
		else if(symbol=='O'||symbol=='o')
		{
			playerChoose='O';
			compChoose='X';
		}
		else
		{
			System.out.println("Invalid Input");
		}		
	}

	public static void PrintBoard() {

		for(int i=1;i<board.length;i++)
		{
			board[i]=(char)i;

			System.out.println((int)board[i]);
		}
		System.out.println("|---|---|---|");
		System.out.println("| " + (int)board[1] + " | " + (int)board[2] + " | " + (int)board[3] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + (int)board[4] + " | "+ (int)board[5] + " | " + (int)board[6] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + (int)board[7] + " | " +  (int)board[8] + " | " + (int)board[9] + " |");
		System.out.println("|---|---|---|");		
	}

	public static void getMove() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your move ");
		userMove = sc.nextInt();
		sc.close();
	}

	public static void makeMove() {
		if(board[userMove]=='X'||board[userMove]=='x'||board[userMove]=='O'||board[userMove]=='o')
		{
			System.out.println("Not free space, choose anathor move");
			getMove();
		}
		else
		{
			board[userMove]=playerChoose;
		}		
	}
}


