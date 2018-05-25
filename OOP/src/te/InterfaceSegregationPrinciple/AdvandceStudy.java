package te.InterfaceSegregationPrinciple;

import java.util.function.Function;

public class AdvandceStudy implements InfCommonStudy, InfAdvandceStudy{

	@Override
	public Function studyJapanse() {
		// TODO Auto-generated method stub
		System.out.println("\t\tStudent will study Japanse");
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
