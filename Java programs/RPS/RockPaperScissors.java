/* * [VYOM, TEAL TURTLE GROUP, CSCI 1301].java * Author:  [BRANTON GRAY DEARMOUN]  * Submission Date:  [9/27/2018] * 
 * 
 * 
 * * Purpose: This is a rock, paper, scissors simulator 
 * which will dynamically update  the score as the user
 *  plays it and provide real-time updates to keep you 
 *  in touch with the action. It also requires the user to
 *  call a class from a separate program in the same 
 *  directory location. * 
 * 
 * 
 * * Statement of Academic Honesty: * * The following code represents my own work. I have neither
 *  * received nor given inappropriate assistance. I have not copied * or modified code from any source other 
 *  than the course webpage * or the course textbook. I recognize that any unauthorized * assistance or 
 *  plagiarism will be handled in accordance with * the University of Georgia's Academic Honesty Policy and 
 *  the * policies of this course. I recognize that my work is based * on an assignment created by the 
 *  Department of Computer * Science at the University of Georgia. Any publishing  * or posting of source 
 *  code for this project is strictly * prohibited unless you have written consent from the Department * 
 *  of Computer Science at the University of Georgia.   */ 



import java.util.Scanner;


public class RockPaperScissors {
	
	public static Scanner keyboard = new Scanner(System.in);
	
	public static String computerMove = ComputerOpponent.getMove();
	public static void main(String[] args) {
	String move;
	int points = 0;
	int scoreP = 0, scoreC = 0;	
	
	System.out.print("Points to win:");
	points = keyboard.nextInt();
	
	while (points > scoreC ||  points > scoreP) {
		
		if (points == scoreP){
			System.out.println("CONGRATULATIONS, YOU HAVE WON!");
			System.exit(0);
			}
			
		if (points == scoreC){
				System.out.println("THE COMPUTER HAS WON! BETTER LUCK NEXT TIME!");
				System.exit(0);
			}
	
	System.out.println("Rock, paper or scissors?");
	
	move = keyboard.next();

	computerMove = ComputerOpponent.getMove();
	
	
	//Rock case
	
	
	if (move.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Rock")) {
		//create a tie
		System.out.println("It's a tie!!!"+ "("+scoreP+"-"+scoreC+")");
	}
	else if (move.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Paper")) {
		//credit the computer with one point
		scoreC++;
		
		System.out.println("The computer just scored! The Computer played Paper!" + "("+scoreP+"-"+scoreC+")");
	}
	else if (move.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) {
		//credit the user with one point
		scoreP++;
		
		System.out.println("You just scored!!! The Computer played Scissors!"+ "("+scoreP+"-"+scoreC+")");

	}
	
	//Paper case
	
	
	if (move.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) {
		//credit the user with one point
		scoreP++;
		
		System.out.println("You just scored!!! The Computer played Paper!"+ "("+scoreP+"-"+scoreC+")");
	}
	else if (move.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Paper")) {
		//credit no points
		System.out.println("It's a tie!!!"+ "("+scoreP+"-"+scoreC+")");
	}
	else if (move.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Scissors")) {
		//credit the computer with one point
		scoreC++;
		
		System.out.println("The computer just scored! The Computer played Scissors!"+ "("+scoreP+"-"+scoreC+")");

	}
	
	//Scissors case
	
	
	if (move.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Rock")) {
		//credit the computer with one point
		scoreC++;
		
		System.out.println("The computer just scored! The Computer played Rock!"+ "("+scoreP+"-"+scoreC+")");

	}
	else if (move.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper")) {
		//credit the user with one point
		scoreP++;
		
		System.out.println("You just scored!!! The Computer played Paper!"+ "("+scoreP+"-"+scoreC+")");

	}
	else if (move.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Scissors")) {
		//credit no points
		System.out.println("It's a tie!!!"+ "("+scoreP+"-"+scoreC+")");
	}
	
	
	
	
	else if  (!move.equalsIgnoreCase("rock") && !move.equalsIgnoreCase("paper") && !move.equalsIgnoreCase("scissors")){
		System.out.println("PLEASE CHOOSE EITHER 'ROCK', 'PAPER' OR 'SCISSORS'");
	}
	}
	
	

	}	
	}