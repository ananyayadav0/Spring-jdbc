package com.learn.springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.learn.springJdbc.dao.StudentDAO;
import com.learn.springJdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	StudentDAO studentDAO= context.getBean("studentDAO",StudentDAO.class);
    	
    	Student student=new Student();
    	student.setId(666); 
    	student.setName("Orry");
    	student.setCity("mumbai");
    	
    	//System.out.println(studentDAO.insert(student));
    	System.out.println(studentDAO.updateName("999"));
    	
    	
    }
}
