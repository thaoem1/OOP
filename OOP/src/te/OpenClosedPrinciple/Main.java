package te.OpenClosedPrinciple;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String n;
		int numb;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input name goods:");
		n = sc.nextLine();
		System.out.println("Input number goods:");
		numb = sc.nextInt();
		Payment p = new Retail(numb);
		p.sale();
		Payment ws = new WholeSale(numb);
		ws.sale();
//		
//		if(numb>10) {
//			Payment p = new Retail(numb);
//			p.sale();
//		}
//		else {
//			Payment ws = new WholeSale(numb);
//			ws.sale();
//		}
//	
	}

}
