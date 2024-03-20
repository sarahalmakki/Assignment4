package com.codercampus;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class StudentEnrollement {
public static void main(String[] args) {
		// TODO Auto-generated method stub

String header = null;
		FileService fileService = new FileService();
		List<Students> students =fileService.readFile();
		students.forEach(item -> {
			System.out.println(item);
		});
		Collections.sort(students);
	}
}