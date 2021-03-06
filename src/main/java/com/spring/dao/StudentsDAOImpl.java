package com.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.domain.Student;

import util.CsvReaderUtil;

@Repository
public class StudentsDAOImpl implements StudentsDAO {

	
	private List<Student> studentList;
	
	public StudentsDAOImpl() {
		studentList = CsvReaderUtil.loadFromCsvFile();
		System.out.println("inside dao cons: " + studentList);
	}
	
	
	@Override
	public List<Student> getStudents() {
		System.out.println("inside dao: " + studentList);
		return studentList;
	}

}
