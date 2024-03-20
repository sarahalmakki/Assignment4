package com.codercampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FileService {
//	BufferedReader fileReader = null;
	List<Students> students = new ArrayList<>();
	String MasterFilePath = "student-master-list.csv";
int i = 0;
  
	public  List<Students> readFile() {
		try (BufferedReader reader = new BufferedReader(new FileReader(MasterFilePath))){
			String line ;
			reader.readLine();
			while((line = reader.readLine()) != null ) {
				String[] data = line.split(",");
				if (data.length == 4) {
		 int studentID = Integer.parseInt(data[0]);
		String studentName = data[1];
		 String course = data[2];
		 int grade = Integer.parseInt(data[3]);
		 
			
				}
			}
		}
			catch(IOException e) {
				e.printStackTrace();
				System.out.println("Closing fileReader");
		        
			}
		return students;
		
			}
	
	}


	


// Sort students within each course group by grade in descending order
	

