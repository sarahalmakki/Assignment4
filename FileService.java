package com.codercampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class FileService {
	List<Students> students = new ArrayList<>();
//	BufferedReader fileReader = null;
//	Students[] students = new Students[101];
//	int i = 0;
String MasterFilePath = "student-master-list(2).csv";
try (BufferedReader reader = new BufferedReader(new FileReader("MasterFilePath") )){
	String line ;
	while((line = reader.readLine()) != null ) {
		String[] data = line.split("");
		Students student = new Students(Integer.parseInt(data[0]),data[1],data[2],Integer.parseInt(data[3]));
	students.add(student);
	}
}
	catch(IOException e) {
		e.printStackTrace();
		System.out.println("Closing fileReader");
        return;
	}
	}

	


// Sort students within each course group by grade in descending order
	
}
