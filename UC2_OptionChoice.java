package com.bridgelabz.workshop1;

import java.util.*;
public class UC2_OptionChoice {
	public static void main(String[] args) {
		
		System.out.println("Welcome to Tic Tac Toe Game");
		CreateBoard();
		Option();
	}

	static void CreateBoard() 
	{
		char board[]= new char[10];
		board[1]=' ';
		board[2]=' ';
		board[3]=' ';
		board[4]=' ';
		board[5]=' ';
		board[6]=' ';
		board[7]=' ';
		board[8]=' ';
		board[9]=' ';
	}	
	
	static void Option()
	{
		char in;
		char player=' ',comp= ' ';
		Scanner sc = new Scanner(System.in);
		System.out.println("Input X or O:");
		in=sc.next().charAt(0);
		//System.out.println("Character Entered is:"+in);
		if(in=='x')
		{
			player=in;
			comp='o';
			System.out.println("Player Entered:"+player);
			System.out.println("Computer Entered:"+comp);
		}
		else if(in=='o')
		{
			comp=in;
			player='x';
			System.out.println("Computer Entered:"+comp);
			System.out.println("Payer Enterd:"+player);
		}
		
	}
}
