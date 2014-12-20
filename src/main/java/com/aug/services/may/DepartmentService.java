package com.aug.services.may;

import java.util.List;

import com.aug.daos.may.DepartmentDao;
import com.aug.entities.may.Department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;

	public void saveDepartment(Department department) {
		departmentDao.save(department);
	}

	public List<Department> findAllDepartment() {
		return departmentDao.findAll();
	}

	public Department findByIdDepartment(Integer id) {
		return departmentDao.getById(id);
	}

	public boolean deleteByIdDepartment(Integer idDepartmemt) {
		return departmentDao.deleteByIdDepartment(idDepartmemt);
	}

	public List<Department> searchDepartment(String name) {
		return departmentDao.searchDepartment(name);
	}

	public void updateDepartment(Department department) {
		departmentDao.update(department);
	}

}
