package day2;

public class Use_Shirt {
	
	public static void main(String[] args) {
		
	Shirt s = new Shirt();
	s.brand ="US POLO";
	s.colour = "black";
	s.price=1500.50f;
	s.discount_percentange = 10.0f;
	s.net_Prize = s.price-(s.price*s.discount_percentange/100);
	
	System.out.println(s.brand+" "+s.colour+" "+s.price+" "+s.discount_percentange+" "+s.net_Prize);
		
	Shirt s1 = new Shirt();
	s1.brand ="vanhussain";
	s1.colour = "black";
	s1.price=2800.50f;
	s1.discount_percentange = 20.0f;
	s1.net_Prize = s1.price-(s1.price*s1.discount_percentange/100);
	
	System.out.println(s1.brand+" "+s1.colour+" "+s.price+" "+s1.discount_percentange+" "+s1.net_Prize);
		
	Shirt s3 = new Shirt();
	s3.brand ="Denim";
	s3.colour = "grey";
	s3.price = 3000.50f;
	s3.discount_percentange = 15.0f;
	s3.net_Prize = s3.price-(s3.price*s3.discount_percentange/100);
	
	System.out.println(s3.brand+" "+s3.colour+" "+s3.price+" "+s3.discount_percentange+" "+s3.net_Prize);
		
	
	
	
	
	}

}
