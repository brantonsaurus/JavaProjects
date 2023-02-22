/* * [VYOM, TEAL TURTLE GROUP, CSCI 1301].java * Author:  [BRANTON GRAY DEARMOUN]  * Submission Date:  [11/9/2018] * 
 * * Purpose: THIS IS A CHEST CLASS WHICH WORKS IN CONCERT WITH THE PLAYER, LAMP, ROOM, KEY, MAP AND ADVENTURE CLASSES * 
 * * Statement of Academic Honesty: * * The following code represents my own work. I have neither
 *  * received nor given inappropriate assistance. I have not copied * or modified code from any source other 
 *  than the course webpage * or the course textbook. I recognize that any unauthorized * assistance or 
 *  plagiarism will be handled in accordance with * the University of Georgia's Academic Honesty Policy and 
 *  the * policies of this course. I recognize that my work is based * on an assignment created by the 
 *  Department of Computer * Science at the University of Georgia. Any publishing  * or posting of source 
 *  code for this project is strictly * prohibited unless you have written consent from the Department * 
 *  of Computer Science at the University of Georgia.   */ 
public class Chest {

	/*
	 * Instance variables go here, you're responsible for choosing
	 * which ones are needed and naming them
	 */

	
	private boolean isLocked = false;
	private String contents;
	private Key lock;
	
	
	/**
	 * This method is used by the Map class, you won't need to call it yourself
	 * It should result in this chest being locked and storing which key locked it.
	 */
	public void lock(Key theKey) {
		
		this.lock = theKey;
		this.isLocked = true;
		
		
	}
	
	
	/**
	 * If theKey is the same key that was used to lock this chest, then
	 * the chest is unlocked.  Otherwise this method does nothing.
	 */
	public void unLock(Key theKey) {
		if (this.lock == theKey){
			this.isLocked = false;
		}
	}
	
	/**
	 * Should return true if the chest is locked, false otherwise
	 */
	
	
	public boolean isLocked() {
		
	return this.isLocked;
		
	}
	
	/**
	 * Return a string describing the contents of the chest.
	 */
	public String getContents() {
	
	return contents;
	}
	
	/**
	 * Set the contents of the chest to this string.  You should not need to call
	 * this method in your program (though you have to implement it anyway).
	 */
	public void setContents(String contents) {
		
		this.contents = contents;
		
	}
	
	
	
}
