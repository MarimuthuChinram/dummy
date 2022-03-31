package com.tcs.controller;

import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.dao.StudentDAOImpl;
import com.tcs.model.CourseRegistration;
import com.tcs.model.Payment;
import com.tcs.model.Student;

public class StudentController {

	@Autowired

	private StudentDAOImpl studentDAO;

	/**
	 * Post student data
	 * 
	 * @param student object
	 */

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/post/student")
	@ResponseBody
	public ResponseEntity addStudent(@RequestBody Student student) {

		studentDAO.addStudent(student);

		return new ResponseEntity("Student Registration  Successfully", HttpStatus.OK);

	}

	/**
	 * Post student course registration data
	 * 
	 * @param student object
	 */

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/post/student/course/registration")
	@ResponseBody
	public ResponseEntity addStudent(@RequestBody CourseRegistration courseRegistration) {

		studentDAO.courseRegistartion(courseRegistration);

		return new ResponseEntity("Course Registered  Successfully", HttpStatus.OK);

	}

	/**
	 * Delete course Data
	 * 
	 * @param id
	 * @throws No course found for ID
	 */

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.DELETE, value = "/delete/student/course/{id}")
	@ResponseBody
	public ResponseEntity deleteStudentCourses(@PathVariable int id) {
		studentDAO.deleteStudentCourses(id);
		return new ResponseEntity("Deleted Successfully" + " : " + id, HttpStatus.OK);

	}

	/**
	 * Get Student Grade
	 * 
	 * @param student id
	 * @throws No User found for ID
	 */

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/get/student/grade/{id}")
	@ResponseBody
	public ResponseEntity getResult(@PathVariable int id) {

		List<Map<String, Object>> grade = studentDAO.getGrade(id);
		return new ResponseEntity(grade, HttpStatus.OK);

	}

	/**
	 * Post student payment data
	 * 
	 * @param payment object
	 */

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/post/student/payment")
	@ResponseBody
	public ResponseEntity addStudent(@RequestBody Payment payment) {

		studentDAO.makePayment(payment);

		return new ResponseEntity("Payment made  Successfully", HttpStatus.OK);

	}
	
}
