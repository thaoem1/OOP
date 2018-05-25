package te.OpenClosedPrinciple;

public class WholeSale extends Payment {
	private float priceWholesale;
	
	

	public WholeSale(float priceWholesale) {
		super();
		this.priceWholesale = priceWholesale;
	}



	@Override
	void sale() {
		if(priceWholesale>10) {
			// TODO Auto-generated method stub
			System.out.println("price wholesale");
			System.out.println("Price: " +priceWholesale*0.5);
		}
	}
	
	
}
