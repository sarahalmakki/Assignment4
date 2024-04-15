package com.codercampus;

import java.util.Arrays;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileService fileService = new FileService();
		Student[] students = fileService.readFile();
		Arrays.sort(students);
		FileWriterService fileWriterService = new FileWriterService();
		fileWriterService.writeFile(students, "COMPSCI");
		fileWriterService.writeFile(students, "STAT");
		fileWriterService.writeFile(students, "APMTH");
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
