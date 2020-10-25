package week3.day1;

public class Students {
	public Students() {
		System.out.println("This is the default Constructor call");
		System.out.println("***************************************");
	}

	public Students(String sName, int sID) {
		// System.out.println("This is a constructor call with arguments",
		// sName);
		// System.out.println("This is a constructor call with arguments", sID);

		this();

		System.out.println("I am inside the Parameterised  constructor");
		System.out.println("***************************************");

	}

	public void getStudentInfo(String sName) {
		System.out.println("Student Name : " + sName);
	}

	public void getStudentInfo(String sName, int sID) {
		System.out.println("Student name: " + sName);
		System.out.println("Student ID: " + sID);
	}

	public void getStudentInfo(String sName, int sID, String sDept) {
		System.out.println("Student name: " + sName);
		System.out.println("Student ID: " + sID);
		System.out.println("Student Dept: " + sDept);
	}

	public static void main(String[] args) {
		Students stu1 = new Students();
		Students stu2 = new Students("name", 23);
		stu1.getStudentInfo("James Bond");
		stu1.getStudentInfo("James", 007);
		stu1.getStudentInfo("Bond", 123, " ECE");
		stu2.getStudentInfo("John", 321, "Mech");

	}

}
