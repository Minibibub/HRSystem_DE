package com.aug.daos.may;

import java.util.List;

import com.aug.daos.BaseHibernateDao;
import com.aug.entities.may.Department;;

public interface DepartmentDao extends BaseHibernateDao<Department> {

	public boolean deleteByIdDepartment(int idDepartmemt);

	public List<Department> searchDepartment(String name);

}
