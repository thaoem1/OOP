package te.Abstraction;

public abstract class CrollHeight {

	String crollHeight;
	public static final String AUTO = "auto";
	
	public void setCrollHeight(int number) {
		if (number > 12) {
			crollHeight = AUTO;
		} else {
			crollHeight = 600 + "";
		}
	}
}

