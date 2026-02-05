package com.my.spring.model;

public class Employee {

	private int id;
	
	private String name ,gender;
	
	private Address address;

	public Employee() {
		super();
		System.out.println("Employee.Employee()");
		// TODO Auto-generated constructor stub
	}


	public Employee(int id, String name, String gender, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
	}



	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Employee.setId()");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Employee.setName()");
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		System.out.println("Employee.setGender()");
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}

	
	
	
}
