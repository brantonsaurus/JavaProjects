import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {
		
		double FEDERAL_TAX_PERCENT = (10.00/100);
		double STATE_TAX_PERCENT = (4.5/100);
		double SS_PERCENT = (6.2/100);
		double MEDICARE_PERCENT = (1.45/100);

		Scanner keyboard = new Scanner(System.in);
		
		

		System.out.println("\t\tPlease enter your initial pay per hour and hours worked and I will");
		System.out.println("\t\tGive you the amounts for your net pay and deductions.");
		System.out.println("\t\tWhat are your hourly wages?");
				double PAY_PER_HOUR = keyboard.nextDouble();
		System.out.println("\t\tHow many whole hours a week do you work?");
				int hpw = keyboard.nextInt();
				
		double gp = (PAY_PER_HOUR * hpw);
		double  fed = (FEDERAL_TAX_PERCENT * gp);
		double state = (STATE_TAX_PERCENT * gp);
		double ss = (SS_PERCENT * gp);
		double med = MEDICARE_PERCENT * gp;
		double np = (PAY_PER_HOUR * hpw) - (fed + state + ss + med);
		
		System.out.println("\t\t Using the information you provided,");
		System.out.println("\t\t these are the results:");
		System.out.println();
		System.out.println("\t\t Hours per Week" + "\t\t\t" + hpw);
		System.out.println("\t\t Gross Pay:" + "\t\t\t" + gp);
		System.out.println("\t\t Net Pay"+ "\t\t\t" + np);
		System.out.println();
		System.out.println("\t\t\t - Deductions -");
		System.out.println();
		System.out.println("\t\t Federal:" + "\t\t\t" + fed);
		System.out.println("\t\t State:" + "\t\t\t\t" + state);
		System.out.println("\t\t Social Security:" + "\t\t" + ss);
		System.out.println("\t\t Medicare:" + "\t\t\t" + med);
	}
}
