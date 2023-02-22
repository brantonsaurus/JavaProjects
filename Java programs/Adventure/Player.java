/* * [VYOM, TEAL TURTLE GROUP, CSCI 1301].java * Author:  [BRANTON GRAY DEARMOUN]  * Submission Date:  [11/9/2018] * 
 * * Purpose: THIS IS A PLAYER CLASS WHICH WORKS IN CONCERT WITH THE CHEST, LAMP, ROOM, KEY, MAP AND ADVENTURE CLASSES * 
 * * Statement of Academic Honesty: * * The following code represents my own work. I have neither
 *  * received nor given inappropriate assistance. I have not copied * or modified code from any source other 
 *  than the course webpage * or the course textbook. I recognize that any unauthorized * assistance or 
 *  plagiarism will be handled in accordance with * the University of Georgia's Academic Honesty Policy and 
 *  the * policies of this course. I recognize that my work is based * on an assignment created by the 
 *  Department of Computer * Science at the University of Georgia. Any publishing  * or posting of source 
 *  code for this project is strictly * prohibited unless you have written consent from the Department * 
 *  of Computer Science at the University of Georgia.   */ 

public class Player {

	private int x = 0;
	private int y = 0;
	public Key theKey;
	public Lamp theLamp;
	boolean isDead = false;
	
	
	
	
	public void setX(int x){
		this.x =+ x;
	}
	
	public void setY(int y){
		this.y =+ y;
	}
	
	
/*	public void Move(int distanceX, int distanceY){
		
		this.playerX =+ distanceX;
		this.playerY =+ distanceY;	
	}*/
	
	public void setKey(Key theKey){
		this.theKey = theKey;
	}
	
	public Key getKey(){
		return theKey;
	}
	
	public void setLamp(Lamp theLamp){
			this.theLamp = theLamp;
	}	
		
	public Lamp getLamp(){
		return theLamp;
		}
		
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public Key key(){
		return this.theKey;
	}
	
}
