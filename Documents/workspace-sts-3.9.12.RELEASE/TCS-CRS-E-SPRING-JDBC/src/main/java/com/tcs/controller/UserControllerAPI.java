package com.tcs.controller;
import java.util.List;

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

import com.tcs.dao.UserDAOImpl;
import com.tcs.model.User;


public class UserControllerAPI {
	@Autowired
	private UserDAOImpl userDAO;

	/**
	 * Post User data
	 * 
	 * @param User object
	 */

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/post/user")
	@ResponseBody
	public ResponseEntity createProfessor(@RequestBody User user) {

		userDAO.createUser(user);

		return new ResponseEntity("User Added  Successfully", HttpStatus.OK);

	}
	
	/**
	 * Delete course Data
	 * 
	 * @param id
	 * @throws No student found for ID
	 */

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.DELETE, value = "/delete/user/{id}")
	@ResponseBody
	public ResponseEntity deleteUser(@PathVariable int id) {
		userDAO.deleteUser(id);
		return new ResponseEntity("Deleted Successfully" + " : " + id, HttpStatus.OK);

	}
	
	/**
	 * Get User 
	 * 
	 * @param id
	 * @throws No User found for ID
	 */

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/get/user/{id}")
	@ResponseBody
	public ResponseEntity getReport(@PathVariable int id) {

		List<User> user = userDAO.getUser(id);
			return new ResponseEntity(user,  HttpStatus.OK);

	}

}
