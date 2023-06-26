package day2;

public class Use_Bike {

	public static void main(String[] args) {
		
	Bike b = new Bike();
	
	b.brand = "pulsar";
	b.price = 125000.65f;
	b.disount_Amount = 10000.75f;
	b.net_Price = b.price - b.disount_Amount;
	
	System.out.println(b.brand+" "+b.net_Price);
	
	
    Bike b1 = new Bike();
	
	b1.brand = "Hornet";
	b1.price = 120000.65f;
	b1.disount_Amount = 10000.75f;
	b1.net_Price = b1.price - b1.disount_Amount;
	
	System.out.println(b1.brand+" "+b1.net_Price);
	
	 Bike b2 = new Bike();
		
	 b2.brand = "Pulsar ns200";
	 b2.price = 150000.65f;
	 b2.disount_Amount = 15000.75f;
	 b2.net_Price = b2.price - b2.disount_Amount;
		
	 System.out.println(b2.brand+" "+b2.net_Price);
		
		
		
		
		
		
	}
	
}
