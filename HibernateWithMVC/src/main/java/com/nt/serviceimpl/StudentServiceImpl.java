package com.nt.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.StudentDAO;
import com.nt.model.StudentBO;
import com.nt.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDAO dao;

	
	public void saveStudent(StudentBO bo) {
		
		dao.saveStudent(bo);
	}

}
