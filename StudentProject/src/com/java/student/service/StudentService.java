package com.java.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.student.enums.StudentSts;
import com.java.student.mapper.StudentMapper;
import com.java.student.model.Student;


@Service
public class StudentService implements UserDetailsService{

	@Autowired
	private StudentMapper studentMapper;
	
	/*public Student login(){
		Student student =new Student();
		try{
			student = studentMapper.login("000000001");
		}catch(Exception e){
			e.printStackTrace();
		}
		return student;
	}*/

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Student student = new Student();
		System.out.println(" ==================== "+username+" =====================");
		try{
			student = studentMapper.login(username);
			if (student == null){
				throw new UsernameNotFoundException("UserName Or Password not found.");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		return new org.springframework.security.core.userdetails.User(student.getStudentCode(), student.getPassword(), 
				student.getSts().equals(StudentSts.ACTIVE.getValue())? true : false, true, true, true, getGrantedAuthorities(student));
	}

	private List<GrantedAuthority> getGrantedAuthorities(Student student){
		try{
			List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();		
			String txt = student.getTxt().equals("0") ? "USER" : "ADMIN";
			authorities.add(new SimpleGrantedAuthority("ROLE_"+txt));
			return authorities;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
