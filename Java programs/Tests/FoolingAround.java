/* * [VYOM, TEAL TURTLE GROUP, CSCI 1301].java 
 * * Author:  [BRANTON GRAY DEARMOUN]  
 * * Submission Date:  [10/18/2018] * 
 *
 * *This is a hangman project with error checkers to prevent
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

public class FoolingAround {

	
	public static Scanner keyboard = new Scanner(System.in);
	public static String challenge = RandomWord.newWord();
	
	
	public static void main(String[] args) {
		
		boolean playing = true, valid = false, success = false, invalid = false, roundStart = true;
		
		int guessesRemaining = 1, i, games = 1, score = 0;
		char difficulty =' ';
		
		String dash ="", answer, guess, position;
		
		
		challenge = RandomWord.newWord();
		dash = challenge.replaceAll(".", "-");
	
		
		
		
		
	
//tester		
		//System.out.println("THE LAST INPUT WAS"+difficulty);
	
		
		//This is the main engine of this hangman game MAKE SURE TO PUT IN YOUR REMAINING GUESS BOOLEAN TO FINISH
		while (playing && guessesRemaining > 0)	{	
			

			while (roundStart) { 
				System.out.println("The word is: "+dash);
				System.out.println("How many spaces would you like to check per play?");
				System.out.println("Your number of guesses per play cannot exceed the length of our secret word this round (" + challenge.length() +") and must be numerical.");
				difficulty = keyboard.next().charAt(0);
					if (Character.isDigit(difficulty) && Character.getNumericValue(difficulty) <= challenge.length()) {
						//tester
						// System.out.print("YOU JUST INPUT"+difficulty);
						roundStart = false;
																													}//closes if
					else{
						System.out.println("YOUR INPUT IS NOT VALID, TRY AGAIN.");
						System.out.println("How many spaces would you like to check per play? Your number of guesses per play cannot exceed the length of our secret word this round (" + challenge.length() +") and must be numerical.");
						roundStart = true;
						}//closes else
					
				}
	
		//tester
		//		System.out.println(challenge);
		//prints the dash string and is updated towards the end of the while playing loop
				System.out.println(dash);
		
				
				System.out.println("PLease enter your guess.");
		
		
				do { guess = keyboard.next();
				if (Character.isLetter(guess.charAt(0)) && guess.length() <= 1 && guess.length() > 0) {
					break;
																									}//closes if
					else{
						System.out.println("YOUR INPUT IS NOT VALID, TRY AGAIN.");
						System.out.println("PLease enter your guess.");
						valid = true;
						}//closes else
				} while (valid);//closes do-while
	//tester			
		//System.out.println("THE LAST INPUT WAS"+guess);
				
		//handles consumed return
				keyboard.nextLine();
				
				System.out.println("Please print the position you'd like to try.");
				
				do{	position = keyboard.nextLine();
					invalid = false;
					if (position.length() > Character.getNumericValue(difficulty)*2-1 || position.length() < Character.getNumericValue(difficulty)*2-1){
						System.out.println("YOUR STRING IS TOO LONG OR SHORT, TRY AGAIN.");
						System.out.println("Please print the position you'd like to try.");	
						invalid = true;
						continue;
					}//close if
					
//					System.out.println("THE LAST INPUT WAS"+position+position.length());
					for (int k = 0; position.length() > k; k++){
						if (Character.isLetter(position.charAt(k))) {
							invalid = true;
							System.out.println("YOUR INPUT IS NOT VALID, TRY AGAIN.");
							System.out.println("Please print the position you'd like to try.");	
							System.out.println(invalid);

																}//closes if
						if	( Character.isLetter(position.charAt(k)) && k == position.length()) {
							System.out.println(invalid);	
							break;
								}//closes else
														}//closes for checker
				} while (invalid);//closes while loop		
		
				
		
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
			}
		}//closes repeat for the number of spaces chosen
							if (success == true){
									System.out.println("Your guesses remaining are: "+guessesRemaining);
									System.out.println("Your current word is: "+dash);
							}
								else {
									guessesRemaining -= 1;
									System.out.println("The letter you guessed was not found in the secret word.");
									System.out.println("Your guesses remaining are: "+guessesRemaining);
									System.out.println("Your current word is: "+dash);
								}
		
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
									}//closes checker for exceeding number of games
									
									
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
			System.out.println("You have lost, try again later, please.");
			playing = true;
		}
			
	}
	}