package day2;

public class Use_Bag {
	public static void main(String[] args) {
	
	Bag b = new Bag();
	
	b.brand = "WILDCRAFT";
	b.colour ="black";
	b.no_Of_Zips = 5;
	b.price = 1200.50f;
	
	System.out.println(b.brand+" "+b.colour+" "+b.no_Of_Zips+" "+b.price);
	
	Bag b1 = new Bag();
	
	b1.brand="American Eagle";
	b1.colour = "grey";
	b1.no_Of_Zips=10;
	b1.price=120000.50f;
	
	System.out.println(b1.brand+"\n"+b1.no_Of_Zips+"\n"+b1.colour+"\n"+b1.price);
	
	Bag b2 = new Bag();
	
	b2.brand ="Travel bag";
	b2.colour = "red";
	b2.no_Of_Zips =15;
	b2.price = 13000.50f;
	
	System.out.println(b2.price+" "+b2.brand+" "+b2.colour+" "+b2.no_Of_Zips);
	
	
	
	
		
	}

}
