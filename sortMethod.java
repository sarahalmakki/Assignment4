package com.codercampus;

import java.util.ArrayList;
import java.util.List;

public class sortMethod {
	String MasterFilePath = "student-master-list.csv";
//	list of Students array's objects 
	private List<Students> COMPSCIStudents = new ArrayList<>();
	private List<Students> STATStudents = new ArrayList<>();
	private List<Students> APMTHStudents = new ArrayList<>();
	private Students[] students = new Students[101];

//	creating sortstudentbyCourse method    
	public void sortStudentsByCourse() {
		for (Students students : students) {
//		declaring the course variable with the appropriate vales before using it in conditional statements
			String course = students.getCourse();
			if (course.contains("COMPSCI")) {
				COMPSCIStudents.add(students);
			}

			else if (course.contains("STAT")) {
				STATStudents.add(students);
			} else {
				APMTHStudents.add(students);
			}
		}
	}
}
