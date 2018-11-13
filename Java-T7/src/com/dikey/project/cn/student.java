package com.dikey.project.cn;

public class student {
	private int id;
	private int age;
	private String nameString, telString, sexString;

	public void stuInfo() {
		// System.out.println("编号"+"/t"+"姓名"+"/t"+"性别"+"/t"+"年龄"+"/t"+"电话号码");
		System.out.println(id + "/t" + nameString + "/t" + sexString + "/t"
				+ age + "/t" + telString);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getTelString() {
		return telString;
	}

	public void setTelString(String telString) {
		this.telString = telString;
	}

	public String getSexString() {
		return sexString;
	}

	public void setSexString(String sexString) {
		this.sexString = sexString;
	}

}
