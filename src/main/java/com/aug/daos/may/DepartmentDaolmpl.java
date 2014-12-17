package com.aug.daos.may;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.may.Department;

import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDaolmpl extends BaseHibernateDaoImpl<Department> implements DepartmentDao{

	protected DepartmentDaolmpl() {
		super(Department.class);
	}
   
}
