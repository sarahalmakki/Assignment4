package com.codercampus;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class fileWriter {

try {
//	initating 'line'  variable
	String line;
	String header = "Student ID,Student Name,Course,Grade";
	BufferedWriter COMPSCIWriter = new BufferedWriter(new FileWriter("course1.csv"));
	BufferedWriter STATWriter = new BufferedWriter(new FileWriter("course2.csv"));
	BufferedWriter APMTHWriter = new BufferedWriter(new FileWriter("course3.csv"));
	//	writing header line in each line
	COMPSCIWriter.write(header + "\n");
	STATWriter.write(header + "\n");
	APMTHWriter.write(header + "\n");
	 String course = "COMPSCI";
	if (course.contains("COMPSCI")) {
		COMPSCIWriter.write(line + "\n");
	}
	else if(course.contains("STAT")){
		STATWriter.write(line + "\n");
	}
	else {
		APMTHWriter.write(line + "\n");
	}
	
	COMPSCIWriter.close();
	STATWriter.close();
	APMTHWriter.close();
	
}


 catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}}
