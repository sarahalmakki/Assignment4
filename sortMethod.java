package com.codercampus;

import java.util.ArrayList;
import java.util.List;

public class sortMethod {
	String MasterFilePath = "student-master-list.csv";
	  private List<Students> COMPSCIStudents = new ArrayList<>();
	   private List<Students> STATStudents = new ArrayList<>();
	    private List<Students> APMTHStudents = new ArrayList<>();
	    private Students[] students = new Students[101];
	    
	public void sortStudentsByCourse() {
	for (Students students : students) {
		String course = students.getCourse();
		if (course.contains("COMPSCI")) {
			 COMPSCIStudents.add(students);
		}
	
	else if(course.contains("STAT")){
		STATStudents.add(students);
	}
	else {
		APMTHStudents.add(students);
	}
}
}
}
