package com.rin.TestingSystem.services;

import com.rin.TestingSystem.entity.Department;

import java.util.List;

public interface IDepartmentService {
    List<Department> getAllDepartments();
    Department addDepartment(Department department);
    Department updateDepartment(Department department);
    void deleteDepartmentById(int departmentId);
    Department getDepartmentById(int departmentId);
}
