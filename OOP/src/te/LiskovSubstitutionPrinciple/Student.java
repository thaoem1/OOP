package te.LiskovSubstitutionPrinciple;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

class Student {

	private String id;
	private String name;
	private int age;
	//private Array json_encode;
	private List<NationalSocialActivity> allStudentRunForSecretary = new ArrayList<NationalSocialActivity>();
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	String getStudentInfoJson() {
		return json_encode(Array(id,name,age));
	}

	private String json_encode(Object array) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object Array(String id2, String name2, int age2) {
		// TODO Auto-generated method stub
		return null;
	}

/*
	String StudentInfoJson1 Array(String id, String name, int age) {
		return json_encode(Array(id,name,age));
	}
	
	List<NationalSocialActivity> allStudentRunForSecretary = new List<NationalSocialActivity>() {
		allStudentRunForSecretary.add(new NormalStudent());
		allStudentRunForSecretary.add(new ForeignStudent());
		allStudentRunForSecretary.add(new AdvancedStudent());
		
		// run for Secretary
		foreach(Student in allStudentRunForSecretary){
			Student.runForSecretary();
		}

	}	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	}
	*/
}
	

