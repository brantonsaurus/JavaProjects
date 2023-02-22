/* * [VYOM, TEAL TURTLE GROUP, CSCI 1301].java * Author:  [BRANTON GRAY DEARMOUN]  * Submission Date:  [9/6/2018] * 
 * * Purpose: This is a text parser which strips out location data and other particulars from a larger string
 * and outputs the relevant information for emergency services. * 
 * * Statement of Academic Honesty: * * The following code represents my own work. I have neither
 *  * received nor given inappropriate assistance. I have not copied * or modified code from any source other 
 *  than the course webpage * or the course textbook. I recognize that any unauthorized * assistance or 
 *  plagiarism will be handled in accordance with * the University of Georgia's Academic Honesty Policy and 
 *  the * policies of this course. I recognize that my work is based * on an assignment created by the 
 *  Department of Computer * Science at the University of Georgia. Any publishing  * or posting of source 
 *  code for this project is strictly * prohibited unless you have written consent from the Department * 
 *  of Computer Science at the University of Georgia.   */ 



import java.util.Scanner;

public class ParseTheTweet {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("\t\t\t\t\t!EMERGENCY SERVICES TWEET RELAY SYSTEM!");
		System.out.println();
		System.out.println("\t\tPlease enter your tweet with the appropriate tags and information separated by semicolons:");
		System.out.println();
		System.out.println();
		System.out.println();
		String tweet, tweet2, tweet3, tweet4, tweet5, tweet6, tweet7;
		String type, detail, location, latitude, longitude;
	
		tweet = keyboard.nextLine();
		tweet2 = tweet.substring(tweet.indexOf("#")+5, tweet.indexOf(";"));
		tweet3 = tweet.substring(tweet.indexOf(";")+2);
		tweet4 = tweet3.substring(tweet3.indexOf(";")+2);
		tweet5 = tweet4.substring(tweet4.indexOf(";")+2);
		tweet6 = tweet5.substring(tweet5.indexOf(";")+2);

		type = tweet2;
		detail = tweet3.substring(tweet3.indexOf("#")+5, tweet3.indexOf(";"));
		location = tweet4.substring(tweet4.indexOf("#")+5, tweet4.indexOf(";"));
		latitude = tweet5.substring(tweet5.indexOf("#")+5, tweet5.indexOf(";"));
		longitude = tweet6.substring(tweet6.indexOf("#")+5, tweet6.indexOf(";"));
		
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t\tTYPE:\t\t\t" + type.toUpperCase());
		System.out.println("\t\t\t\t\tDETAIL:\t\t\t" + detail.replace(",", "-").toLowerCase());
		System.out.println("\t\t\t\t\tLOCATION:\t\t" + location.replace(",", "-"));
		System.out.println("\t\t\t\t\tLATITUDE:\t\t" + latitude);
		System.out.println("\t\t\t\t\tLONGITUDE:\t\t" + longitude);
	}
}