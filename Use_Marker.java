package day2;

public class Use_Marker {
	
	public static void main(String[] args) {
		
	Marker m1 = new Marker();
	
	m1.colour = "black";
	m1.brand = "camlin";
	m1.price = 50;
	m1.height = 2.6f;
	m1.shape = "round";
	
	System.out.println(m1.colour);
	System.out.println(m1.brand);
	System.out.println(m1.price);
	System.out.println(m1.height);	
	System.out.println(m1.shape);
		
	Marker m2 = new Marker();
	
	m2.colour = "red";
	m2.brand = "natraj";
	m2.price = 70;
	m2.height = 3.2f;
	m2.shape = "cylindrical";
	
	Marker m3 = new Marker();
	
	m3.colour = "yellow";
	m3.brand = "parker";
	m3.price = 50;
	m3.height = 4.5f;
	m3.shape = "rectangular";
	
	System.out.println(m2.colour+" "+m2.brand+" "+m2.price+" "+m2.height+" "+m2.shape);
	System.out.println(m3.brand+"\n"+m3.colour+"\n"+m3.price+"\n"+m3.shape+"\n"+m3.height);
	
		
	}

}
