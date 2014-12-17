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
	private String search;

	@Autowired
	private DepartmentService departmentservice;
	private Department department;
	private List<Department> departments;

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

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
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

	@Override
	@Action(value = "InitAddDepartment", results = { @Result(name = "input", location = "pages/may/addDepartment.jsp") })
	public String initCreateDepartment() {
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

	@Override
	@Action(value = "SearchMay", results = { @Result(name = "success", location = "pages/may/findnameMay.jsp") })
	public String search() {
		mays = mayservice.search(search);
		return SUCCESS;
	}

	@Override
	@Action(value = "AddDepartment", results = { @Result(name = "success", location = "ListAllDepartment", type = "redirect") })
	public String createDepartment() {
		departmentservice.saveDepartment(department);
		return SUCCESS;
	}

	@Override
	@Action(value = "ListAllDepartment", results = { @Result(name = "success", location = "pages/may/listallDepartment.jsp") })
	public String listDepartment() {
		departments = departmentservice.findAllDepartment();
		return SUCCESS;
	}

}
