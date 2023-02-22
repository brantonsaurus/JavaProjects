/* * [VYOM, TEAL TURTLE GROUP, CSCI 1301].java * Author:  [BRANTON GRAY DEARMOUN]  * Submission Date:  [11/15/2018] * 
 * 
 * 
 * * Purpose: THIS IS STAT CLASS WHICH CALCULATES THE MIN, MAX, AVERAGE, MODE, VARIANCE AND STANDARD DEVIATION 
 * FOR DATA SETS THAT MIGHT INCLUDE FLOATS, LONGS, INTEGERS AND DOUBLES*
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


public class Stat {
	private double[] data;
	
	
	//DONE -DEFAULT CONSTRUCTOR
	public Stat() {

			double[] d = {};
			data = d;
}
	//DONE - CONSTRUCTOR
	public Stat(double[] d) {
		
		double[] store = new double[d.length]; 
		for (int i =  0; i < d.length; i++) {
			store[i] = d[i];
		}

		data = store;
}
	
public Stat(float[] f) {
		
		double[] store = new double[f.length]; 
		for (int i =  0; i < f.length; i++) {
			store[i] = f[i];
		}

		data = store;
}

public Stat(int[] i) {
	
		double[] store = new double[i.length]; 
		for (int j =  0; j < i.length; j++) {
			store[j] = i[j];
		}
	
		data = store;
}

public Stat(long[] lo) {
	
		double[] store = new double[lo.length]; 
		for (int i =  0; i < lo.length; i++) {
			store[i] = lo[i];
		}
	
		data = store;
}
	
	
	//DONE - GETTER
	public double[] getData() {
		
		double[] storage = new double[data.length];
			
		for (int i =  0; i < data.length; i++) {
			storage[i] = data[i];
		}
		
		data = storage;
		
		return storage;
	}
	//COMPLETE THESE FOR ALL NUMERICAL DATA TYPES - SETTER


public void setData(float[] f) {

		double[] storage = new double[f.length];
		
		for (int j =  0; j < f.length; j++) {
			storage[j] = f[j];
		}
		
		data = storage;
}

	
	public void setData(double[] d) {

		double[] storage = new double[d.length];
		
		for (int i =  0; i < d.length; i++) {
			storage[i] = d[i];
		}
		
		data = storage;
	}
	
	public void setData(int[] i) {

		double[] storage = new double[i.length];
		
		for (int j =  0; j < i.length; j++) {
			storage[j] = i[j];
		}
		
		data = storage;
	}	
	
public void setData(long[] lo) {

		double[] storage = new double[lo.length];
		
		for (int j =  0; j < lo.length; j++) {
			storage[j] = lo[j];
		}
		
		data = storage;
	}
		
	
	
	
	
	
	
	
//DONE - COMPARES EACH OF THE EXTRACTABLE VALUES OF ONE DATA SET TO ANOTHER DATA SET
public boolean equals(Stat anotherS) {
		
			if (this.getData().length == anotherS.getData().length && this.average() == anotherS.average() && this.max() == anotherS.max() && this.average() == anotherS.average() && this.min() == anotherS.min() && this.mode() == anotherS.mode()){
				return true;
			}		
			else {
				return false;
			}
		}
	
public void reset() {
	

	double[] d = {};
	this.data = d;
	
	
}//closes reset

public boolean isEmpty() {
	
								if (this.getData().length == 0) {
									return true;
								}
								else {
									return false;
								}
}//closes isEmpty
	
public void dataPrint(){
	System.out.println("[");
	for (int i = 0; i < this.getData().length; i++){
		System.out.println(this.getData()[i]+" , ");
	}
	System.out.println("]");
}
	
	
	//DONE - PRINTS THE PARTICULARS OF AN DATA SET TO A STRING
	public String toString() {
		System.out.print("Data: [");
		for (int i = 0; i < this.getData().length; i++){
			System.out.print(this.getData()[i]+" , ");
		}
		System.out.print("]");
		return "\nMin: "+ this.min() + "\nMax: " + this.max() + "\nAverage: " + this.average() +"\nMode: " + this.mode() + "\nvariance: " + this.variance() + "\nStandard Deviation: " + this.standardDeviation();
	}
	//DONE - FIND THE SMALLEST NUMBER IN THE DATA SET
	public double min() {
		
								if (this.getData().length == 0) {
									return Double.NaN;
								}
								
								
								double minimum = data[0];
						
								for (int i = 0; i < data.length; i++){
									
								if (data[i] < minimum){
									minimum = data[i];
								}
								}
								return minimum;
	}
//DONE - FIND THE LARGEST NUMBER IN THE DATA SET
	public double max() {
		
								if (this.getData().length == 0) {
									return Double.NaN;
								}
								
								double maximum = data[0];
								
										for (int i = 0; i < data.length; i++){
											
										if (data[i] > maximum){
											maximum = data[i];
										}
										}
										return maximum;
	}
//DONE - RETURN THE AVERAGE OF ALL THE NUMBERS IN THE DATA SET
	public double average() {
		
									if (this.getData().length == 0) {
										return Double.NaN;
									}
									
									double adder = 0;
									for (int i = 0; i < this.data.length; i++){
									adder += this.data[i];
									}
										return adder/this.data.length;
		
	}
// DONE -RETURN THE VALUE WHICH APPEARS MOST FREQUENTLY
//IN THE DATA SET

//RETURNS Double.NaN if there is no repeating value like this
//IN THE DATA SET.
	public double mode() {
		
								if (this.getData().length == 0) {
									return Double.NaN;
								}
								
								int counter1 = 0;
								int counter2 = 0;
								double mode = 0;
//I NESTED TWO FOR LOOPS TO BRUTE-FORCE ITERATE THROUGH ALL THE VALUES, KEEP A COUNT, COUNT AND COMPARE AGAIN, RESET, COUNT AND COMPARE,
//RESET, COUNT AND COMPARE AND THEN FINALLY DELIVER A MODE VALUE. IF NO UNIQUE MODE VALUE EXISTS, THEN THE MODE DRIFTS TO 0.0 AND I
//THEN SET THAT EQUAL TO DOUBLE.NAN TO RETURN THE PROPER RESULT.
									for(int i = 0; i < this.data.length; i++){
										
										for(int j = 0; j < this.data.length; j++){
											
											if (i != j && this.data[i] == this.data[j]){
												counter1++;
												if(counter1 > counter2){
													mode = this.data[i];
												}
													
												counter1 = counter2;
											}
											counter1 = 0;
										}
										
										if (mode == 0.0){
											mode = Double.NaN;
										}
									}
									return mode;
								}
	
//RETOOL THIS FUNCTION SO THAT YOU ARE CALUCLATING THE DIFFERENCE BETWEEN THE
//MEAN AND EACH DATA VALUE
	
public double variance() {
	
								if (this.getData().length == 0) {
									return Double.NaN;
								}
	
	
	
										double adder = 0;
										for (int i = 0; i < this.data.length; i++){
										
										adder += Math.pow((this.data[i]-this.average()), 2);
										}
											double variance;
											variance = adder/this.data.length;
											return variance;
}
	
public double standardDeviation() {
	
								if (this.getData().length == 0) {
									return Double.NaN;
								}
								
											
											double store;
											store = this.variance();
											double standardDeviation;
											standardDeviation = Math.sqrt(store);
											return standardDeviation;
}//closes standard deviation

	

//APPEND TO AN ARRAY


//WHAT I WANT TO DO:
// CONCACTENATE TWO ARRAYS, USE THE LENGTH OF BOTH TO DETERMINE THE
//LENGTH OF THE CONCATENATED ARRAY...AND THEN FILL THAT THIRD ARRAY
//USING A FOR LOOP THAT STARTS AT ZERO FOR THE FIRST AND THEN
//PICKS UP WHERE THE LAST LOOP LEFT OFF USING A COUNTER EMBEDDED IN THE
//FIRST FOR LOOP

public void append(double[] d){
	
							
								
								if (d.length == 0) {
									System.out.println("This argument set is empty");
									return;
								}
								
								int lenA, lenB, lenC;
								int marker = 0;
								
								lenA = this.getData().length;
								lenB = d.length;
								lenC = lenA + lenB;
								
								
								double[] con = new double[lenC];
								
								for(int j = 0; j < lenA; j++) {
									con[j] = this.getData()[j];
									marker++;
								}
								
								for(int i = 0; i < lenB; i++) {
									con[marker++] = d[i];
								}
								
								data = con;
}//closes double append

//FINISH THE ARRAY CONCAT METHODS
public void append(int[] i){
								
							
								if (i.length == 0) {
									System.out.println("This argument set is empty");
								}
								
								int lenA, lenB, lenC;
								int marker = 0;
								
								lenA = this.getData().length;
								lenB = i.length;
								lenC = lenA + lenB;
								
								
								double[] con = new double[lenC];
								
								for(int j = 0; j < lenA; j++) {
									con[j] = this.getData()[j];
									marker++;
								}
								
								for(int k = 0; k < lenB; k++) {
									con[marker++] = i[k];
								}
								
								data = con;
}//closes append integer

public void append(long[] lo){
								
					
								if (lo.length == 0) {
									System.out.println("This argument set is empty");
								}
								
								int lenA, lenB, lenC;
								int marker = 0;
								
								lenA = this.getData().length;
								lenB = lo.length;
								lenC = lenA + lenB;
								
								
								double[] con = new double[lenC];
								
								for(int j = 0; j < lenA; j++) {
									con[j] = this.getData()[j];
									marker++;
								}
								
								for(int i = 0; i < lenB; i++) {
									con[marker++] = lo[i];
								}
								
								data = con;
								
}//closes append long

public void append(float[] f){
								
								
								if (f.length == 0) {
									System.out.println("This argument set is empty");
								}
								
								int lenA, lenB, lenC;
								int marker = 0;
								
								lenA = this.getData().length;
								lenB = f.length;
								lenC = lenA + lenB;
								
								
								double[] con = new double[lenC];
								
								for(int j = 0; j < lenA; j++) {
									con[j] = this.getData()[j];
									marker++;
								}
								
								for(int i = 0; i < lenB; i++) {
									con[marker++] = f[i];
								}
								
								data = con;
	
}//closes append float




}
