package com.gongsi.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gongsi.mybatis.entities.Department;
import com.gongsi.mybatis.mappers.DepartmentMapper;
import com.gongsi.mybatis.service.DepartmentService;
@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentMapper dm;
	@Override
	public int deleteByPrimaryKey(Integer depaId) {
		// TODO Auto-generated method stub
		return dm.deleteByPrimaryKey(depaId);
	}

	@Override
	public int insert(Department record) {
		// TODO Auto-generated method stub
		return dm.insert(record);
	}

	@Override
	public Department selectByPrimaryKey(Integer depaId) {
		// TODO Auto-generated method stub
		return dm.selectByPrimaryKey(depaId);
	}

	@Override
	public List<Department> selectAll() {
		return dm.selectAll();
	}

	@Override
	public int updateByPrimaryKey(Department record) {
		// TODO Auto-generated method stub
		return dm.updateByPrimaryKey(record);
	}

}
