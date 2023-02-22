/* * [VYOM, TEAL TURTLE GROUP, CSCI 1301].java * Author:  [BRANTON GRAY DEARMOUN]  * Submission Date:  [11/9/2018] * 
 * * Purpose: THIS IS A LAMP CLASS WHICH WORKS IN CONCERT WITH THE PLAYER, CHEST, ROOM, KEY, MAP AND ADVENTURE CLASSES * 
 * * Statement of Academic Honesty: * * The following code represents my own work. I have neither
 *  * received nor given inappropriate assistance. I have not copied * or modified code from any source other 
 *  than the course webpage * or the course textbook. I recognize that any unauthorized * assistance or 
 *  plagiarism will be handled in accordance with * the University of Georgia's Academic Honesty Policy and 
 *  the * policies of this course. I recognize that my work is based * on an assignment created by the 
 *  Department of Computer * Science at the University of Georgia. Any publishing  * or posting of source 
 *  code for this project is strictly * prohibited unless you have written consent from the Department * 
 *  of Computer Science at the University of Georgia.   */ 


public class Lamp {

private boolean light = false;
	
	
 public void setIsLit(boolean light){
	 this.light = light;
	 }
 
 public boolean getIsLit(){
	 
	 if (light != false){
	 return light;
	 }
	 else {
	 return false;	 
	 }
 }
	
}
