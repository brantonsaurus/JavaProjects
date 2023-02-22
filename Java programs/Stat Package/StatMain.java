
public class StatMain {

	public static final double THRESHOLD = 0.001;
	
	public static void main(String[] args) {

	      double[] d = 	{-5.3,	2.5,	88.9,	0.0,	0.0,	28.0,	16.5,	88.9,	109.5,	-90.0,	88.9};
	  double[] g =	{-5.3,	-5.3,	88.9,	-5.3,	0.0,	28.0,	16.5,	88.9,	109.5,	-90.0,	-5.3};
		Stat stat1 = new Stat();
		Stat stat2 = new Stat();
		Stat stat3 = new Stat(g);
		stat1 = new Stat(d);
		stat2.setData(d);
		
		System.out.println(stat1.toString());
        System.out.println(stat2.toString());
        System.out.println(stat3.toString() + (stat1 == stat2));
        
        System.out.println("Is there anyone home?");
        stat2.append(d);

        System.out.println(stat2.getData().length);
       
        stat1.reset();
        stat3.reset();
        
        System.out.println(stat1.toString());

        System.out.println(stat2.toString());

        System.out.println(stat3.toString());
	}

}
