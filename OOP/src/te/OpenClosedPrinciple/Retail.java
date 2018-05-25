package te.OpenClosedPrinciple;

public class Retail extends Payment{
	private float priceRetail;
	
public Retail(float priceRetail) {
		super();
		this.priceRetail = priceRetail;
	}

//	
//	public Retail() {
//		
//	}
//
//	public float getPriceRetail() {
//		return priceRetail;
//	}
//
//	public void setPriceRetail(float priceRetail) {
//		this.priceRetail = priceRetail;
//	}

	@Override
	void sale() {
		if(priceRetail<10) {
			System.out.println("price retail");
			System.out.println("Price: " +priceRetail*1.2);
		}
		// TODO Auto-generated method stub
	}
	
	
}
