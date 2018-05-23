package te.encapsulation;

class ParentClassObject extends ClassObjectEncapsulation{
	public static void main(String []agrs) {
		ParentClassObject parentclassO = new ParentClassObject(); // create object
		parentclassO.setName("Thao Em");
		parentclassO.setId("B1400553");
		parentclassO.setAge(22);
		System.out.println(parentclassO.getName()+ " co ID la " + parentclassO.getId() +" da duoc " + parentclassO.getAge() +" tuoi.");
	}
}
