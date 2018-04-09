package com.spring.dao;

import java.util.List;

import com.spring.domain.StudentDomain;

public interface StudentDao {

	public boolean persistStudent(StudentDomain studentDomain);
	
	public void removeStudentById(int id);
	
	public List<StudentDomain> listAll();
}
