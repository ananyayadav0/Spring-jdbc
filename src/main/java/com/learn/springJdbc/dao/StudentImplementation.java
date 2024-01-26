package com.learn.springJdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.learn.springJdbc.entities.Student;

public class StudentImplementation implements StudentDAO{

	private JdbcTemplate jdbctemplate;
	
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	@Override
	public int insert(Student student) {
		String query="insert into student(id,name,city) values(?,?,?)";
		int res=jdbctemplate.update(query,student.getId(),student.getName(),student.getCity());
		return res;
	}

	@Override
	public int updateName(String id) {
		String query="update student set name=? where id=?";
		int res=jdbctemplate.update(query,"Ana",id);
		return res;
	}

}
