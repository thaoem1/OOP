package te.LiskovSubstitutionPrinciple;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NationalSocialActivity A= new NormalStudent();
		List<Student> allStudentRunForSecretary = new ArrayList<Student>();
			allStudentRunForSecretary.add(new NormalStudent());
			allStudentRunForSecretary.add(new ForeignStudent());
			allStudentRunForSecretary.add(new AdvancedStudent());
			
			// run for Secretary
			for (Student stu : allStudentRunForSecretary){
				if (stu instanceof NationalSocialActivity)
					((NationalSocialActivity)stu).runForSecrectary();

		}

	}

}
