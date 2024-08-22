package com.javaex.vo;

public class PersonVo {
	

	
	//필드
	private int personId;
	private String name;
	private String password;
	private String content;
	private String regDate;
	
	
	//생성자
	public PersonVo() {
		super();
	}
	
	public PersonVo (int personId) {
		this.personId = personId;
	}
	
	public PersonVo(int personId, String password) {
		this.personId = personId;
		this.password = password;
		
	}
	
	public PersonVo(String name, String password, String content) {
		this.name = name;
		this.password = password;
		this.content = content;
	}
	
	public PersonVo(int personId, String name, String password, String content, String regDate) {
		super();
		this.personId = personId;
		this.name = name;
		this.password = password;
		this.content = content;
		this.regDate = regDate;
	}
	//메서드 gs

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	
	//메서드 일반
	@Override
	public String toString() {
		return "Phonebook3Vo [personId=" + personId + ", name=" + name + ", password=" + password + ", content="
				+ content + ", regDate=" + regDate + "]";
	}

}
