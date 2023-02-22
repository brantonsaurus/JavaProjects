/* * [VYOM, TEAL TURTLE GROUP, CSCI 1301].java * Author:  [BRANTON GRAY DEARMOUN]  * Submission Date:  [10/25/2018] * 
 * 
 * 
 * * Purpose: This is a main method to test all the circle objects that were created.
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
// CircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle
// 
//*******************************************************
public class CircleTester{
	public static final double THRESHOLD = 0.000000001;
	
	public static void main(String[] args) {
		
		
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		Circle circle3 = new Circle();
		Circle circle4 = new Circle();
		Circle unitCircle = new Circle();
		
		
		
		
		
		circle1.setName("Circle 1");
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2);
		circle2.setName("Circle 2");
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(1);
		
		//3 test circles
		
		
				//unit circle
				unitCircle.setName("Unit Circle");
				unitCircle.setX(0.0);
				unitCircle.setY(0.0);
				unitCircle.setRadius(1.0);
				
				
				//
				
				circle3.setName("Circle 3");
				circle3.setX(11.0);
				circle3.setY(11.0);
				circle3.setRadius(3);
				
				
				//
				circle4.setName("Circle 4");
				circle4.setX(-30.0);
				circle4.setY(-20.0);
				circle4.setRadius(9);
				
				//end of test circles
		
		
		

//				Since the toString(); method is in every method by default, if you try to print
//				the object literally, java will pull whatever characteristics it has into a string.
//				Regardless, I'm calling the toString() method.
		
		System.out.println(circle1.toString());
		System.out.println();
		System.out.println(circle2.toString());
		System.out.println();
		System.out.println(circle3.toString());
		System.out.println();
		System.out.println(circle4.toString());
		System.out.println();
		System.out.println(unitCircle.toString());
		System.out.println();
		
		
		
		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0); 
		System.out.println();
		System.out.println();
		
		//This is a unit test.  It is best to have tests output pass or fail instead of just a bunch of values.
		//Notice how the double comparison is done
		if(Math.abs(2-circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		System.out.println();
		System.out.println();
		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(-3.0);
		circle1.setY(4.0);	
		
		// print circle1 characteristics (center and radius), use a statement similar 
		// to the previous println statements. Note that is not necessary to call
		//the method toString, why?
		
//		Since the toString(); method is in every method by default, if you try to print
//		the object literally, java will pull whatever characteristics it has into a string.
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("circle1="+circle1);
		System.out.println();
		System.out.println();
		
		// set the circle2 radius to 5.3
		
		circle2.setRadius(5.3);
//		circle2.setX(0.0);
//		circle2.setY(0.0);
//		circle2.setRadius(1);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		
		System.out.println();
		System.out.println();
		System.out.println("circle2="+circle2);
		System.out.println();
		System.out.println();
		
		// print circle1 diameter, area and perimeter
		
	
		circle1.diameter();
		circle1.area();
		circle1.perimeter();
		
		System.out.println();
		System.out.println("The diameter of circle 1 is: " + circle1.diameter());
		System.out.println("The area of circle 2 is: " + circle1.area());
		System.out.println();
		System.out.println("The perimeter of circle 1 is: " + circle1.perimeter());
		System.out.println("circle1="+circle1);		
		System.out.println();
		
		
		// print circle2 diameter, area and perimeter

		
		System.out.println();
		circle2.diameter();
		circle2.area();
		circle2.perimeter();
		System.out.println();
		
		System.out.println("The diameter of circle 2 is: " + circle2.diameter());
		System.out.println("The area of circle 2 is: " + circle2.area());
		System.out.println("The perimeter of circle 2 is: " + circle2.perimeter());
		System.out.println();
		System.out.println("circle2="+circle2);		
		
		
		// display whether circle1 is a unit circle
		System.out.println();
		circle1.isUnitCircle();
		System.out.println(circle1.isUnitCircle());
		System.out.println();
		// display whether circle2 is a unit circle
		
		
		
		
		
		System.out.println();
		circle2.isUnitCircle();
		System.out.println(circle2.isUnitCircle());
		System.out.println();
		
	
	
		
		
		
		
//		returns all values to a formatted string:
		circle1.toString();
		
		
//		returns all values to a formatted string:
		
		circle2.toString();
		
		
		circle3.toString();
		
		
		circle4.toString();
		
		
		unitCircle.toString();
		
	//DISTANCE TEST CASES
		
		System.out.println();
		System.out.println();
		System.out.println("How far is circle one from circle two?");
		System.out.println(circle1.distance(circle2));
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("How far is circle two from circle two?");
		System.out.println(circle2.distance(circle2));
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("How far is circle two from circle two?");
		System.out.println(unitCircle.distance(circle4));
		System.out.println();
		System.out.println();
		
		// your additional tests should be placed below here.  Make sure to include at least 2-3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
				
		//EQUALITY TEST CASES
		
		
		System.out.println();
		System.out.println();
		System.out.println("Is circle one equal to circle two?");
		System.out.println(circle1.equals(circle2));
		System.out.println();
		System.out.println();
		System.out.println("Is circle one equal to the unit circle?");
		System.out.println(circle1.equals(unitCircle));
		System.out.println();
		System.out.println();
		System.out.println("Is circle three equal to circle four?");
		System.out.println(circle3.equals(circle4));
		System.out.println();
		System.out.println();
		
		
		//INTERSECTION TEST CASES
		
		
		System.out.println("Does circle one intersect with circle two?");
		System.out.println(circle1.intersects(circle2));
		
		System.out.println("Does circle two intersect with circle three?");
		System.out.println(circle2.intersects(circle3));
		
		System.out.println("Does the unit circle intersect with circle four?");
		System.out.println(unitCircle.intersects(circle4));
		
		
		//COMPARISON TEST CASES
		
		
		System.out.println();
		System.out.println();
		System.out.println("Is circle one smaller than circle two?");
		System.out.println(circle1.compareTo(circle2));
		System.out.println();
		System.out.println();
		System.out.println("Is circle one smaller than the unit circle?");
		System.out.println(circle1.compareTo(unitCircle));
		System.out.println();
		System.out.println();
		System.out.println("Is circle three smaller than circle four?");
		System.out.println(circle3.compareTo(circle4));
		System.out.println();
		System.out.println();
		
		//UNIT CIRCLE TEST CASES
		
		System.out.println();
		System.out.println();
		System.out.println("Is circle one a unit circle?");
		System.out.println(circle1.isUnitCircle());
		System.out.println();
		System.out.println();
		System.out.println("Is unit circle a unit circle?");
		System.out.println(unitCircle.isUnitCircle());
		System.out.println();
		System.out.println();
		System.out.println("Is circle three a unit circle?");
		System.out.println(circle3.isUnitCircle());
		System.out.println();
		System.out.println();
		
		
		//IS SMALLER TEST CASES
		
		
		System.out.println();
		System.out.println();
		System.out.println("Is circle one smaller than the unit circle?");
		System.out.println(circle1.isSmaller(unitCircle));
		System.out.println();
		System.out.println();
		System.out.println("Is unit circle smaller than circle one?");
		System.out.println(unitCircle.isSmaller(circle1));
		System.out.println();
		System.out.println();
		System.out.println("Is circle three smaller than circle two?");
		System.out.println(circle3.isSmaller(circle2));
		System.out.println();
		System.out.println();
		
		//MORE TO STRING TESTS
		
		//After everything the final values for each circle are:
		System.out.println(circle1.toString());
		System.out.println();
		System.out.println(circle2.toString());
		System.out.println();
		System.out.println(circle3.toString());
		System.out.println();
		System.out.println(circle4.toString());
		System.out.println();
		System.out.println(unitCircle.toString());
		System.out.println();
		
		
	}
	
}
