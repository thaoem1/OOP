package te.InterfaceSegregationPrinciple;

import java.util.function.Function;

public class NormalStudent implements InfCommonStudy, InfNormalStudy {

	@Override
	public Function studyExercise() {
		// TODO Auto-generated method stub
//		public String Study(String m) {
			System.out.println("\t\tStudent will add study Excercise");
//		}
		
		return null;
	}

	@Override
	public Function studyEnglish() {
		// TODO Auto-generated method stub
		System.out.println("\t\tStudent will study English");
		return null;
	}

	@Override
	public Function studyMath() {
		// TODO Auto-generated method stub
		System.out.println("\t\tStudent will study Math");
		return null;
	}

}
