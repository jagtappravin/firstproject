package com.spring.utility;

import java.util.ArrayList;
import java.util.List;

import com.spring.domain.StudentDomain;
import com.spring.model.Student;

public class StudentUtility 
{

	public static StudentDomain modelToDomainUtility(Student student) {
		
		StudentDomain studentDomain=new StudentDomain();
		studentDomain.setId(student.getId());
		studentDomain.setFname(student.getFname());
		studentDomain.setLname(student.getLname());
		studentDomain.setContactno(student.getContactno());
		
		return studentDomain;
	}
	
	public static Student domainToModelUtility(StudentDomain studentDomain)
	{
		Student student=new Student();
		student.setId(studentDomain.getId());
		student.setFname(studentDomain.getFname());
		student.setLname(studentDomain.getFname());
		student.setContactno(studentDomain.getFname());
		
		
		return student;
	}
	
	public static List<Student> domainToModelUtility(List<StudentDomain> studentDomain)
	{
		List<Student> studentList=null;
		
		if(studentDomain !=null && !studentDomain.isEmpty()) {
			
			studentList=new ArrayList<>();
			Student studentModel=null;
			for(StudentDomain studentDomain2:studentDomain) 
			{
				studentModel=new Student();
				studentModel.setFname(studentDomain2.getFname());
				studentModel.setId(studentDomain2.getId());
				studentModel.setLname(studentDomain2.getLname());
				studentModel.setContactno(studentDomain2.getContactno());
				studentList.add(studentModel);
			}
			
			
		}
		
		System.out.println(studentList);
		return studentList;
	}
}
