package com.tcs.dao;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tcs.mapper.CourseRegistrationMapper;
import com.tcs.model.CourseRegistration;
import com.tcs.model.Result;

public class ProfessorDAOImpl {

	Logger logger = LoggerFactory.getLogger(AdminDAOImpl.class);
	@Autowired
	private JdbcTemplate jdbcTemplateObject; 
	
	public void addGrade(Result result) {
		String SQL = "insert into result (studentId, courseId, professorId,courseGrade,timestamp) values (?, ? , ?,?, NOW())";
		jdbcTemplateObject.update(SQL, result.getStudentId(), result.getCourseId(), result.getProfessorId(),
				result.getCourseGrade());
		System.out.println("Created Record of Student = " + result.getStudentId() + "courseId = " + result.getCourseId()
				+ "professorId =" + result.getProfessorId()+"courseGrade ="+ result.getCourseGrade());

		return;

	}
	
	public List<Map<String, Object>> listStudent(){
		// TODO Auto-generated method stub
		String SQL = "SELECT s.id ,s.name ,s.email  ,s.phoneNumber ,s.dob ,p.id , p.name  FROM student s,  professor p, courseregisration c  where  c.studentId=s.id and c. professorId= p.id;";
		List<Map<String,Object>> stud = jdbcTemplateObject.queryForList(SQL);
		logger.debug("in debug");
		return stud;
	}
	
}
