package te.Polymorphims;

/*
class Animal{
	void eat() {
		System.out.println("Animal is eating ...");
	}
}

class ParentDog extends Animal{
	void eat() {
		System.out.println("ParentDog is eating ...");
	}
}

class BabyDog extends ParentDog{
	void eat() {
		System.out.println("BabeDog is eating ...");
	}
}

public class PolymorphimsInExtendsMuchLayer {
	public static void main(String []agrs) {
		Animal anm = new ParentDog();
		ParentDog pd = new ParentDog() ;
		BabyDog bd = new BabyDog();
		anm.eat();
		pd.eat();
		bd.eat();
	}
}
*/

class Animal{
	void eat() {
		System.out.println("Animal is eating ...");
	}
}

class ParentDog extends Animal{
	void eat() {
		System.out.println("ParentDog is eating ...");
	}
}


public class PolymorphimsInExtendsMuchLayer {
	public static void main(String []agrs) {
		Animal anm;
		anm = new Animal();
		anm = new ParentDog() ; // Luu y
		anm.eat();
		anm.eat();
	}
}
