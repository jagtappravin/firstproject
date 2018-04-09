package com.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.StudentDomain;

@Service("studentDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean persistStudent(StudentDomain studentDomain) {
	
		//boolean flag=false;
		sessionFactory.getCurrentSession().saveOrUpdate(studentDomain);
		return true;
	}

	@Override
	public void removeStudentById(int id) {
	
		
	}

	@Override
	public List<StudentDomain> listAll() {
	
		return sessionFactory.getCurrentSession().createCriteria(StudentDomain.class).list();
	}

		
}
