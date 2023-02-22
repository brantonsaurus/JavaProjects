/* * [VYOM, TEAL TURTLE GROUP, CSCI 1301].java * Author:  [BRANTON GRAY DEARMOUN]  * Submission Date:  [10/25/2018] * 
 * 
 * 
 * * Purpose: This is a collection of circle methods and attributes which allows the user to set, get and compare
 * values related to circles.
 * 
 * 
 * * Statement of Academic Honesty: * * The following code represents my own work. I have neither
 *  * received nor given inappropriate assistance. I have not copied * or modified code from any source other 
 *  than the course webpage * or the course textbook. I recognize that any unauthorized * assistance or 
 *  plagiarism will be handled in accordance with * the University of Georgia's Academic Honesty Policy and 
 *  the * policies of this course. I recognize that my work is based * on an assignment created by the 
 *  Department of Computer * Science at the University of Georgia. Any publishing  * or posting of source 
 *  code for this project is strictly * prohibited unless you have written consent from the Department * 
 *  of Computer Science at the University of Georgia.   */ 





//*******************************************************
// Circle.java
//
// 
//*******************************************************
public class Circle {
	// ADD MORE METHODS TO CIRCLE
	//PUBLIC BOOLEAN EQUALS(CIRCLE ANOTHERCIRCLE)
	//PUBLIC DOUBLE DISTANCE(CIRCLE ANOTHERCIRCLE)
	//PUBLIC BOOLEAN ISSMALLER(CIRCLE ANOTHERCIRCLE)
	//PUBLIC BOOLEAN COMPARETO(CIRCLE ANOTHERCIRCLE)
	//PUBLIC BOOLEAN INTERSECTS(CIRCLE ANOTHERCIRCLE)
	
	private String name;    // declare the private String instance  name
	private double radius;  // declare the private double instance  radius
	private double x;       // declare the private double instance  x
	private double y;       // declare the private double instance  y

	//Used to compare doubles.  Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	//----------------------------------------------
	// getName - returns the value of name
	//----------------------------------------------
	public String getName() {
		
		return this.name;	
	}
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {
		
		return this.x;	
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
		
		return this.y;	
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		
		return this.radius;

	}
	
	//----------------------------------------------
	// setName - assigns a new value to name
	//----------------------------------------------
	public void setName(String name) {
		
		this.name = name;
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double x) {
		
		this.x = x;
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double y) {
		
		this.y = y;
	}
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double radius) {
		
		if (radius > 0) {

				this.radius = radius;
																										}//closes if
		else{
			System.out.println("FAILED, PLEASE TRY A POSITIVE VALUE");
			
			}//closes else
		
		
		}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		
		return (Math.PI)*this.radius*this.radius;
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		
		return 2*Math.PI*this.radius;	
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		
		return 2*this.radius;	
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		
		if (x==0 && y == 0 && radius == 1){
		 return true;
		}
		else {
			return false;
		}
	}
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		
		return "\nname: "  + this.name + "\ncenter: ("+ x + " , " + y + ")" + "\nradius: " + this.radius + "\nIs it a unit circle? " + 
		this.isUnitCircle() +"\nDiameter: " + this.diameter()+ "\nPerimeter: " + this.perimeter() + "\nArea: " + this.area();
		
		
		
		// Your code goes here	
	}
	
	
	// ADD MORE METHODS TO CIRCLE

	
	
	//I JUST NEED TO CORRECT THINGS SO THAT IT WILL USE THE GENERALIZED CLASS AGAINST A FIRST CASE.
	

	
	
	//PUBLIC BOOLEAN EQUALS(CIRCLE ANOTHERCIRCLE)
	
	
	public boolean equals(Circle anotherCircle) {
		
		if (radius == anotherCircle.radius && x == anotherCircle.x && y == anotherCircle.y){
			
			return true;
			
		}
		else {
			return false;
		}
	}
	
	
	//PUBLIC DOUBLE DISTANCE(CIRCLE ANOTHERCIRCLE)
	
	
	public double distance(Circle anotherCircle) {
		
		return Math.sqrt(Math.pow((x-anotherCircle.x), 2) + Math.pow((y-anotherCircle.y), 2));
	}
	
	
	//PUBLIC BOOLEAN ISSMALLER(CIRCLE ANOTHERCIRCLE)
	
	public boolean isSmaller(Circle anotherCircle) {
		
		if (this.area() < anotherCircle.area()){
		System.out.println("Circle one is smaller than circle two.");
		return true;
		}
		else {
		System.out.println("Circle one is smaller than circle two.");
		return false;
		}
	}
	
	

	//PUBLIC BOOLEAN COMPARETO(CIRCLE ANOTHERCIRCLE)
	
	public int compareTo(Circle anotherCircle){
		
		if (anotherCircle.area() > this.area() && anotherCircle.area() > this.area()){
			System.out.println("Yes");
			return -1;
		}
		else if  (anotherCircle.area() < this.area() && anotherCircle.area() < this.area()){
			System.out.println("No");
			return 1;
		}
		else {
			System.out.println("Maybe the two circles are equal");
			return 0;
		}
	}
	
	
	//PUBLIC BOOLEAN INTERSECTS(CIRCLE ANOTHERCIRCLE)
	
	public boolean intersects(Circle anotherCircle){
		
		System.out.println("Do the two circles intersect?");
		return Math.sqrt(Math.pow((x-anotherCircle.x), 2) + Math.pow((y-anotherCircle.y), 2)) < radius + anotherCircle.radius;
	}
	

}
