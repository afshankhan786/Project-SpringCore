package com.my.spring.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private int id;

	private String name, gender;

	private Address address;

	private List<Integer> myList;

	private Set<Integer> setOfContacts;
	
	private Map<Integer,String> map;

	public Employee() {
		super();
		System.out.println("Employee.Employee()");
		// TODO Auto-generated constructor stub
	}


	public Employee(int id, String name, String gender, Address address, List<Integer> myList, Set<Integer> setOfContacts,
			Map<Integer, String> map) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.myList = myList;
		this.setOfContacts = setOfContacts;
		this.map = map;
	}




	public List<Integer> getMyList() {
		return myList;
	}


	public void setMyList(List<Integer> myList) {
		this.myList = myList;
	}



	public Set<Integer> getSetOfContacts() {
		return setOfContacts;
	}


	public void setSetOfContacts(Set<Integer> setOfContacts) {
		this.setOfContacts = setOfContacts;
	}


	public Map<Integer, String> getMap() {
		return map;
	}


	public void setMap(Map<Integer, String> map) {
		this.map = map;
		System.out.println("Employee.setMap()");
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
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + ", myList="
				+ myList + ", setOfContacts=" + setOfContacts + ", map=" + map + "]";
	}

	
	
	
}
