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

import com.tcs.dao.ProfessorDAOImpl;
import com.tcs.model.Result;

/**
 * @author springuser12
 *
 */
public class ProfessorController {
	@Autowired
	private ProfessorDAOImpl professorDAO;

	/**
	 * Post Grade of student
	 * 
	 * @param Grade
	 */

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/post/student/grade")
	@ResponseBody
	public ResponseEntity addGrade(@RequestBody Result result) {

		professorDAO.addGrade(result);

		return new ResponseEntity("Grade Added Successfully", HttpStatus.OK);

	}
	
	/**
	 * Get Student List
	 * 
	 * 
	 * @throws No User found for ID
	 */

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/get/professor/student")
	@ResponseBody
	public ResponseEntity listStudent() {

		List<Map<String, Object>> stud = professorDAO.listStudent();
			return new ResponseEntity(stud ,  HttpStatus.OK);

	}


}
