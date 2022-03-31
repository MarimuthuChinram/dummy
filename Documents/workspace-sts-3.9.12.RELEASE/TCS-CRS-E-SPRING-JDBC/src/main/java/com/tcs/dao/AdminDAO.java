package com.tcs.dao;


import java.util.List;

import com.tcs.model.Courses;
import com.tcs.model.Professor;
import com.tcs.model.Student;

public interface AdminDAO {
	/**
	 * This is the method to be used to initialize database resources ie.
	 * connection.
	 */

	// public void createReport(String name, Integer age);

	// public Student approvedStud(Integer id);
	public int updateApproval(Integer id);

	public void createProfessor(Professor professor);

	public void createCourse(Courses course);

	public void deleteCourses(Integer id);

}
