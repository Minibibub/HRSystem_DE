package com.aug.entities.may;

import com.aug.entities.BaseEntity;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "DEPARTMENT")
public class Department extends BaseEntity implements Serializable {
	
//	@OneToMany(mappedBy = "department",cascade = CascadeType.REMOVE)
//	private List<May> mayList;
//
//	public List<May> getMayList() {
//		return mayList;
//	}
//
//	public void setMayList(List<May> mayList) {
//		this.mayList = mayList;
//	}

}
