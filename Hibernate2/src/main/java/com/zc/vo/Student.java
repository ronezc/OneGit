package com.zc.vo;

public class Student {

	private Long id;
	private String name;
	
	private Contact contact;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Student(Long id, String name, Contact contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	public Student(String name, Contact contact) {
		super();
		this.name = name;
		this.contact = contact;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}
	
}
