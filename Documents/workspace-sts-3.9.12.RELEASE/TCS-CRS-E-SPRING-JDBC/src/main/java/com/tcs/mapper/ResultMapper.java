package com.tcs.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.tcs.model.Result;

public class ResultMapper {

	public Result mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		Result result = new Result();
		result.setStudentId(rs.getInt("studentId"));
		result.setCourseId(rs.getInt("courseId"));
		result.setProfessorId(rs.getInt("professorId"));
		result.setCourseGrade(rs.getString("courseGrade"));
		result.setTimestamp(rs.getString("timestamp"));

        return result;
	}


}
