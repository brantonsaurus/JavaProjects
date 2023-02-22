import java.util.Scanner;

/* * [VYOM, TEAL TURTLE GROUP, CSCI 1301].java 
 * * Author:  [BRANTON GRAY DEARMOUN]  
 * * Submission Date:  [9/20/2018] * 
 *
 * * Purpose: This lab was meant to test our skills at debugging. The original
 * temperature converter program was sprinkled with errors that caused the program
 * to act in unexpected ways. I went through and corrected each instance of an error
 * with the corresponding solution which I noted within the corrected program below.* 
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

	public class TemperatureConverter{
	
		//creating the scanner object
		static Scanner keyboard = new Scanner(System.in);
		public static void main(String[] args) {
		
	  	 // Corrected constant so that it was positive.
		 
		 final double MIN_FAHRENHEIT = 459.67;
		 
		 // Declare the variables. 
	 
		 double fahrenheit;
		 double convertedDegrees;
		 int tempScale;
		 //removed the extraneous string declaration
		 String tempScaleStr;
	 
		
	 
		 System.out.print("Enter the temperature in Fahrenheit: ");               
		 fahrenheit =  keyboard.nextDouble();  
	 
		 // Corrected the operator and rewrote the print statement.
		 if (fahrenheit > MIN_FAHRENHEIT) {
			 System.out.print("The temperature must be less than or equal to " + MIN_FAHRENHEIT);
			 System.exit(0);
		 }
	 
		 System.out.print (
				 "Enter the temperature scales you want to convert to:\n"+ 
				 "1. Kelvin \n"+
				 "2. Rankine \n"+
				 "3. Reaumur \n"+
				 "4. Celsius\n"+
				 "Enter a temperature scale: ");
		 tempScale = keyboard.nextInt();
		 //corrected the operator errors to set it within the range (1,4) to prevent
		 //the user from falling outside of the parameters of the program
		 if (tempScale < 1 | tempScale > 4) {
			 System.out.println("Unknown temperature scale  -" +
			 					"  cannot do calculation. Bye");
		 }
		 else {
			//corrected the integer values to doubles alongside all operator errors
			 if (tempScale == 1) {
				 convertedDegrees = (fahrenheit+MIN_FAHRENHEIT)*(5.0/9.0);
				 tempScaleStr="Kelvin"; 
			 } 
			 //corrected to the correct variable name convertedDegrees -> fahrenheit
			 else if (tempScale == 2) { 
	 			convertedDegrees = fahrenheit + MIN_FAHRENHEIT;  
	 			tempScaleStr="Rankine";
	 		//corrected the integer values to doubles and renamed Rankine to Reaumur
			 } else if (tempScale == 3) { 
				 convertedDegrees = (fahrenheit-32)*(4.0/9.0) ;
				 tempScaleStr="Reaumur";
			//corrected the integer values to doubles
			 } else {
				 convertedDegrees = (fahrenheit-32)*(5.0/9.0);
				 tempScaleStr="Celsius";
			 }

			 System.out.println(fahrenheit + " degrees Fahrenheit is " + convertedDegrees + " degrees "+ tempScaleStr + ".");
		 }
	 }
	}