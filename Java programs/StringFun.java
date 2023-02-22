/* * [VYOM, TEAL TURTLE GROUP, CSCI 1301].java * Author:  [BRANTON GRAY DEARMOUN]  * Submission Date:  [10/5/2018] * 
 * * Purpose: 

* 	This is a string manipulator that reverses and replaces characters continuously, unless the user desires to quit.
* 	It also has some error detection if the user inputs values beyond the string value or if the user inputs characters
* 	not contained within the string.
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
public class StringFun {

	public static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		//First, check the length of the string. Take a loop and reverse the character order. Rip out the characters and string them together.
		boolean running = true;
		int len = 0, i, position = 0;
		char disposal, retrieval;
		String original;
		String command, altered;
		
		
		
System.out.println("Please input the text you desire to modify");
		
		original = keyboard.nextLine();
		
		
		
		while (running) {
			altered = "";
			len = original.length();
			
			
System.out.println("\t\t\tHow would you like to modify your text?\n\n");
		System.out.println("Your options are:\n\n\t\tReverse\t\tReplace First\t\tReplace Last\t\tRemove\t\tRemove All\t\tQuit");
		command = keyboard.nextLine();
		
		
		
		
		//1 finished
		if (command.equalsIgnoreCase("reverse")) {
			
			for (i = len; len >= 1; len--) {
				
				altered += original.substring(len-1, len);
				
			}
		System.out.println("\nYour new sentence is: "+ altered +"\n\n");
		original = altered;
		}
		
		
		
		
		
		//2 finished
		if (command.equalsIgnoreCase("Replace First")) {
			
			System.out.print("please choose a character you would like to alter:");
				disposal = keyboard.next().charAt(0);
				keyboard.nextLine();
				
			System.out.print("\nplease choose a replacement character:");
				retrieval = keyboard.next().charAt(0);
				keyboard.nextLine();
				
				
				
				for (i = 0; i < len; i++) {
					
					if (original.charAt(i) == disposal) {
					altered = original.substring(0 , i)+ original.substring(i, i) + retrieval + original.substring(i+1 ,original.length());
					System.out.println("\nYour new sentence is: "+ altered+"\n\n");
					break;
				}	
					if (disposal != original.charAt(i) && i%len == 0) {
						altered = original;
						System.out.println("\n\nError, please choose a character within this string.");
						System.out.println("\n\nYour sentence is: "+ altered+"\n\n");
					}
					
					
				}
				original = altered;
		}
		

			
		//3 finished
		if (command.equalsIgnoreCase("Replace Last")) {
			
			System.out.print("please choose a character you would like to alter:");
				disposal = keyboard.next().charAt(0);
				keyboard.nextLine();
				
			System.out.print("\nplease choose a replacement character:");
				retrieval = keyboard.next().charAt(0);
				keyboard.nextLine();
				
				for (i = 0; i < len; i++) {
					
					if (original.charAt(i) == disposal) {
					altered = original.substring(0 , i)+ original.substring(i, i) + retrieval + original.substring(i+1 ,original.length());
					
				}	
					if (disposal != original.charAt(i) && i%len == 0) {
						altered = original;
						System.out.println("\n\nError, please choose a character within this string.");
						
					}
				}
				System.out.println("\n\nYour sentence is: "+ altered+"\n\n");
				original = altered;
		}
		
		
		
		
		//4 finished
		if (command.equalsIgnoreCase("Remove")) {

			
			
		System.out.print("please choose a character you would like to remove:");
			disposal = keyboard.next().charAt(0);
			
		System.out.print("\nplease choose the string position of the "+ disposal +" you would like to remove.  (Not the index - 1 = 1st, 2 = 2nd, etc.): ");
			position = keyboard.nextInt();
			keyboard.nextLine();
			if (position <= len) { 
			
			for (i = 0; i < len; i++) {
				
				if (original.charAt(i) == disposal && original.charAt(position) == original.charAt(i)) {
				altered = original.substring(0 , position) + original.substring(position+1 ,original.length());
				
				}
				if (disposal != original.charAt(i) && i%len == 0 && original.charAt(position) != original.charAt(i)) {
					altered = original;
					System.out.println("\n\nError, please choose a character within this string to replace.");
				}
			
					
			}
			System.out.println("\n\nYour sentence is: "+altered+"\n\n");
			original = altered;
			
		}
			else {
				original = altered;
				System.out.println("\n\nError, please choose a character within the bounds of the string.");
				System.out.println("\n\nYour sentence is: "+altered+"\n\n");
		}
		}
		
		
		//5 finished
		if (command.equalsIgnoreCase("Remove All")) {

			
			
			System.out.print("please choose a character you would like to remove:");
				disposal = keyboard.next().charAt(0);
				
			
				keyboard.nextLine();
				
				
				
				for (i = 0; i < len; i++) {
					
					if (original.charAt(i) != disposal) {
						altered +=  original.charAt(i);	
					}
					if (disposal != original.charAt(i) && i%len == 0) {
						System.out.println("\n\nError, please choose a character within this string.");
					}
				}
				
				System.out.println("\n\nYour sentence is: "+ altered+"\n\n");
				original = altered;
			}
		
		
		
		
		//6 finished
		if (command.equalsIgnoreCase("Quit")) {
			
			System.out.println("Now Quitting");
			System.exit(0);
		}
		

		} 
	}
}