package com.codercampus;


public class Students implements Comparable<Students>{
	private Integer studentID;
	private String studentName;
	private String Course;
	private int Grade;
	public Students(Integer studentID, String studentName, String Course, Integer Grade) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.Course = Course;
		this.Grade = Grade;
	}
	public Integer StudentID() {
		return studentID;
	}
	public void setStudnentID(Integer studentID) {
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
	public Integer getGrade() {
		return Grade;
	}
	public void setGrade(Integer grade) {
		Grade = grade;
	}
	
	@Override
	public String toString() {
		return "Students [studentID=" + studentID + ", studentName=" + studentName + ", Course=" + Course + ", Grade="
				+ Grade + "]";
	}
	@Override
	public int compareTo(Students that) {
//		Comparing it in descending order
		if (that.Grade < this.Grade) {
			return 1;
		}
			
		else if (that.Grade == this.Grade ) {
		return 0;	

}
		else {
			return -1;
		}
	}
}

