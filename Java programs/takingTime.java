import java.util.Scanner;

public class takingTime {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("\t\t\t\t\t!EMERGENCY SERVICES TWEET RELAY SYSTEM!");
		System.out.println();
		System.out.println("\t\tPlease enter your tweet with the appropriate tags and information separated by semicolons:");
		System.out.println();
		System.out.println();
		System.out.println();
		String tweet, tweet2, tweet3, tweet4, tweet5, tweet6;
		String type, detail, location, latitude, longitude;
		int start, finish, startType, startDetails, startLocation, startLatitude, startLongitude;
		

		System.out.println("Please enter your text:");
		tweet = keyboard.nextLine();
		
		start = tweet.indexOf("#");
		finish = tweet.indexOf(";");
		startType = tweet.indexOf("#typ");
		startDetails = tweet.indexOf("#det");
		startLocation = tweet.indexOf("#loc");
		startLatitude = tweet.indexOf("#lat");
		startLongitude = tweet.indexOf("#lng");
		int correct = 5;
		
		 "#typ photo; #det local wild horse; #loc wild horse; #lat 40.052304; #lng -105.319374;"
		
		type = ;
		detail = ;
		location = ;
		latitude = ;
		longitude = ;
		
		
		
		System.out.println(tweet.substring(startType, finish));
		System.out.println(tweet.substring(startDetails, tweet.length()));
		System.out.println(tweet.substring(startLocation, tweet.length()));
		System.out.println(tweet.substring(startLatitude, tweet.length()));
		System.out.println(tweet.substring(startLongitude, tweet.length()));
		
		
		
		
	}
	
}

		
/*		
		tweet2 = tweet.substring(start, finish);
		tweet3 = tweet.substring(finish+2);
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
		System.out.println("\t\tTYPE:\t\t\t" + type.toUpperCase());
		System.out.println("\t\tDETAIL:\t\t\t" + detail.replace(",", "-").toLowerCase());
		System.out.println("\t\tLOCATION:\t\t" + location.replace(",", "-"));
		System.out.println("\t\tLATITUDE:\t\t" + latitude);
		System.out.println("\t\tLONGITUDE:\t\t" + longitude);
	}
}

/*
System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		"#typ evac; #det overflow shltr 4 evacuees at; #loc walt clark middle school, loveland; #lat 40.383; #lng -105.113;"
*/