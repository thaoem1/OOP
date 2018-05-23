package te.Polymorphims;

class Parent{
	int a = 100;
}

class Son extends Parent{
	int a = 90;
}

public class ParentOverridSon {
	public static void main(String[] args) {
		Parent p = new Son();
		System.out.println("Now value is " + p.a);
	}

}
