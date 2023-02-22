/* * [VYOM 1301].java 
 * * Author:  [Branton Gray DeArmoun] 
 *  * Submission Date:  [11/2/2018] * 
 *  
 *  * Purpose: This is a person class used in conjunction with a house class that together help implement a home buying sim main method.
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



import java.text.DecimalFormat;


/**
 * Class representing a person (a human user) on a real estate market.
 * A person has a name, age, cash, and (potentially) a house.
 */
public class Person {

	/* Instance variables */

	private String name;
	private int age;
	private double cash;
	private House house;
	
	/* Constructors */

	/**
	 * The Default constructor creates a 20 year old John L. with a penny of cash and no home.
	 */
	public Person() {
		
		name = "John L.";
		age = 21;
		cash = 0.01;
		this.house = null;
		
	}
	/**
	 * A second constructor that enables the creation of a custom instance of the Person class. 
	 * The house instance variable is set to null.
	 * @param name : the person's name 
	 * @param age : the person's age
	 * @param cash : the amount of money the person has
	 */
	public Person(String name, int age, double cash) {
		
		this.name = name;
		this.age = age;
		this.cash = cash;
		this.house = null;

	}

	/**
	 * A third constructor including a parameter for the persons house. The house is also updated
	 * because it is no longer for sale.
	 * @param name : the person's name 
	 * @param age : the person's age
	 * @param cash : the amount of money the person has
	 * @param house : the person's home
	 */
	public Person(String name, int age, double cash, House house) {
		
		this.name = name;
		this.age = age;
		this.cash = cash;
		this.house = house;
		this.house.setForSale(false);
	}
	
	/**
	 * Show the name and age of the person as well as their assets (cash and home if they have one).
	 * E.g.
	 * Name: John L.
	 * Age: 20 years old
	 * Cash: $ 0.01
	 */
	@Override
	public String toString() {
		DecimalFormat decimalFormatObj = (DecimalFormat) DecimalFormat.getInstance();
		String s;
		s = "";
		s += "Name: " + getName() + "\nAge: " + getAge() + "\nCash: " + getCash() + "\nHome: ";
		if (house != null){
		s += "\n"+house.toString();
		}
		else {
		s += "This person does not own a house.";	
		}
		return s; // replace this line with your own code
	}
	
	/* Accessors / Getters */
	
	/**
	 * @return the person's name 
	 */
	public String getName() {
		
		return name;
	}
	/**
	 * @return the person's age
	 */
	public int getAge() {
		
		return age;
		
	}
	
	/**
	 * @return the amount of cash this person has
	 */
	public double getCash() {
		
		return cash;
		
	}
	
	/**
	 * @return a reference the house object currently owned by this person
	 */
	public House getHouse() {
		
		return house;
	}
	

	/**
	 * @return true if this person has a home
	 */
	public boolean ownsAHouse() {
		
		if (house != null){
			
				return true;
					}
		
		else {
			
		return false;
			
			}
	}
	
	/* Mutators */
	
	/**
	 * @param amount : the amount of cash to give this person
	 */
	public void addCash(double amount) {
		
		cash += amount;

	}
	
	/**
	 * If this person owns home, put it up for sale and pay the person the price of the home.
	 */
	public void sellHome() {
		
			if (house != null){
					house.setForSale(true);
					cash += house.getPrice();
					house = null;
					System.out.println(getName()+" has sold their house!");
								}
		
			else if (house == null){
					System.out.print(getName()+" has no house to sell!\n");
									}
		
	}

	/**
	 * This method lets the person buy a home if they do not already have a home, have the cash and the home is for sale.
	 * If the person successfully buys a home, their cash is decreased by the cost of the home.
	 * @param h the house to be bought
	 */
	public void buyHouse(House h) {
		
			if (house == null && cash >= h.getPrice() && h.isForSale()){

					cash -= h.getPrice();
					house = h;
					System.out.println(getName()+" is the owner of a brand new house!");
					house.setForSale(false);
					
																		}
			else {
			System.out.println("I'm sorry.\n...Either you have a house already\n...this house has already sold\n...or you cannot afford this new one!");
				}
	}
}
