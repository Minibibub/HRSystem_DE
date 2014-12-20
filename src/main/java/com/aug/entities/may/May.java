package com.aug.entities.may;

import com.aug.entities.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "MAY")
public class May extends BaseEntity implements Serializable {
	
	@Column(name = "EMAIL", nullable = false, unique = true)
    private String email;
	
	@Column(name = "AGE")
    private String age;
	
	@Column(name = "MAY")
    private String may;
//	
//	@ManyToOne
//	@JoinColumn(name = "DEPARTMENT")
//	private Department department;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMay() {
		return may;
	}

	public void setMay(String may) {
		this.may = may;
	}

//	public Department getDepartment() {
//		return department;
//	}
//
//	public void setDepartment(Department department) {
//		this.department = department;
//	}
	
}
