package day2;

public class Use_Car1 {

	public static void main(String[] args) {
		
	Car1 c = new Car1();
	
	c.brand = "BMW";
	c.colour = "White";
	c.price = 500000.50f;
	c.tax_Percentage = 20.0f;
	c.net_Price= c.price+(c.price*c.tax_Percentage/100);
	
	System.out.println(c.brand+" "+c.colour+" "+c.price+" "+c.tax_Percentage+" "+c.net_Price);
	
    Car1 c1 = new Car1();
	
	c1.brand = "AUDI";
	c1.colour = "BLACK";
	c1.price = 1000000.50f;
	c1.tax_Percentage = 20.0f;
	c1.net_Price= c1.price+(c1.price*c1.tax_Percentage/100);
	
	System.out.println(c1.brand+" "+c1.colour+" "+c1.price+" "+c1.tax_Percentage+" "+c1.net_Price);
	
			
		
	}
	
	
	
	
	
}
