package day2;

public class Use_laptop {
	
	public static void main(String[] args) {
		
		Laptop l = new Laptop();
		 
		l.brand ="HP";
		l.price = 56000.50f;
		l.ram = "16GB";
		
		System.out.println(l.brand+"\n"+l.price+"\n"+l.ram);
		
		Laptop l1 = new Laptop();
		
		l1.brand ="DELL";
		l1.ram = "32gb";
		l1.price = 60000.35f;
		
		System.out.println(l1.brand+" "+l1.price+" "+l1.ram);
		
		Laptop l2 = new Laptop();
		
		l2.brand ="ASUS";
		l2.price = 100000.023f;
		l2.ram= "64GB";
		
		System.out.println(l2.brand);
		System.out.println(l2.price);
		System.out.println(l2.ram);
		
		
	}
	

}
