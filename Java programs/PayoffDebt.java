import java.util.Scanner;


public class PayoffDebt {

	public static void main(String[] args) {
	
	Scanner keyboard = new Scanner(System.in);
	
	
	
	System.out.println("Please enter the amount of your monthly payment.");
	double monthlyPayment = keyboard.nextDouble();
	
	
	System.out.println("Please enter your annual interest rate.");
	double annualInterestRate = keyboard.nextDouble();
	
	System.out.println("Please enter the amount of your principal.");
	double principal = keyboard.nextDouble();
	double a = Math.log(monthlyPayment);
	double b = Math.log(monthlyPayment-((annualInterestRate/1200)*(principal)));
	double c = Math.log((annualInterestRate/1200)+1);
	double d = (a-b)/c;
	double e = monthlyPayment*(Math.ceil(d));
	double h = e-principal;
	double g = (e-(monthlyPayment*d));
	
	System.out.println();
	System.out.println("PRINCIPAL:\t\t\t\t$" + principal);
	System.out.println("ANNUAL INTEREST RATE (%):\t\t" +annualInterestRate+"%");
	System.out.println("MONTHLY PAYMENT:\t\t\t$" + monthlyPayment);
	System.out.println();
	
	System.out.printf("\nMONTHS NEEDED TO PAY OFF:\t\t%.2f MONTHS", Math.ceil(d));
	System.out.printf("\nTOTAL AMOUNT PAID:\t\t\t$%.2f", e);
	System.out.printf("\nTOTAL INTEREST PAID:\t\t\t$%.2f" , h);
	System.out.printf("\nOVERPAYMENT:\t\t\t\t$%.2f", g);
	}
}