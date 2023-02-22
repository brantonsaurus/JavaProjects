import java.util.Scanner;

/* * [VYOM 1301].java 
 * * Author:  [Branton Gray DeArmoun] 
 *  * Submission Date:  [9/21/2018] * 
 *  
 *  * Purpose: This is a program which takes user input for weighted percentage course averages and calculates (when values are missing) the required
 *  score the user needs to achieve in order to earn the grade they desire. If all weighted values are known, the user will be delivered a final score. * 
 *  I created a number of nested if-else statements which interrogates the data at key breakpoints to determine what the user will be awarded at that point
 *  and whether they will be guaranteed a score.
 *  
 *  
 *  
 *  
 *  * Statement of Academic Honesty: * 
 *  * The following code represents my own work. I have neither 
 *  * received nor given inappropriate assistance. I have not copied
 *   * or modified code from any source other than the course webpage 
 *   * or the course textbook. I recognize that any unauthorized *
 *    assistance or plagiarism will be handled in accordance with * 
 *    the University of Georgia's Academic Honesty Policy and the *
 *     policies of this course. I recognize that my work is based *
 *      on an assignment created by the Department of Computer * 
 *      Science at the University of Georgia. Any publishing  * 
 *      or posting of source code for this project is strictly *
 *       prohibited unless you have written consent from the Department *
 *        of Computer Science at the University of Georgia.   */ 


public class GradeCalculator {
	 
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
	
		
		//ALL VARIABLES DECLARED
		
		double exam1, exam2, finalExam, lab, project, attendance, quiz;
//not assuming entered weights to be whole integers
		double exam1W, exam2W, finalExamW, labW, projectW, attendanceW, quizW;
		double TotalGradeWeight, currentGrade, fTotal, dTotal, cTotal, bTotal, aTotal;
		String desiredGrade, ynQuestion;
		//I used these variables in this message block as test values while I was constructing the program, 
//		to see when I had properly initialized/de-initialized the weighted portion of the variables
//		double examTotal, LabTotal, ProjectTotal, AttendanceTotal, QuizTotal;
		
		//initialize these to zero or dummy values for later reassignment
		
		exam1 = 0;
		exam2 = 0;
		finalExam = 0;
		lab = 0;
		attendance = 0;
		quiz = 0;
		project = 0;
		desiredGrade = "";
				
