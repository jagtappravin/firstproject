package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.StudentDao;
import com.spring.domain.StudentDomain;

@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao studentDao;
	
	@Override
	public boolean addStudent(StudentDomain studentDomain) {
		boolean flag=false;	
		flag=studentDao.persistStudent(studentDomain);
		return flag;
	}

	@Override
	public List<StudentDomain> listAllStudent() {
		
		return studentDao.listAll();
	}

	@Override
	public StudentDomain getStudentbyId(int id) {
		
		return null;
	}

	@Override
	public void deleteStudentById(int id) {
		
		
	}

	
}
