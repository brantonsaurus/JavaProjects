/*for (int i = 1; i < position.length(); i++){
			number = 
			System.out.println(number);
		}
*/
import java.util.Scanner;

public class dashing {

	
	public static Scanner keyboard = new Scanner(System.in);
	public static String challenge = RandomWord.newWord();
	
	
	
	public static void main(String[] args) {
		
		String dash, change, position;
		int value = 0, value2 =0, value3=0, value4=0, value5=0, spaces, i, sum =0;
		challenge = RandomWord.newWord();
		dash = challenge.replaceAll(".", "-");
		boolean running = true;
		
while (running){		
		
		System.out.println("How many spaces would you like? (between 1 and 9)");
		
		System.out.println();
		System.out.println();

		
		
		
		System.out.println("Please enter a few positions separated by spaces");
		position = keyboard.nextLine();
		System.out.println();
		System.out.println();
		
		
		

		System.out.println(challenge);
		System.out.println(dash);
		
/* ERROR CHECKING EASY PART		
 * 
 * for (i = 0; i < position.length(); i++){
			if (IS NAN) { BREAK FREE
			}
	}
			
*/
		
		
		//prompt: please type in spaces
		//String inputSpaces = keyboard.nextLine();      "1 2 0"
		for (i = 0; 2*i < position.length(); i+=2){
			
			value = Character.getNumericValue(position.charAt(i));// what if they give you a 'b'
			//if secretWord.charAt(value)== guessedLetter
			//replacing 
			
			
			
		
		
		
		
		
		}

		System.out.printf("\n\nYour stored input values are: %d, %d, %d, %d, %d, %d \n\n", value, value2, value3, value4, value5, sum);
		value = 0; 
		value2 =0; 
		value3=0; 
		value4=0; 
		value5=0;
		sum = 0;
		
		
//		while (keyboard.hasNext()){
//			System.out.println(Character.getNumericValue(position.charAt(2*i)));
//	}		
		
		
		for (i = 0; i < dash.length(); i++) {
				
			change = dash.substring(0, i) + challenge.charAt((i)) + dash.substring(i+1, dash.length());
			
			System.out.println(change);
			
		}

		
}		

	}
}
