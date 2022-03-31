/**
 * 
 */
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

import com.tcs.dao.AdminDAOImpl;
import com.tcs.model.Courses;
import com.tcs.model.Professor;
import com.tcs.model.Student;


/**
 * @author springuser12
 *
 */
public class AdminControllerAPI {

	private AdminDAOImpl adminDAO;

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.PUT, value = "/put/student/{id}")
	@ResponseBody
	public ResponseEntity updateStudentApproval(@PathVariable int id) {
		adminDAO.updateApproval(id);
		if (adminDAO.updateApproval(id) == 0) {
			return new ResponseEntity("No student found for ID " + id, HttpStatus.NOT_FOUND);

		} else {
			return new ResponseEntity("Student  Approved Successfully", HttpStatus.OK);
		}
	}

	/**
	 * Post Professor data
	 * 
	 * @param Proffesor object
	 */

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/post/professor")
	@ResponseBody
	public ResponseEntity createProfessor(@RequestBody Professor professor) {

		adminDAO.createProfessor(professor);

		return new ResponseEntity("Professor Added  Successfully", HttpStatus.OK);

	}

	/**
	 * Post Course data
	 * 
	 * @param Course Object
	 * @throws No student found for ID
	 */

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/post/courses")
	@ResponseBody
	public ResponseEntity createCourses(@RequestBody Courses courses) {

		adminDAO.createCourse(courses);

		return new ResponseEntity("Courses Added  Successfully", HttpStatus.OK);
	}

	/**
	 * Delete course Data
	 * 
	 * @param id
	 * @throws No student found for ID
	 */

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.DELETE, value = "/delete/course/{id}")
	@ResponseBody
	public ResponseEntity deleteCourses(@PathVariable int id) {
		adminDAO.deleteCourses(id);
		return new ResponseEntity("Deleted Successfully" + " : " + id, HttpStatus.OK);

	}
	
	/**
	 * Get Student Result
	 * 
	 * @param student Id
	 * @throws No User found for ID
	 */

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/get/admin/student/result/{id}")
	@ResponseBody
	public ResponseEntity getResult(@PathVariable int id) {

		List<Map<String, Object>> stud = adminDAO.getResult(id);
			return new ResponseEntity(stud ,  HttpStatus.OK);

	}
}
