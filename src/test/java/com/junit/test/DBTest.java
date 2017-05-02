package com.junit.test;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class DBTest {
	ApplicationContext ioc = new ClassPathXmlApplicationContext("spring.xml");
	@Test
	public void db() throws SQLException{
		DataSource source = ioc.getBean(DataSource.class);
		Connection connection = source.getConnection();
		System.out.println(connection);
		
	}
}
