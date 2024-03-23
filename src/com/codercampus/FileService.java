package com.codercampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileService {
//	BufferedReader fileReader = null;
	String MasterFilePath = "student-master-list.csv";

	public Student[] readFile() {
		Student[] students = new Student[100];
		try (BufferedReader reader = new BufferedReader(new FileReader(MasterFilePath))) {
			String line;
			int i = 0;
			reader.readLine();
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(",");
				int studentID = Integer.parseInt(data[0]);
				String studentName = data[1];
				String course = data[2];
				int grade = Integer.parseInt(data[3]);
				students[i] = new Student(studentID, studentName, course, grade);
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Closing fileReader");

		}
		return students;

	}
}

	


// Sort students within each course group by grade in descending order
	

