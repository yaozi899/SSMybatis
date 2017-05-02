package com.junit.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gongsi.mybatis.entities.Department;
import com.gongsi.mybatis.service.DepartmentService;

public class CRUDTest {
	ApplicationContext ioc = new ClassPathXmlApplicationContext("spring.xml");
	private DepartmentService ds = ioc.getBean(DepartmentService.class);
	
	@Test
	public void all(){
		List<Department> selectAll = ds.selectAll();
		for (Department department : selectAll) {
			System.out.println(department);
		}
	}
}
