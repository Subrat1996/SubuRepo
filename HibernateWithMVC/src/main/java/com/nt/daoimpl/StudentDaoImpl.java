package com.nt.daoimpl;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.nt.dao.StudentDAO;
import com.nt.model.StudentBO;
import com.nt.util.HibernateUtil;

@Repository
public class StudentDaoImpl implements StudentDAO {


	public void saveStudent(StudentBO bo) {
		
		try {
			Session ss=HibernateUtil.getFactory().openSession();
			Transaction tx=ss.beginTransaction();
			Serializable sz=ss.save(bo);
			System.out.println("student with saved successfully with id :"+sz);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
