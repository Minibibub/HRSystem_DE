package com.aug.daos.may;

import java.util.List;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.may.Department;
import com.aug.entities.may.May;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDaolmpl extends BaseHibernateDaoImpl<Department> implements DepartmentDao{

	protected DepartmentDaolmpl() {
		super(Department.class);
	}
   
	@Override
    public boolean deleteByIdDepartment(int idDepartmemt) {
		Department department = getById(idDepartmemt);
		if(department == null){
    		return false;
    	}
    	getCurrentSession().delete(department);
        return true;
    }
	
	@Override
    public List<Department> searchDepartment(String name) {	
    	return getCurrentSession().createCriteria(Department.class).add(Restrictions.eq("name", name)).list();
    }
}
