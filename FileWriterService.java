package com.codercampus;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterService {
	public void writeFile(Student[] students, String CoursName) {
		try {
//			initating 'line'  variable
			String header = "Student ID,Student Name,Course,Grade";
			BufferedWriter COMPSCIWriter = new BufferedWriter(new FileWriter("course1.csv"));
			BufferedWriter STATWriter = new BufferedWriter(new FileWriter("course2.csv"));
			BufferedWriter APMTHWriter = new BufferedWriter(new FileWriter("course3.csv"));
			// writing header line in each line
			COMPSCIWriter.write(header + "\n");
			STATWriter.write(header + "\n");
			APMTHWriter.write(header + "\n");

			for (Student student : students) {
				// declaring the course variable with the appropriate vales before using it in
				// conditional statements
				if (student.getCourse().contains("COMPSCI")) {
					COMPSCIWriter.write(student.getStudentID() + "," + student.getStudentName() + ","
							+ student.getCourse() + "," + student.getGrade() + "\n");
				}

				else if (student.getCourse().contains("STAT")) {
					STATWriter.write(student.getStudentID() + "," + student.getStudentName() + "," + student.getCourse()
							+ "," + student.getGrade() + "\n");
				} else if (student.getCourse().contains("APMTH")) {
					APMTHWriter.write(student.getStudentID() + "," + student.getStudentName() + ","
							+ student.getCourse() + "," + student.getGrade() + "\n");
				}

			}

			COMPSCIWriter.close();
			STATWriter.close();
			APMTHWriter.close();

		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
