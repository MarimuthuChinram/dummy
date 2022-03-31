package com.tcs.dao;

import java.util.List;
import java.util.Map;

import com.tcs.model.CourseRegistration;
import com.tcs.model.Payment;
import com.tcs.model.Student;

public interface StudentDAO {

	public void addStudent(Student student);

	public void courseRegistartion(CourseRegistration courseRegistartion);

	public void deleteStudentCourse(Integer id);

	public List<Map<String, Object>> getGrade(Integer id);

	public void makePayment(Payment payment);
	
}
