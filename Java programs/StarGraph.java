/* * [VYOM, TEAL TURTLE GROUP, CSCI 1301].java * Author:  [BRANTON GRAY DEARMOUN]  * Submission Date:  [10/11/2018] * 
 * * Purpose: 

* 	This is a data visualization program which generates a bar graph of asterisks corresponding to a y value.
* 	It will print columns according to the length of the array and then entries according to the size of each
* 	value at each y value entry, the double ripped out of this y entry is cast into an integer, which truncates the double
* 	and allows me to use it to set a string size, filled with nulls which I can replace with asterisks.
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

public class StarGraph {
	
	public static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {

int size, i = 0;

double initial, increment;
String graph;
		
System.out.println("Please enter the number of values to process.");
size = keyboard.nextInt();
						if (size >= 0) {
System.out.println("Please enter your minimum x value.");
initial = keyboard.nextDouble();
System.out.println("Please enter the increment you'd like to use for x.");
increment = keyboard.nextDouble();
			if (increment >= 0){

double[] xValue = new double[size];
double[] yValue = new double[size];

System.out.println();
System.out.println();
System.out.println("Values");


		for (int index = 0; index < xValue.length; index++) {
			xValue[0] += initial;
			xValue[index] = initial+increment*index;
			yValue[index] += 20*Math.abs(Math.sin(xValue[index]));
			System.out.printf("\nx: %.3f, y: %.3f ", xValue[index] ,yValue[index]);
			}
		

System.out.println();
System.out.println();
System.out.println("Graph");
System.out.println();
System.out.println();

		for (i=0; i < xValue.length; i++) {
		//created a new string, setting the number of characters equal to the value of the index of the yValue at i, then replaced all the null
		//characters with asterisks.
			graph = new String(new char[(int) yValue[i]]).replace("\0", "*");
			System.out.println(" : "+graph);
			}
	
		}//closes increment error catcher
			else {
				System.out.print("The increment must be a double greater than zero");
				System.exit(0);
			}
						}//closes size error catcher
						else {
							System.out.print("The number of x values to process must be an integer greater than zero");
							System.exit(0);
						}
	
	
	}//closes main
}//closes class