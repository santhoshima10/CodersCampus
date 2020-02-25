package com.javalearnings.week1;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {
	
	public static void main(String[] args) {
		int numOfAttempts = 5;
		int userInputNumber = 0;
		boolean gameWon = false;
		
		int randomNumber = generateRandomNumber();
		Scanner scanner = new Scanner(System.in);
		while(numOfAttempts > 0) {	
			System.out.println("Pick a number between 1 and 100");
	     	userInputNumber = scanner.nextInt();
	     	if(validUserInput(userInputNumber)) {
	     		if(userInputNumber == randomNumber) {
	     			gameWon = true;
	     			System.out.println( "You win!");
	     			break;
	     		}
	     		else {
	     			if(userInputNumber > randomNumber) {
	     				System.out.println( "Please pick a lower number");
	     			}
	     			else {
	     				System.out.println( "Please pick a higher number");
	     			}
	     		}
	     		numOfAttempts --;
	     	}
	     	else {
	     		System.out.println("Your guess is not between 1 and 100, please try again");
	     	}
	     	
		}
		if(!gameWon) {
			System.out.println( "You lose!");
			System.out.println( "The number to guess was: "+randomNumber);
		}
		scanner.close();
		
	}
	
	public static boolean validUserInput(int input) {
		if(input >= 1 && input <= 100) {
			return true;
		}
		else{
			return false;
		}
	}
	
	public static int generateRandomNumber() {
		Random random = new Random();
		return random.nextInt(100)+1;
		
	}

}
