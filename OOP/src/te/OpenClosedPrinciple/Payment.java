package te.OpenClosedPrinciple;

import java.util.Scanner;


public abstract class Payment {
	private int id;
	private String nameGoods;
	private float price;
	
	public Payment() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameGoods() {
		return nameGoods;
	}

	public void setNameGoods(String nameGoods) {
		this.nameGoods = nameGoods;
	}
	
	abstract void sale();
	
}
