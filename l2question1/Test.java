package L3HW;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer("Fasil","Habtegiorgis","3405474");
		Customer c2=new Customer("Robel","Habtamu","349684");
		Customer c3=new Customer("Henok","sendeku","66868494");
		Address c1billing=new Address("14th","DC","Washington","20011");
		Address c1Shipping=new Address("15th","DC","Washington","23456");
		Address c2billing=new Address("nth","Chicago","illionios","34567");
		Address c2Shipping=new Address("15th","Birmingham","Al","35423");
		Address c3billing=new Address("zth","Chicago","illionios","20011");
		Address c3Shipping=new Address("15th","DC","Washington","20011");
		
		c1.setBillingAddress(c1billing);
		c1.setShippingAddress(c1Shipping);
		c2.setBillingAddress(c2billing);
		c2.setShippingAddress(c2Shipping);
		c3.setBillingAddress(c3billing);
		c3.setShippingAddress(c3Shipping);
		
		Customer customers[]=new Customer[3]; 
		customers[0]=c1;
		customers[1]=c2;
		customers[2]=c3;
		
		for(Customer ischicago:customers) {
			
			if(ischicago.getBillingAddress().getCity()=="Chicago") {
				
				System.out.println(ischicago.getFirstName()+" "+ischicago.getLastName());
			}
			
		}
	}

}
