package weirdy;

import java.util.Scanner;

public class Weirdy {
	static Scanner keyboard = new Scanner(System.in);	
	public static double SOUTH = 39.882343;
	public static double NORTH = 40.231315;
	public static double  WEST = -105.743511;
	public static double  EAST = -104.907864;
	public enum MessageCategory {NEED, ALERT, OFFER, INFO, UNKNOWN}
		
	
	
	public static void main(String[] args) {
		
		String catString, payload, rawCategory, c1, c2, c3;
		double latitude, longitude;
		boolean isInRange;
		MessageCategory category;
		
		
		
		//the format of each message will be CATEGORY-LAT-LONG-DESCP.
		
		System.out.println("Please enter a formatted message:");
		
		rawCategory = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		isInRange = (latitude >= SOUTH && latitude <= NORTH && longitude >= WEST && longitude <= EAST);
		
		//Now to classify the message, we cannot use == since these are strings and not integer, float, double values, etc.
			if (rawCategory.equalsIgnoreCase("fire")||rawCategory.equalsIgnoreCase("smoke")){
			
			category = MessageCategory.ALERT;
	}
	
			else if (rawCategory.equalsIgnoreCase("need")){
			
			category = MessageCategory.NEED;
	}
	
			else if (rawCategory.equalsIgnoreCase("offer")) {
	
			category = MessageCategory.OFFER;
	
	}
	
			else if (rawCategory.equalsIgnoreCase("structure")||rawCategory.equalsIgnoreCase("road")||rawCategory.equalsIgnoreCase("photo")||rawCategory.equalsIgnoreCase("evac")) {
		
			category = MessageCategory.INFO;
	}

			else {
			category = MessageCategory.UNKNOWN;
	}
		
		System.out.println("CATEGORY:\t\t\t"+category);
		System.out.println("RAW CATEGORY:\t\t\t"+rawCategory);
		System.out.println("Message:\t\t\t"+payload.trim());
		System.out.println("Latitude:\t\t\t"+latitude);
		System.out.println("Longitude:\t\t\t"+longitude);
		System.out.println("In range:\t\t\t"+ isInRange);
}
}