package com.learn.springJdbc.dao;

import com.learn.springJdbc.entities.Student;

public interface StudentDAO {

	public int insert(Student student);

	public int updateName(String string);
}
