package com.tcs.dao;

import java.util.List;
import java.util.Map;

import com.tcs.model.CourseRegistration;
import com.tcs.model.Professor;
import com.tcs.model.Result;

public interface ProfessorDAO {

	public void addGrade(Result result);
	public List<Map<String, Object>>listStudent();
}
