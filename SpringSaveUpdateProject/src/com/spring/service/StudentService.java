package com.spring.service;

import java.util.List;

import com.spring.domain.StudentDomain;

public interface StudentService {

	public boolean addStudent(StudentDomain studentDomain);
	
	public List<StudentDomain> listAllStudent();
	
	public StudentDomain getStudentbyId(int id);
	
	public void deleteStudentById(int id);
	
}
