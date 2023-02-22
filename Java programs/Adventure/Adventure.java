/* * [VYOM, TEAL TURTLE GROUP, CSCI 1301].java * Author:  [BRANTON GRAY DEARMOUN]  * Submission Date:  [11/9/2018] * 
 * * Purpose: THIS IS AN ADVENTURE CLASS WHICH IMPLEMENTS THE CHEST, LAMP, ROOM, KEY, MAP AND PLAYER CLASSES * 
 * * Statement of Academic Honesty: * * The following code represents my own work. I have neither
 *  * received nor given inappropriate assistance. I have not copied * or modified code from any source other 
 *  than the course webpage * or the course textbook. I recognize that any unauthorized * assistance or 
 *  plagiarism will be handled in accordance with * the University of Georgia's Academic Honesty Policy and 
 *  the * policies of this course. I recognize that my work is based * on an assignment created by the 
 *  Department of Computer * Science at the University of Georgia. Any publishing  * or posting of source 
 *  code for this project is strictly * prohibited unless you have written consent from the Department * 
 *  of Computer Science at the University of Georgia.   */ 



import java.util.Scanner;

public class Adventure {

	public static Scanner keyboard = new Scanner(System.in);
	public static void main(String args[]){

		System.out.println("Welcome to UGA Adventures: \nEpisode 1 The adventure of the Cave of Redundancy Adventure \nBy: Branton Gray: \n");
		
				boolean isDead = false;
				int x = 0;
				int y = 0;
				Map map = new Map();
				map.getRoom(x, y);
				Player player = new Player();	
				player.setX(x);
				player.setY(y);
	
				System.out.println(map.getRoom(x, y).getDescription());
				
while(!isDead) {	

	
		
	
	String command;
	command = keyboard.nextLine();
//	System.out.println(map.getRoom(x, y).isDark());
//	System.out.println(map.getRoom(x, y));
	
//DEATH CONDITIONS
			if (map.getRoom(x, y).isDark() && ( (player.theLamp == null)) && command.equalsIgnoreCase("WEST")){
				System.out.println("You have been eaten by a passing grue!!!");
				isDead = true;
				System.exit(0);
			}
			
			if (map.getRoom(x, y).isDark() && ( (player.theLamp == null) ) && command.equalsIgnoreCase("EAST") ){
				System.out.println("You have been eaten by a passing grue!!!");
				isDead = true;
				System.exit(0);
			}
			
				
			if (map.getRoom(x, y).isDark() && (player.theLamp == null) && command.equalsIgnoreCase("NORTH") ){
				System.out.println("You have been eaten by a passing grue!!!");
				isDead = true;
				System.exit(0);
			}
			
			if (map.getRoom(x, y).isDark() && (player.theLamp == null) && command.equalsIgnoreCase("SOUTH") ){
				System.out.println("You have been eaten by a passing grue!!!");
				isDead = true;
				System.exit(0);
			}
			
			if (map.getRoom(x, y).isDark() && ( (player.theLamp !=null && player.theLamp.getIsLit() == false)) && command.equalsIgnoreCase("WEST")){
				System.out.println("You have been eaten by a passing grue!!!");
				isDead = true;
				System.exit(0);
			}
			
			if (map.getRoom(x, y).isDark() && ( (player.theLamp !=null && player.theLamp.getIsLit() == false) ) && command.equalsIgnoreCase("EAST") ){
				System.out.println("You have been eaten by a passing grue!!!");
				isDead = true;
				System.exit(0);
			}
			
				
			if (map.getRoom(x, y).isDark() && (player.theLamp !=null && player.theLamp.getIsLit() == false) && command.equalsIgnoreCase("NORTH") ){
				System.out.println("You have been eaten by a passing grue!!!");
				isDead = true;
				System.exit(0);
			}
			
			if (map.getRoom(x, y).isDark() && (player.theLamp !=null && player.theLamp.getIsLit() == false) && command.equalsIgnoreCase("SOUTH") ){
				System.out.println("You have been eaten by a passing grue!!!");
				isDead = true;
				System.exit(0);
			}
//END OF DEATH CONDITIONS				
/*				
				System.out.println("your inventory is:");
				if (player.getLamp() == null){
					System.out.println("Lamp: you have yet to discover the lamp.");
				}
					else {
						System.out.println("Lamp: "+ player.getLamp());
					}
				if (player.getKey() == null){
					System.out.println("Key: you have yet to discover the key.");
				}
				else {
					System.out.println("Key: "+ player.getKey());
				}
*/				
				
				
	
		
//COMMANDS TO NAVIGATE AND SOLVE MAZE
				
	
	
	
	//CARDINAL DIRECTIONS
	
	
	
			if (command.equalsIgnoreCase("NORTH") && map.getRoom(x, y).canGoNorth() == true){
				
				x -= 1;
				//-1 X
				System.out.println("I am going north");
				
				
						if ((map.getRoom(x, y).isDark()) && player.theLamp == null || map.getRoom(x, y).isDark() && player.theLamp.getIsLit() == false){
							System.out.println("IT IS PITCH BLACK, YOU MIGHT BE EATEN BY A GRUE!");
							continue;
																																					}
						else {
								System.out.println(map.getRoom(x, y).getDescription());
								continue;
							}
		}//CLOSES NORTH

			
//THE PATH IS BLOCKED EXCEPTION
			else if (command.equalsIgnoreCase("NORTH") && map.getRoom(x, y).canGoNorth() == false){
				System.out.println("THOUGH CANNOT PASS THAT WAY");
			}//CLOSES NORTH EXCEPTION
			
			
			
//SOUTH COMMAND
			
			if (command.equalsIgnoreCase("SOUTH") && map.getRoom(x, y).canGoSouth() == true){
				
				x += 1;
				//+1 X
				System.out.println("I am going south");

						if ((map.getRoom(x, y).isDark()) && player.theLamp == null || map.getRoom(x, y).isDark() && player.theLamp.getIsLit() == false){
							System.out.println("IT IS PITCH BLACK, YOU MIGHT BE EATEN BY A GRUE!");
							continue;
																																					}
						else {
							System.out.println(map.getRoom(x, y).getDescription());
							continue;
							}

		}//CLOSES SOUTH
		
			
//SOUTHERN EXCEPTION
			else if (command.equalsIgnoreCase("SOUTH") && map.getRoom(x, y).canGoSouth() == false){
				System.out.println("THOUGH CANNOT PASS THAT WAY");
}//CLOSES SOUTH EXCEPTION
			

			
//EAST COMMAND:
			
			if (command.equalsIgnoreCase("EAST") && map.getRoom(x, y).canGoEast() == true){
				
				y += 1;
				//+1 Y
				System.out.println("I am going east");

						if ((map.getRoom(x, y).isDark()) && player.theLamp == null || map.getRoom(x, y).isDark() && player.theLamp.getIsLit() == false){
							System.out.println("IT IS PITCH BLACK, YOU MIGHT BE EATEN BY A GRUE!");
							continue;
							
																																					}
						
						else {
							System.out.println(map.getRoom(x, y).getDescription());
							continue;
							}
		}//CLOSES EAST
			
			
//EAST EXCEPTION
			if (command.equalsIgnoreCase("EAST") && map.getRoom(x, y).canGoEast() == false){
				System.out.println("THOUGH CANNOT PASS THAT WAY");
			}//CLOSES EAST EXCEPTION
			
			
			
//WEST COMMAND		
			
			if (command.equalsIgnoreCase("WEST") && map.getRoom(x, y).canGoWest() == true){
				
				y -= 1;
				//(-1 Y)
				System.out.println("I am going west");
				
						if ((map.getRoom(x, y).isDark()) && player.theLamp == null || map.getRoom(x, y).isDark() && player.theLamp.getIsLit() == false){
							System.out.println("IT IS PITCH BLACK, YOU MIGHT BE EATEN BY A GRUE!");		
							continue;
							
																																					}
						else {
							System.out.println(map.getRoom(x, y).getDescription());
							continue;
							}
		}//CLOSES WEST
			
			
//WEST EXCEPTION			
			else if (command.equalsIgnoreCase("WEST") && map.getRoom(x, y).canGoWest() == false){
				System.out.println("THOUGH CANNOT PASS THAT WAY");
			}//CLOSES WEST EXCEPTION
			
			
			
			//FUNCTIONAL COMMANDS -GETTERS FOR LAMPS/CHESTS/LOOKING/KEYS

			if (command.equalsIgnoreCase("GET LAMP")){
				
				if (map.getRoom(x, y).getLamp() == null) {
					System.out.println("There is no lamp here!");
				}
				
				player.setLamp(map.getRoom(x, y).getLamp());
				map.getRoom(x, y).clearLamp();
				System.out.println("I acquired the lamp! "/*+player.getLamp()+" "+map.getRoom(x, y).getLamp()*/);

			}

			if (command.equalsIgnoreCase("LIGHT LAMP") && player.theLamp != null){
				
				player.theLamp.setIsLit(true);
				System.out.println("I have lit the lamp" /*+ player.theLamp.getIsLit()*/);
			}
			
			if (command.equalsIgnoreCase("LIGHT LAMP") && player.theLamp == null){
				
				System.out.println("YOU DON'T HAVE A LAMP TO LIGHT!");
			}
			
			
			
			
//LOOK COMMAND			
			if (command.equalsIgnoreCase("LOOK")){
				
				
				//MAKE SURE TO CREATE IF STATEMENTS FOR EACH PART...IF YOU HAVE A LAMP, ETC.
				
				
				
				
				if ((map.getRoom(x, y).isDark()) && player.theLamp == null || map.getRoom(x, y).isDark() && player.theLamp.getIsLit() == false){
					System.out.println("IT IS PITCH BLACK, YOU MIGHT BE EATEN BY A GRUE!");
				}
				else {
					System.out.println(map.getRoom(x, y).getDescription());
				}
				
						if (map.getRoom(x, y).getLamp() != null) {
							System.out.println("There is an old oil lamp here that was made long ago");
				}
						else {
							System.out.println("");
				}
						if (map.getRoom(x, y).getKey() != null){
					
					System.out.println("You see the outline of a key on a dusty shelf that's covered in dust.");
				}
				
						if ((map.getRoom(x, y).getChest() != null)) {
					
					System.out.println("There is a large, wooden, massive, oaken chest here with the word CHEST carved into it.");
				}
//EXIT CHECKERS
					if (map.getRoom(x, y).canGoEast() == true){
					System.out.println("Exit: EAST");
				}
				
					if (map.getRoom(x, y).canGoWest() == true){
					System.out.println("Exit: WEST");
				}
				
					if(map.getRoom(x, y).canGoNorth() == true){
					System.out.println("Exit: NORTH");
				}
			
					if (map.getRoom(x, y).canGoSouth() == true){
					System.out.println("Exit: SOUTH");
				}
			}
			
			
			
			
//KEY COMMAND
			if (command.equalsIgnoreCase("GET KEY")){
				
				if (map.getRoom(x, y).getKey() != null){
				player.setKey(map.getRoom(x, y).getKey());
				map.getRoom(x, y).clearKey();
				System.out.println("I acquired the key"/*+player.theKey+""+map.getRoom(x, y).getKey()*/);
				}
				else {
					System.out.println("There is not a key around here...");
				}
			}

			
			
//CHEST COMMANDS
			if (command.equalsIgnoreCase("OPEN CHEST") && map.getRoom(x, y).getChest() != null){
				
				if(map.getRoom(x, y).getChest().isLocked() == false){
				System.out.println("I am opening the chest...and found...");
				System.out.println(map.getRoom(x, y).getChest().getContents());
				System.out.println("YOU FOUND ALL THE GOLD YOU EVER DREAMED OF IN THIS CHEST!");
				}
				else {
					System.out.println("The chest is locked");
				}
				
			}
		
			if (command.equalsIgnoreCase("UNLOCK CHEST")){
				
				if (player.getKey() != null){
				
				map.getRoom(x, y).getChest().unLock(player.theKey);
				System.out.println("I am unlocking the chest");
				}
				if (player.getKey() == null) {
				System.out.println("You really wish you had a key...");
				}
				
				if (map.getRoom(x, y).getChest() == null){
					System.out.println("You really wish there was a chest to tamper with...");
				}
			}
//RAGEQUIT COMMAND
			if (command.equalsIgnoreCase("HARAKIRI")){
				System.out.println("Committing harakiri in disgust");
				System.exit(0);
			}
//OTHER COMMAND HANDLER			
			if ( (!command.equalsIgnoreCase("NORTH")) && !command.equalsIgnoreCase("SOUTH") && !command.equalsIgnoreCase("EAST") && !command.equalsIgnoreCase("WEST") && !command.equalsIgnoreCase("GET LAMP") && !command.equalsIgnoreCase("LIGHT LAMP") && !command.equalsIgnoreCase("LOOK") && !command.equalsIgnoreCase("GET KEY")  && !command.equalsIgnoreCase("OPEN CHEST") && !command.equalsIgnoreCase("UNLOCK CHEST") ) {
					System.out.println("I'm sorry. I don't know how to do that.");	
					}
			
	}//closes MAIN
	
	}//closes alive while loop
	

}//close ADVENTURE
