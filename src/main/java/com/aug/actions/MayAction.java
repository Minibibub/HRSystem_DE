package com.aug.actions;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.beans.factory.annotation.Autowired;

import com.aug.entities.may.Department;
import com.aug.entities.may.May;
import com.aug.services.may.DepartmentService;
import com.aug.services.may.MayService;
import com.opensymphony.xwork2.ActionSupport;

@ResultPath(value = "/")
public class MayAction extends ActionSupport implements BaseAction {

	@Autowired
	private MayService mayservice;
	private May may;
	private List<May> mays;
	private Integer id;
	private String searchName;

	@Autowired
	private DepartmentService departmentservice;
	private Department department;
	private List<Department> departments;
	private Integer idDepartmemt;
	private String nameDepartment;

	public MayService getMayservice() {
		return mayservice;
	}

	public void setMayservice(MayService mayservice) {
		this.mayservice = mayservice;
	}

	public May getMay() {
		return may;
	}

	public void setMay(May may) {
		this.may = may;
	}

	public List<May> getMays() {
		return mays;
	}

	public void setMays(List<May> mays) {
		this.mays = mays;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSearchName() {
		return searchName;
	}

	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}

	public DepartmentService getDepartmentservice() {
		return departmentservice;
	}

	public void setDepartmentservice(DepartmentService departmentservice) {
		this.departmentservice = departmentservice;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public Integer getIdDepartmemt() {
		return idDepartmemt;
	}

	public void setIdDepartmemt(Integer idDepartmemt) {
		this.idDepartmemt = idDepartmemt;
	}

	public String getNameDepartment() {
		return nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}

	@Override
	@Action(value = "InitAddMay", results = { @Result(name = "input", location = "pages/may/addMay.jsp") })
	public String initCreate() {
		return INPUT;
	}

	@Override
	@Action(value = "InitListAllMay", results = { @Result(name = "input", location = "pages/may/listallMay.jsp") })
	public String initList() {
		return INPUT;
	}

	@Override
	@Action(value = "InitUpdateMay", results = { @Result(name = "input", location = "pages/may/updateMay.jsp") })
	public String initUpdate() {
		may = mayservice.findById(id);
		return INPUT;
	}

	@Override
	public String initDelete() {
		return null;
	}

	@Action(value = "InitAddDepartment", results = { @Result(name = "input", location = "pages/may/addDepartment.jsp") })
	public String initCreateDepartment() {
		return INPUT;
	}
	
	@Action(value = "InitUpdateDepartment", results = { @Result(name = "input", location = "pages/may/updateDepartment.jsp") })
	public String initUpdateDepartment() {
		department = departmentservice.findByIdDepartment(idDepartmemt);
		return INPUT;
	}

	@Override
	@Action(value = "AddMay", results = { @Result(name = "success", location = "ListAllMay", type = "redirect") })
	public String create() {
		mayservice.save(may);
		return SUCCESS;
	}

	@Override
	@Action(value = "ListAllMay", results = { @Result(name = "success", location = "pages/may/listallMay.jsp") })
	public String list() {
		mays = mayservice.findAll();
		return SUCCESS;
	}

	@Override
	@Action(value = "UpdateMay", results = { @Result(name = "success", location = "ListAllMay", type = "redirect") })
	public String update() {
		mayservice.update(may);
		return SUCCESS;
	}

	@Override
	@Action(value = "DeleteMay", results = {
			@Result(name = "input", location = "ListAllMay", type = "redirect"),
			@Result(name = "success", location = "ListAllMay", type = "redirect") })
	public String delete() {
		if (mayservice.deleteById(id)) {
			return SUCCESS;
		}
		return INPUT;
	}

	@Action(value = "SearchMay", results = { @Result(name = "success", location = "pages/may/findnameMay.jsp") })
	public String search() {
		mays = mayservice.search(searchName);
		return SUCCESS;
	}

	
	
	@Action(value = "AddDepartment", results = { @Result(name = "success", location = "ListAllDepartment", type = "redirect") })
	public String createDepartment() {
		departmentservice.saveDepartment(department);
		return SUCCESS;
	}

	@Action(value = "ListAllDepartment", results = { @Result(name = "success", location = "pages/may/listallDepartment.jsp") })
	public String listDepartment() {
		departments = departmentservice.findAllDepartment();
		return SUCCESS;
	}
	
	@Action(value = "UpdateDepartment", results = { @Result(name = "success", location = "ListAllDepartment", type = "redirect") })
	public String updateDepartment() {
		departmentservice.updateDepartment(department);
		return SUCCESS;
	}

	@Action(value = "DeleteDepartment", results = {
			@Result(name = "input", location = "ListAllDepartment", type = "redirect"),
			@Result(name = "success", location = "ListAllDepartment", type = "redirect") })
	public String deleteDepartment() {
		if (departmentservice.deleteByIdDepartment(idDepartmemt)) {
			return SUCCESS;
		}
		return INPUT;
	}
	
	@Action(value = "SearchDepartment", results = { @Result(name = "success", location = "pages/may/findnameDepartment.jsp") })
	public String searchDepartment() {
		departments = departmentservice.searchDepartment(nameDepartment);
		return SUCCESS;
	}
}
