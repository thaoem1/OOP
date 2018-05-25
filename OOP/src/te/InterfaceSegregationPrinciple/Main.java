package te.InterfaceSegregationPrinciple;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NormalStudent ns = new NormalStudent();
		System.out.println("Normal Student: ");
		ns.studyEnglish();
		ns.studyExercise();
		ns.studyMath();
		
		AdvandceStudy as = new AdvandceStudy() ;
		System.out.println("Advandce Student: ");
		as.studyEnglish();
		as.studyJapanse();
		as.studyMath();
	}

}
