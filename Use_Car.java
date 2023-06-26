package day2;

public class Use_Car {

public static void main(String[] args) {
	
	Car c = new Car();
	
	c.brand = "BMW";
	c.colour = "White";
	c.price = 500000.50f;
	c.tax_Amount = 25000.25f;
	c.net_Price= c.price + c.tax_Amount;
	
	System.out.println(c.brand+" "+c.colour+" "+c.price+" "+c.tax_Amount+" "+c.net_Price);
	
	Car c1 = new Car();
	
	c1.brand = "rolls royce";
	c1.colour = "black";
	c1.price = 12000000.45f;
	c1.tax_Amount = 300000.55f;
	c1.net_Price = c1.price+c1.tax_Amount;
	
	System.out.println(c1.brand+"\n"+c1.colour+"\n"+c1.price+"\n"+c1.tax_Amount+"\n"+c1.net_Price);
	
	Car c2 = new Car();
	
	c2.brand = "Nexa";
	c2.colour = "Red";
	c2.price = 150000.75f;
	c2.tax_Amount=25000.23f;
	c2.net_Price = c2.price+c2.tax_Amount;
	
	System.out.println(c2.brand+"\n"+c2.colour+"\n"+c2.price+"\n"+c2.tax_Amount+"\n"+c2.net_Price);
	
	
	
	
}	
	
}
