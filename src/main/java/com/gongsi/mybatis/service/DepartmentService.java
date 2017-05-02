package com.gongsi.mybatis.service;

import java.util.List;

import com.gongsi.mybatis.entities.Department;

public interface DepartmentService {
	
	 int deleteByPrimaryKey(Integer depaId);

    int insert(Department record);

    Department selectByPrimaryKey(Integer depaId);

    List<Department> selectAll();

    int updateByPrimaryKey(Department record);
}
