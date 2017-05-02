package com.gongsi.mybatis.entities;

public class Department {
	
	private Integer depaId;
	private String depaName;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(Integer depaId, String depaName) {
		super();
		this.depaId = depaId;
		this.depaName = depaName;
	}
	public Integer getDepaId() {
		return depaId;
	}
	public void setDepaId(Integer depaId) {
		this.depaId = depaId;
	}
	public String getDepaName() {
		return depaName;
	}
	public void setDepaName(String depaName) {
		this.depaName = depaName;
	}
	@Override
	public String toString() {
		return "Department [depaId=" + depaId + ", depaName=" + depaName + "]";
	}
	
	
}
