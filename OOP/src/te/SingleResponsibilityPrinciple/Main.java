package te.SingleResponsibilityPrinciple;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director d = new Director();
		d.Manage();
		Secrectary s = new Secrectary();
		s.SuppotDirector();
		Sale sale = new Sale();
		sale.Saling();
	}

}