		System.out.println("Grading Scale:");
		System.out.println("A\t\t\t90-100");
		System.out.println("B\t\t\t80-89");
		System.out.println("C\t\t\t70-79");
		System.out.println("D\t\t\t60-69");
		System.out.println("F\t\t\tbelow 60");
		System.out.println("What letter grade do you want to achieve for the course?");
		desiredGrade = keyboard.next();
//Created an error catcher which closes the program in the event that the user 
//enters a value that is not a letter grade, since the desired grade has 
// to be capitalized, I used a case-sensitive boolean string operator
		if (desiredGrade.equals("A") || desiredGrade.equals("B") || desiredGrade.equals("C") || desiredGrade.equals("D") || desiredGrade.equals("F")) {
		
		
		
		System.out.println("Enter Percentage Weights:");
		System.out.print("Exam 1:\t\t\t");
		exam1W = keyboard.nextDouble();
		System.out.print("Exam 2:\t\t\t");
		exam2W = keyboard.nextDouble();
		System.out.print("Final Exam:\t\t");
		finalExamW = keyboard.nextDouble();
		System.out.print("Labs:\t\t\t");
		labW = keyboard.nextDouble();
		System.out.print("Projects:\t\t");
		projectW = keyboard.nextDouble();
		System.out.print("Attendance:\t\t");
		attendanceW = keyboard.nextDouble();
		System.out.print("Enter Quiz Weight:\t");
		quizW = keyboard.nextDouble();
		
//Created an error catcher which closes if the user inputs a value less than 100 for weights
		
		if(quizW+projectW+labW+exam1W+exam2W+finalExamW+attendanceW != 100) {
			
		System.out.println("Weights don\'t add up to 100, program exiting_");
		System.exit(0);
		
		}
		
		System.out.println();
		System.out.println("ENTER YOUR SCORES OUT OF A 100.");
		System.out.println();
		
//I created an inside-out nested if else to query for each exam score independently & skip entirely
//if the user doesn't know a score. Then, using if(s), I did the same thing for each section score.
//Although this does not have an error handler if the user inputs a value that is not numerical.
		
		System.out.println("Do you know your Exam 1 score?");
		ynQuestion = keyboard.next();	
		if (ynQuestion.substring(0,1).equalsIgnoreCase("y"))
		{
			
			System.out.print("Exam 1:");
			exam1 = keyboard.nextDouble();
			
			System.out.println("Do you know your Exam 2 score?");
			ynQuestion = keyboard.next();
			if (ynQuestion.substring(0,1).equalsIgnoreCase("y")) {
				
				System.out.print("Exam 2:");
				exam2 = keyboard.nextDouble();

				System.out.println("Do you know your Final Exam score?");
				ynQuestion = keyboard.next();
				if (ynQuestion.substring(0,1).equalsIgnoreCase("y")) {
					
					System.out.print("Final Exam:");
					finalExam = keyboard.nextDouble();}
				
				
				else finalExamW = 0;}			
			
			else {exam2W = 0;}{finalExamW = 0;}}
				
		else {exam1W = 0;}{exam2W = 0;}{finalExamW = 0;}				
		
				
		System.out.println("Do you know your Lab score?");
		ynQuestion = keyboard.next();
			
		if (ynQuestion.substring(0,1).equalsIgnoreCase("y")) {
				System.out.print("Labs:");
				lab = keyboard.nextDouble();
				}
		else labW = 0;
				
		System.out.println("Do you know your Project score?");
		ynQuestion = keyboard.next();
		
		if (ynQuestion.substring(0,1).equalsIgnoreCase("y")) {
					System.out.print("Projects:");
					project = keyboard.nextDouble();
				}
		else projectW = 0;
					
		System.out.println("Do you know your Quiz score?");
		ynQuestion = keyboard.next();
		
		if (ynQuestion.substring(0,1).equalsIgnoreCase("y")) {
				System.out.print("Quizzes:");
				quiz = keyboard.nextDouble();
			}
		else quizW = 0;
		
		System.out.println("Do you know your Attendance score?");
		ynQuestion = keyboard.next();
		
		if (ynQuestion.substring(0,1).equalsIgnoreCase("y")) {
					System.out.print("Attendance:");
					attendance = keyboard.nextDouble();
				}
		else attendanceW = 0;
/*I created each of these values for reference, while I was constructing the program, although I did not use them
		in the final product.
				examTotal = (((exam1*(exam1W) + exam2*(exam2W) + finalExam*(finalExamW)))/(exam1W+exam2W+finalExamW));
				System.out.print("Exams:");
				System.out.println(examTotal);
				
				LabTotal = (((Lab*(LabW))/(LabW)));
				System.out.print("Labs:");
				System.out.println(LabTotal);
				
				System.out.print("Projects");
				ProjectTotal = (((Project*(ProjectW))/(ProjectW)));
				System.out.println(ProjectTotal);
				
				System.out.print("Attendance:");
				AttendanceTotal = ((Attendance*(AttendanceW))/(AttendanceW));
				System.out.println(AttendanceTotal);
				
				System.out.print("Quizzes:");
				QuizTotal = ((Quiz*(QuizW))/(QuizW));
				System.out.println(QuizTotal);
*/
				
				
//This is the meat of the program, where it will provide all the information to justify a grade	and references for comparison values
			TotalGradeWeight = quizW+projectW+labW+exam1W+exam2W+finalExamW+attendanceW;
				
			
			currentGrade = (exam1*exam1W + exam2*exam2W + finalExam*finalExamW + lab*labW + project*projectW + attendance*attendanceW + quiz*quizW)/(exam1W + exam2W + finalExamW + labW + projectW + attendanceW + quizW);
//here are my incomplete weighted averages used to calculate the necessary grade floor to receive a certain grade.
			aTotal = ((100*90 - (currentGrade*TotalGradeWeight))/(100 - TotalGradeWeight));
			bTotal = ((100*80 - (currentGrade*TotalGradeWeight))/(100 - TotalGradeWeight));
			cTotal = ((100*70 - (currentGrade*TotalGradeWeight))/(100 - TotalGradeWeight));
			dTotal = ((100*60 - (currentGrade*TotalGradeWeight))/(100 - TotalGradeWeight));
			fTotal = ((100*59 - (currentGrade*TotalGradeWeight))/(100 - TotalGradeWeight));
			
//assign a grade character according to score using a simple iterative if block
			
			char grade = ' ';
			
			if (currentGrade >= 90){
				grade = 'A';
			}
			if (currentGrade < 90 && currentGrade >= 80){
				grade = 'B';
			}
			if (currentGrade < 80 && currentGrade >= 70){
				grade = 'C';
			}

			if (currentGrade < 70 && currentGrade >= 60){
				grade = 'D';
			}
			if (currentGrade < 60){
				grade = 'F';
			}

			
//Error handler when the user doesn't know any of their scores
			if (TotalGradeWeight <= 0) {
				
				System.out.println("PLEASE RUN AGAIN WHEN YOU HAVE SCORES TO ENTER");
				System.exit(0);
			}
			
			
//THIS SET OF IF STATEMENTS OCCURS WHEN THE USER DOES NOT HAVE ALL OF THEIR SCORES
			
			
			if (desiredGrade.equalsIgnoreCase("A") && TotalGradeWeight != 100) {
				
			System.out.printf("\nYour current score is: %.2f", currentGrade);
			System.out.println();
			System.out.printf("\nYOUR CURRENT LETTER GRADE IS: %c!", grade);
				if (aTotal > 100) {
					System.out.println();
					System.out.println();
					System.out.println("Sorry, you will not be able to receive, "+desiredGrade+", the grade you desire in this course");
				}
				else if (aTotal < 100 && aTotal != 0){
						System.out.println();
						System.out.printf("\nYou must score an average greater than or equal to %.2f in your remaining coursework to receive an A in the course.\n", aTotal);
					}
				
				else {
					System.out.println();
					System.out.println();
					System.out.println("You'll certainly receive at least an A");
				}
			}	
			
			if (desiredGrade.equalsIgnoreCase("B") && TotalGradeWeight != 100) {
				
			System.out.printf("\nYour current score is: %.2f", currentGrade);
			System.out.println();
			System.out.printf("\nYOUR CURRENT LETTER GRADE IS: %c!", grade);
				if (bTotal > 100) {
					System.out.println();
					System.out.println();
					System.out.println("Sorry, you will not be able to receive, "+desiredGrade+", the grade you desire in this course");
				}
				else if (bTotal < 100 && bTotal != 0){
						System.out.println();
						System.out.printf("\nYou must score an average greater than or equal to %.2f in your remaining coursework to receive an B in the course.\n", bTotal);
				}
				else {
					System.out.println();
					System.out.println();
					System.out.println("You'll certainly receive at least a B");	
				}	
		
			}
			
			if (desiredGrade.equalsIgnoreCase("C") && TotalGradeWeight != 100) {
				
			System.out.printf("\nYour current score is: %.2f", currentGrade);
			System.out.println();
			System.out.printf("\nYOUR CURRENT LETTER GRADE IS: %c!", grade);
				if (cTotal > 100) {
					System.out.println();
					System.out.println();
					System.out.println("Sorry, you will not be able to receive, "+desiredGrade+", the grade you desire in this course");
				}
				else if (cTotal < 100 && cTotal != 0){
						System.out.println();
						System.out.printf("\nYou must score an average greater than or equal to %.2f in your remaining coursework to receive a C in the course.\n", cTotal);
					
				}
				else {
					System.out.println();
					System.out.println();
					System.out.println("You'll certainly receive at least a C");
				}
			}
			
			if (desiredGrade.equalsIgnoreCase("D") && TotalGradeWeight != 100) {
			
			
			System.out.printf("\nYour current score is: %.2f", currentGrade);
			System.out.println();
			System.out.printf("\nYOUR CURRENT LETTER GRADE IS: %c!", grade);
				if (dTotal > 100) {
					System.out.println();
					System.out.println();
					System.out.println("Sorry, you will not be able to receive, "+desiredGrade+", the grade you desire in this course");
				}
				else if (dTotal < 100 && dTotal != 0){
						System.out.println();
						System.out.printf("\nYou must score an average greater than or equal to %.2f in your remaining coursework to receive a D in the course.\n", dTotal);
					
				}
				
				else {
					System.out.println();
					System.out.println();
					System.out.println("You'll certainly receive at least a D");
				}
				
			}
			
			if (desiredGrade.equalsIgnoreCase("F") && TotalGradeWeight != 100) {
			
			
			System.out.printf("\nYour current score is: %.2f", currentGrade);
			System.out.println();
			System.out.printf("\nYOUR CURRENT LETTER GRADE IS: %c!", grade);
				if (fTotal > 100) {
					System.out.println();
					System.out.println();
					System.out.println("Sorry, you will not be able to receive, "+desiredGrade+", the grade you desire in this course");
				}
				else if (fTotal < 100 && fTotal != 0){
					System.out.println();
					System.out.println();
					System.out.printf("\nYou must score an average greater than or equal to %.2f in your remaining coursework to receive an F in the course.\nYour current letter grade is %c\n", fTotal, grade);}
				
				
				else {	System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("You'll certainly receive at least an F");
				}
			}
			
//THE USER HAS ALL THE INFORMATION AND THE PROGRAM WILL DETERMINE A FINAL LETTER GRADE
			
			if (TotalGradeWeight == 100 && currentGrade >= 90)  {
				System.out.println();
				System.out.println("YOU WANTED THIS GRADE: "+desiredGrade);
				System.out.println();
				System.out.printf("Current grade Score: %.2f\n", currentGrade);;
				System.out.printf("\nCONGRATULATIONS! YOUR FINAL LETTER GRADE IS AN %c!", grade);
					
				if (desiredGrade.equalsIgnoreCase("B") ||desiredGrade.equalsIgnoreCase("C")||desiredGrade.equalsIgnoreCase("D")||desiredGrade.equalsIgnoreCase("F")) {
					System.out.println();
					System.out.println();
					System.out.println("Unfortunately, you cannot receive the grade, "+desiredGrade+", which you desired.");
				
				}
				
				}
				
			if (TotalGradeWeight == 100  && currentGrade >= 80 && currentGrade < 90) {
				System.out.println();
				System.out.println("YOU WANTED THIS GRADE: "+desiredGrade);
				System.out.println();
				System.out.printf("\nCurrent grade Score: %.2f\n", currentGrade);
				System.out.printf("\nYOUR FINAL LETTER GRADE IS A %c!", grade);
				
				if (desiredGrade.equalsIgnoreCase("A") ||desiredGrade.equalsIgnoreCase("C")||desiredGrade.equalsIgnoreCase("D")||desiredGrade.equalsIgnoreCase("F")) {
					System.out.println();
					System.out.println();
					System.out.println("Unfortunately, you cannot receive the grade, "+desiredGrade+", which you desired.");
				
				}
					
				}
			
			if (TotalGradeWeight == 100  && currentGrade >= 70 && currentGrade < 80) {
				System.out.println();
				System.out.println("YOU WANTED A"+desiredGrade);
				System.out.println();
				System.out.printf("\nCurrent grade Score: %.2f\n", currentGrade);
				System.out.printf("\nYOUR FINAL LETTER GRADE IS A %c!", grade);
					
				if (desiredGrade.equalsIgnoreCase("A") ||desiredGrade.equalsIgnoreCase("B")||desiredGrade.equalsIgnoreCase("D")||desiredGrade.equalsIgnoreCase("F")) {
					System.out.println();
					System.out.println();
					System.out.println("Unfortunately, you cannot receive the grade, "+desiredGrade+", which you desired.");
				
				}
				
				}
				
			if (TotalGradeWeight == 100  && currentGrade >= 60  && currentGrade < 70) {
				System.out.println();
				System.out.println("YOU WANTED THIS GRADE: "+desiredGrade);
				System.out.println();
				System.out.printf("\nCurrent grade Score: %.2f\n", currentGrade);
				System.out.printf("\nYOUR FINAL LETTER GRADE IS A %c!", grade);
					
				if (desiredGrade.equalsIgnoreCase("A") ||desiredGrade.equalsIgnoreCase("B")||desiredGrade.equalsIgnoreCase("C")||desiredGrade.equalsIgnoreCase("F")) {
					System.out.println();
					System.out.println();
					System.out.println("Unfortunately, you cannot receive the grade, "+desiredGrade+", which you desired.");
				
				}
				
				
				}
				
			if (TotalGradeWeight == 100  && currentGrade < 60) {
				System.out.println();
				System.out.println("YOU WANTED THIS GRADE: "+desiredGrade);
				System.out.println();
				System.out.printf("\nCurrent grade Score: %.2f\n", currentGrade);
				System.out.printf("\nYOUR FINAL LETTER GRADE IS AN %c!", grade);
				
				if (desiredGrade.equalsIgnoreCase("A") ||desiredGrade.equalsIgnoreCase("B")||desiredGrade.equalsIgnoreCase("C")||desiredGrade.equalsIgnoreCase("D")) {
					System.out.println();
					System.out.println();
					System.out.println("Unfortunately, you cannot receive the grade, "+desiredGrade+", which you desired.");
				
				}
				
				}
			
			
				//System.out.println(TotalGradeWeight);
				System.out.println();
				//System.out.printf("\n %.2f" , currentGrade);
		}
			
			
		else {
			
			System.out.println("Input Error");
			System.exit(0);
		}	
		
		} //closes the input error if else for non-letter-grade input
		
}