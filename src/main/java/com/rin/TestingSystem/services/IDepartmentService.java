package com.rin.TestingSystem.services;

import com.rin.TestingSystem.entity.Department;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IDepartmentService {
    Page<Department> getAllDepartments(Pageable pageable);
    Department addDepartment(Department department);
    Department updateDepartment(Department department);
    void deleteDepartmentById(int departmentId);
    Department getDepartmentById(int departmentId);

    void deleteDepartmentByName(String departmentName);
}
