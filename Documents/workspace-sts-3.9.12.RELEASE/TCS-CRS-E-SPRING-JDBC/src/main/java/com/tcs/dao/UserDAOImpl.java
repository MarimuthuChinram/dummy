package com.tcs.dao;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.mapper.UserMapper;
import com.tcs.model.Professor;
import com.tcs.model.User;

public class UserDAOImpl {

	Logger logger = LoggerFactory.getLogger(AdminDAOImpl.class);
	@Autowired
	private JdbcTemplate jdbcTemplateObject;
	public void createUser(User user) {
		String SQL = "insert into user (userId,password,roleId,timestamp) values (?, ? , ?, NOW())";
		jdbcTemplateObject.update(SQL,user.getUserId(),user.getPassword(),user.getRoleId());
		System.out.println("Created Record ID = " +user.getUserId() + " password = " + user.getPassword() + "roleId ="
				+ user.getRoleId());
		return ;
	}

	
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub

		String SQL = "delete from user where id = ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id);
		return;
	}

	public List getUser(Integer id) {
		// TODO Auto-generated method stub
				String SQL = "select * from user where id ="+id;
				List<User> user = jdbcTemplateObject.query(SQL, new UserMapper());
				logger.debug("value", jdbcTemplateObject.query(SQL, new UserMapper()));
				logger.debug("value of emp-->" + user.toString());
				return user;
	}	

	
}
