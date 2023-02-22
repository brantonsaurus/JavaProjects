/* * [VYOM, TEAL TURTLE GROUP, CSCI 1301].java 
 * * Author:  [BRANTON GRAY DEARMOUN]  
 * * Submission Date:  [10/18/2018] * 
 *
 * *This is a hangman project with error checkers to prevent the user from halting the program with one of the errors detailed in the project pdf.
 * It has a series of do-while, for and while loops which cause the program to perpetually run until the user either fails or decides not to play
 * any more after a round concludes.
 * 
 * My secret word is called challenge
 * 
 * * Statement of Academic Honesty: * * The following code represents my own work. I have neither
 *  * received nor given inappropriate assistance. I have not copied * or modified code from any source other 
 *  than the course webpage * or the course textbook. I recognize that any unauthorized * assistance or 
 *  plagiarism will be handled in accordance with * the University of Georgia's Academic Honesty Policy and 
 *  the * policies of this course. I recognize that my work is based * on an assignment created by the 
 *  Department of Computer * Science at the University of Georgia. Any publishing  * or posting of source 
 *  code for this project is strictly * prohibited unless you have written consent from the Department * 
 *  of Computer Science at the University of Georgia.   
 *  
 *  */ 

import java.util.Scanner;

public class Hangman2 {

	
	public static Scanner keyboard = new Scanner(System.in);
	public static String challenge = RandomWord.newWord();
	
	
	public static void main(String[] args) {


		boolean playing = true, valid = false, success = false, invalid = false, roundStart = true;
//the difficulty is the desired number of spaces		
		int guessesRemaining = 20, i, games = 1, score = 0;
		char difficulty =' ';
		
		String dash ="", answer, guess, position;
		
//the obfuscated word is dash, which is replaced with correct guesses as the game progresses		
		challenge = RandomWord.newWord();
		dash = challenge.replaceAll(".", "-");
	
		
		
		
		
	
//tester		
		//System.out.println("THE LAST INPUT WAS"+difficulty);
	
		
//This is the engine of this hang man game
		while (playing && guessesRemaining > 0)	{	
			
//Each new round pulls a new difficulty from the user
			while (roundStart) { 
				System.out.println("The word is: "+dash);
				System.out.println("Enter the number of spaces allowed:");
				difficulty = keyboard.next().charAt(0);
					if (Character.isDigit(difficulty) && Character.getNumericValue(difficulty) <= challenge.length()) {
						//tester
						// System.out.print("YOU JUST INPUT"+difficulty);
						roundStart = false;
																													}//closes if
					else{
						System.out.println("Your input is not valid. Try again.");
						roundStart = true;
						}//closes else
					
				}//closes the round loop which also has an error checker to make sure the
	
		//tester
		//		System.out.println(challenge);
		
			
			//prints the dash string which is updated while playing loop	
				System.out.println(dash);
		
				
				
		
		
				do { 
					System.out.println("PLease enter your guess.");
					guess = keyboard.next();
				if (Character.isLetter(guess.charAt(0)) && guess.length() <= 1 && guess.length() > 0) {
					break;
																									}//closes if
					else{
						System.out.println("Your input is not valid. Try again.");
						valid = true;
						}//closes else
				} while (valid);//closes do-while error checker for guesses
	//tester			
		//System.out.println("THE LAST INPUT WAS"+guess);
				
		//handles consumed return
				keyboard.nextLine();
				
//Created an error handler that checks whether the user uses values greater than those within the string,
//checks to make sure the user uses numerical values and that the length is set according to the desired
//number of spaces.
				
				do{	
					System.out.println("Please enter the spaces you want to check (separated by spaces):");
					position = keyboard.nextLine();	
					invalid = false;	
					if (position.length() > Character.getNumericValue(difficulty)*2-1){
						System.out.println("Your input is not valid. Try again.");
						invalid = true;
						continue;
					}//close if
					
					
					//tester
//					System.out.println("THE LAST INPUT WAS"+position+position.length());
					
					
					for (int k = 0; position.length() > k; k++){
						if (Character.isLetter(position.charAt(k)) || Character.getNumericValue(position.charAt(k)) > challenge.length()) {
							System.out.println("Your input is not valid. Try again.");
							invalid = true;
							continue;
																}//closes if
						if	( Character.isLetter(position.charAt(k)) && k == position.length()) {
						//	System.out.println(invalid);	
							break;
								}//closes else
														}//closes for checker
				} while (invalid);//closes do-while loop		
		
				
		
		for (int j = Character.getNumericValue(difficulty)*2-1; j > 0; j--){

//testers			
//		System.out.println("J is value:"+j);
//		System.out.println("Spaces is value:"+Character.getNumericValue(difficulty));
//		System.out.println("Your string is value:"+position.length());
		
			for (i = 0; i <= position.length(); i+=2){
				
				if (challenge.charAt(Character.getNumericValue(position.charAt(i))) == guess.charAt(0)){
					dash = dash.substring(0 , Character.getNumericValue(position.charAt(i)))+ dash.substring(Character.getNumericValue(position.charAt(i)), Character.getNumericValue(position.charAt(i))) + guess + dash.substring(Character.getNumericValue(position.charAt(i))+1 ,challenge.length());
					
//					System.out.println("Your score is: "+guessesRemaining);
//					System.out.println("I is value:"+i);
					
				}//closes if		
				
//PREVENTS DEDUCTIONS FOR CORRECT ANSWERS BY COMPARING AGAINST A BOOLEAN	
				if  (challenge.charAt(Character.getNumericValue(position.charAt(i))) == guess.charAt(0)){
					
					success = true;
				} //closes else statement for deductions checker
				
			} //close the for loop which checks the whole word for your guess
			
		}//closes repeat for the number of spaces chosen
							if (success == true){
									System.out.println("Guesses remaining: "+guessesRemaining);
									System.out.println("The word is: "+dash);
							}//closes if for scoring
								else {
									success = false;
									guessesRemaining -= 1;
									System.out.println("The letter you guessed was not found in the secret word.");
									System.out.println("Guesses remaining: "+guessesRemaining);
									System.out.println("The word is: "+dash);
								}//closes else for scoring
		
			if (challenge.equals(dash)) {
				
									playing = false;
									System.out.println("Congratulations! You have won!");
									score += guessesRemaining*10/Character.getNumericValue(difficulty);
									System.out.println("Your score is: "+score);
									System.out.println("Do you want to keep playing? Yes(y) or No(n)");
									answer = keyboard.next();
					
						if (answer.substring(0,1).equalsIgnoreCase("y")){
									
									score += guessesRemaining*10/Character.getNumericValue(difficulty);
									games++;
									
									if (games > 20){
											
										System.out.println("You've completed 20 games. Please find something else to do.");
										System.exit(0);
									}//closes checker for exceeding number of games, for completing the round or other sundry things.
									
									
									challenge = RandomWord.newWord();
									dash = challenge.replaceAll(".", "-");
									roundStart=true;
									playing = true;
				
						}//closes if statement to see if the person wants to play another round.
						
			else {
				System.out.println("Goodbye!");
				System.exit(0);
			}//exits the program after an answer other than yes.
		}
		
		
}	
		
		
		if (guessesRemaining == 0) {
			System.out.println("You have lost, try again later, if you'd like.");
			System.out.println("Guesses remaining: "+guessesRemaining);
		}
			
	}
	}