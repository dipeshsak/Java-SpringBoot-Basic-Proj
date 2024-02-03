package com.springbootut1.springbootut1.service;

import com.springbootut1.springbootut1.entity.Department;
import com.springbootut1.springbootut1.error.DepartmentNotFoundExeception;

import java.util.List;


public interface DepartmentService {
  public Department saveDepartment(Department department);

  public List<Department> fetchDepartmentList();

  public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundExeception;

  public void deleteDepartmentById(Long departmentId);

  public Department updateDepartment(Long departmentId, Department department);

  public Department fetchDepartmentByName(String departmentName);
}
