package com.java.student.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.java.student.model.Student;

public interface StudentMapper {
	//public List<Student> login();
	/*****************************************
	 * Get Student that Login System
	 * @param userName
	 * @return Student Object Information
	 */
	public Student login(@Param("username") String username);
}
