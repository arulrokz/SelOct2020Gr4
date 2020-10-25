package org.student;

import org.department.*;

public class Student extends Department {
	// Methods :studentName(),studentDept(),studentId()

	public void studentName(String sName) {
		System.out.println("Student Name:" + sName);
	}

	public void studentDept(String sDept) {
		System.out.println("Student Name:" + sDept);
	}

	public void studentId(int sID) {
		System.out.println("Student Name:" + sID);
	}

	public static void main(String[] args) {
		Student stu = new Student();
		stu.collegeName("MIT");
		stu.collegeCode(010);
		stu.collegeRank(1);
		stu.deptName("Electronics");
		stu.studentName("James Bond");
		stu.studentDept("Electronics");
		stu.studentId(007);

	}

}
