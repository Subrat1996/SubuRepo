package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.model.StudentBO;
import com.nt.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService service;
	@RequestMapping("/save")
	public String saveStudent() {
		
		StudentBO bo=new StudentBO();
		
		bo.setStudentid(101);
		bo.setSname("raja");
		bo.setClg("nitcorona");
		bo.setAddress("hyb");
		service.saveStudent(bo);
		return "student object created";
	}

}
