package com.tcs.dao;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tcs.model.Courses;
import com.tcs.model.Professor;
import com.tcs.model.Student;

public class AdminDAOImpl implements AdminDAO {

	Logger logger = LoggerFactory.getLogger(AdminDAOImpl.class);
	@Autowired
	private JdbcTemplate jdbcTemplateObject;

	@Override
	public int updateApproval(Integer id) {
		// TODO Auto-generated method stub
		String SQL = "update student set isStudApproved =1 where id = ?";
		// jdbcTemplateObject.updateApproval(SQL, id);
		int result = jdbcTemplateObject.update(SQL, id);
		System.out.println("Aprroved Student By ID  = " + id);
		return result;
	}

	@Override
	public void createProfessor(Professor professor) {

		String SQL = "insert into professor (name, email, phoneNumber, timestamp) values (?, ? , ?, NOW())";
		jdbcTemplateObject.update(SQL,professor.getName(), professor.getEmail(), professor.getPhoneNumber());
		System.out.println("Created Record Name = " + professor.getName() + " email = " + professor.getEmail() + "phoneNumber ="
				+ professor.getPhoneNumber());

		return ;
	}

	@Override
	public void createCourse(Courses course) {
		String SQL = "insert into courses (courseName, timestamp) values ( ?, NOW())";
		jdbcTemplateObject.update(SQL,course.getCourseName());
		System.out.println("Created Record Name = " + course.getCourseName());
		return ;
		
	}
	
	@Override	
	public void deleteCourses(Integer id) {
		// TODO Auto-generated method stub

		String SQL = "delete from courses where id = ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id);
		return;
	}
	
	public List<Map<String, Object>> getResult(Integer id){
		// TODO Auto-generated method stub
		String SQL = "select s.id,s.name,s.email,s.dob,c.courseName,r.courseGrade FROM student s, courses c, result r WHERE r.studentId=s.id AND r.courseId = c.id and  s.id ="+id;
		List<Map<String,Object>> result = jdbcTemplateObject.queryForList(SQL);
		logger.debug("in debug");
		return result;
	}
}
