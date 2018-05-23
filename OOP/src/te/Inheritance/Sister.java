package te.Inheritance;

class Mother{
	int salary1 = 50; // can public, private
}

public class Sister extends Mother{
	private int salary2 = 40; // can public, protected
	
	public static void main(String []agrs) {
		Sister st = new Sister();
		System.out.println("Money sister recive from mother: " +st.salary1);
		System.out.println("Money sister have: " +st.salary2);
	}
}
