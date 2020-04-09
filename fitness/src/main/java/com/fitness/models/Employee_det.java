package com.fitness.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_det")
public class Employee_det {
	
	@Id
	@Column(name = "Emp_id")
	private int empId;
	
	@Column(name = "emp_name")
	private String empName;
	
	@Column(name = "Gender")
	private String gender;
	
	@Column(name = "City")
	private String city;
	
	@Column(name = "Mpin")
	private String mpin;
	
	@Column(name = "Social_Mode")
	private String socialMode;
	
	@Column(name = "Mobile_num")
	private String mobileNum;
	
	@Column(name = "Age")	
	private int age;
	
	@Column(name = "Height")
	private int height;
	
	@Column(name = "Weight")
	private int weight;
	
	@Column(name = "Medical_history")
	private String medicalHistory;
	
	@Column(name = "Occupation")
	private String occupation;
	
	@Column(name = "Activity_level")
	private String activityLevel;
	
	@Column(name = "rewards")
	private int rewards;
	
	@Column(name = "User_Name ")
	private String userName;
	
	@Column(name = "Password")
	private String password;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMpin() {
		return mpin;
	}

	public void setMpin(String mpin) {
		this.mpin = mpin;
	}

	public String getSocialMode() {
		return socialMode;
	}

	public void setSocialMode(String socialMode) {
		this.socialMode = socialMode;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getMedicalHistory() {
		return medicalHistory;
	}

	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getActivityLevel() {
		return activityLevel;
	}

	public void setActivityLevel(String activityLevel) {
		this.activityLevel = activityLevel;
	}

	public int getRewards() {
		return rewards;
	}

	public void setRewards(int rewards) {
		this.rewards = rewards;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
		
}
