package com.codercampus;
	public  class Student implements Comparable<Student>{
		private Integer studentID;
		private String studentName;
		private String courseName;
		private int grade;
		public Student(Integer studentID, String studentName, String courseName, Integer grade) {
			this.studentID = studentID;
			this.studentName = studentName;
			this.courseName = courseName;
			this.grade = grade;
		}
		public Integer getStudentID() {
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
			return courseName;
		}
		public void setCourse(String courseName) {
			this.courseName = courseName;
		}
		public Integer getGrade() {
			return grade;
		}
		public void setGrade(Integer grade) {
			this.grade = grade;
		}
		@Override
		public String toString() {
		    return "StudentID: " + studentID + ", StudentName: " + studentName + ", Course: " + courseName + ", Grade: " + grade;
		}

		@Override
		public int compareTo(Student that) {
//			Comparing it in descending order
				return Integer.compare(that.grade , this.grade);
	
	}
	}
