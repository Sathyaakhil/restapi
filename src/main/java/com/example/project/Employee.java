package com.example.project;

public class Employee {
	private String id;
	private String name;
	private String depname;
	public Employee(String id, String name, String depname) {
		super();
		this.id = id;
		this.name = name;
		this.depname = depname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepname() {
		return depname;
	}
	public void setDepname(String depname) {
		this.depname = depname;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", depname=" + depname + "]";
	}
	


	
	
	

}
