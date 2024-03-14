package com.codercampus;

import java.util.List;

public class Students implements Comparable<Students>{
	private int studentID;
	private String studentName;
	private String Course;
	private int Grade;
	public Students(int studentID, String studentName, String Course, int Grade) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.Course = Course;
		this.Grade = Grade;
	}
	public int StudentID() {
		return studentID;
	}
	public void setStudnentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public int getGrade() {
		return Grade;
	}
	public void setGrade(int grade) {
		Grade = grade;
	}
	@Override
	public int compareTo(Students that) {
		
		// TODO Auto-generated method stub
		return Integer.compare(other.Grade, this.Grade );
	}


}
