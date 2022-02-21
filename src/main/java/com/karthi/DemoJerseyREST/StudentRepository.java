package com.karthi.DemoJerseyREST;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
	
	List<Student> std;
	
	public StudentRepository()
	{
		std = new ArrayList<>();
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Karthik");
		s1.setAge(24);
		std.add(s1);
		
		Student s2 = new Student();
		s2.setId(2);
		s2.setName("Karthikeyan");
		s2.setAge(25);
		std.add(s2);
	}
	
	public List<Student> getStudent()
	{
		return std;
	}
	
	public Student getStudent(int id)
	{
		for (Student s: std)
		{
			if (s.getId() == id)
				return s;
		}
		return new Student();
	}

	public void createStudent(Student s) {		
		std.add(s);
	}

}
