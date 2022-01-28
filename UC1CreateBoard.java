package com.bridgelabz.workshop1;

import java.util.*;
public class UC1CreateBoard {
	public static void main(String[] args) {
		
		System.out.println("Welcome to Tic Tac Toe Game");
		CreateBoard();
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
}