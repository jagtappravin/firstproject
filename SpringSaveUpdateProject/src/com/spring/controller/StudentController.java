package com.spring.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.spring.domain.StudentDomain;
import com.spring.model.Student;
import com.spring.service.StudentService;
import com.spring.utility.StudentUtility;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	
	
	@RequestMapping(value= {"/add" }, method=RequestMethod.POST)
	public ModelAndView openSavePost(@ModelAttribute ("studentForm") Student student ,
			BindingResult result ) {
	
		boolean flag=false;
		StudentDomain studentDomain=StudentUtility.modelToDomainUtility(student);
		System.out.println(studentDomain.toString());
		flag=studentService.addStudent(studentDomain);
		if(flag) {
			return new ModelAndView("index");
		}
		return new ModelAndView("error");

	}
	
	@RequestMapping(value= {"/openList"}, method=RequestMethod.GET)
	public ModelAndView OpenListGet() {
		
		//ModelAndView modelAndView=new ModelAndView();
		Map<String,Object> model=new HashMap<String,Object>();
		model.put("fetchedStudent",StudentUtility.domainToModelUtility(studentService.listAllStudent()));
		/*modelAndView.addObject(model);
		modelAndView.setViewName("openList");
		*/
		return new ModelAndView("openList",model);
		//return modelAndView;
		
	}
	
	@RequestMapping(value = {"/openSave"}, method = RequestMethod.GET)
	public ModelAndView addEmployee(@ModelAttribute("command") Student student,
			BindingResult result) {
		//Map<String, Object> model = new HashMap<String, Object>();
		//model.put("employees",  prepareListofBean(employeeService.listEmployeess()));
		return new ModelAndView("addStudent");
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("index");
	}
}
