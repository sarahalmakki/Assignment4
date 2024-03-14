package com.codercampus;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StudentEnrollementAppliaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String header = null;
try {
	BufferedWriter compSci = new BufferedWriter(new FileWriter("course1.csv"));
	BufferedWriter STAT239 = new BufferedWriter(new FileWriter("course2.csv"));
	BufferedWriter APMTH127 = new BufferedWriter(new FileWriter("course3.csv"));

	//	writing the files using the three objects
	compSci.write(header + "/n");
	STAT239.write(header + "/n");
	APMTH127.write(header + "/n");
	compSci.close();
	STAT239.close();
	APMTH127.close();

} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


		
	}

}
