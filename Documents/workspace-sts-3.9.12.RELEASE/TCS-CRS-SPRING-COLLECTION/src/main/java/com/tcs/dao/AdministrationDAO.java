/**
 * 
 */
package com.tcs.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.tcs.dao.AdminstrationDAO;
import com.tcs.model.Courses;
import com.tcs.model.Professor;
import com.tcs.model.Student;

/**
 * @author springuser01
 *
 */
@RestController
public class AdministrationDAO {
	private static List<Student> students;
	{
		/**
		 * Student Dummy Data
		 * 
		 */

		students = new ArrayList();
		students.add(
				new Student(101, "John", "Doe", "djohn@gmail.com", "121-232-3435", 90, 89, 78, 12, false, 0, null));
		students.add(
				new Student(102, "Russ", "Smith", "sruss@gmail.com", "343-545-2345", 23, 43, 23, 20, false, 0, null));
		students.add(new Student(103, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987", 56, 69, 58, 78, false,
				0, null));
	}

	public List list() {
		return students;
	}

	/**
	 * Professor Dummy Data
	 * 
	 */

	private static List<Professor> professors;
	{
		professors = new ArrayList();
		professors.add(new Professor(101, "John", "Doe", "djohn@gmail.com", "CS", "121-232-3435"));
		professors.add(new Professor(102, "Russ", "Smith", "sruss@gmail.com", "ELctronics", "343-545-2345"));
		professors.add(new Professor(103, "Kate", "Williams", "kwilliams@gmail.com", "Physics", "876-237-2987"));
	}

	public List list1() { 
		return professors;
	}

	/**
	 * Courses Dummy Data
	 * 
	 */
	private static List<Courses> courses;
	{
		courses = new ArrayList();
		courses.add(new Courses(101, "C1", "01C1"));

	}

	public List list2() {
		return courses;
	}

	/**
	 * Create Report CArd
	 * 
	 * @param id
	 * 
	 */

	public Student createReport(Long id) {
		for (Student s : students) {
			if (s.getId().equals(id)) {
				s.setId(s.getId());
				float avg = ((s.getC1() + s.getC2() + s.getC3() + s.getC4()) / 400) * 100;
				s.setStudentPercent(avg);
				if (s.getStudentPercent() >= 50) {
					s.setStudResult("PASS");
				} else {
					s.setStudResult("FAIL");
				}
				students.remove(s);
				students.add(s);
				return s;
			}
		}
		return null;
	}

	/**
	 * Approved Student Registration
	 * 
	 * @param id
	 * 
	 */
	// Approve student Registration
	public Student update(Long id, Student student) {

		for (Student c : students) {
			if (c.getId().equals(id)) {
				student.setId(c.getId());
				students.remove(c);
				students.add(student);
				return student;
			}
		}

		return null;
	}

	/**
	 * Add Professor
	 * 
	 * @param Professor Object
	 * 
	 */

	public Professor addProfessor(Professor professor) {
		professor.setId(System.currentTimeMillis());
		professors.add(professor);
		return professor;
	}

	/**
	 * Add Courses
	 * 
	 * @param Courses Object
	 * 
	 */
	public Courses addCourses(Courses course) {
		course.setId(System.currentTimeMillis());
		courses.add(course);
		return course;
	}

	/**
	 * Delete Course
	 * 
	 * @param id
	 * 
	 */

	public Long deleteCourse(Long id) {

		for (Courses c : courses) {
			if (c.getId().equals(id)) {
				courses.remove(c);
				return id;

			}
		}
		return null;
	}

}