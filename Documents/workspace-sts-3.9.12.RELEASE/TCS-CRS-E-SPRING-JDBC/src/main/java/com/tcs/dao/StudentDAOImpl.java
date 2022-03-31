package com.tcs.dao;


import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.model.CourseRegistration;
import com.tcs.model.Payment;
import com.tcs.model.Student;

public class StudentDAOImpl {

	Logger logger = LoggerFactory.getLogger(StudentDAOImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplateObject;

	public void addStudent(Student student) {
		// TODO Auto-generated method stub

		String SQL = "insert into student (name,email,phoneNumber,dob,isStudApproved,timestamp) values (? , ?, ? , ? ,0,NOW())";
		jdbcTemplateObject.update(SQL, student.getName(), student.getEmail(), student.getPhoneNumber(),
				student.getDob());
		System.out.println("name= " + student.getName() + "email =" + student.getEmail() + "phone number ="
				+ student.getPhoneNumber() + "dob =" + student.getDob());

		return;
	}

	public void courseRegistartion(CourseRegistration courseRegistartion) {

		String SQL = "insert into courseregisration (studentId, courseId, professorId,timestamp) values (?, ? , ?, NOW())";
		jdbcTemplateObject.update(SQL, courseRegistartion.getStudentId(), courseRegistartion.getCourseId(),
				courseRegistartion.getProfessorId());
		System.out.println("Created Record of Student = " + courseRegistartion.getStudentId() + "courseId = "
				+ courseRegistartion.getCourseId() + "professorId =" + courseRegistartion.getProfessorId());

		return;
	}

	public void deleteStudentCourses(Integer id) {
		// TODO Auto-generated method stub

		String SQL = "delete from courseregisration where courseId = ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id);
		return;
	}
	public List<Map<String, Object>> getGrade(Integer id){
		// TODO Auto-generated method stub
		String SQL = "SELECT  c.courseName,r.courseGrade FROM student s, courses c, result r WHERE r.studentId=s.id AND r.courseId = c.id and  s.id ="+id;
		List<Map<String,Object>> result = jdbcTemplateObject.queryForList(SQL);
		logger.debug("in debug");
		return result;
	}
	public void makePayment(Payment payment) {
		// TODO Auto-generated method stub

				String SQL = "insert into payment (studentId,feeAmount,modePayment,timestamp) values (?,?,?,NOW())";
				jdbcTemplateObject.update(SQL, payment.getStudentId(), payment.getFeeAmount(), payment.getModePayment());
				System.out.println("StudentId= " +  payment.getStudentId()+ "Fee Amount =" +  payment.getFeeAmount() + "Mode Of payment ="
						+ payment.getModePayment() );

				return;
	}
}
