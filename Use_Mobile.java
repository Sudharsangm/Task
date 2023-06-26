package day2;

public class Use_Mobile {
	
	public static void main(String[] args) {
		Mobile m = new Mobile();
		
		m.brand ="redmi";
		m.colour = "dark grey";
		m.price = 16500.00f;
		
		System.out.println(m.brand+" "+m.colour+" "+m.price);
		
		Mobile m1 = new Mobile();
		m1.brand = "samsung ";
		m1.colour="gold";
		m1.price=14300.25f;
		
		System.out.println(m1.brand+"\n"+m1.price+"\n"+m1.colour);
	}

}
