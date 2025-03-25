package com.rin.TestingSystem.services;

import com.rin.TestingSystem.entity.Department;
import com.rin.TestingSystem.repository.IDepartmentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Transactional(rollbackOn = Exception.class)
public class DepartmentService implements IDepartmentService {
    @Autowired // tự khởi tạo đối tượng, thay cho department = new IDepartmentRepo
    private IDepartmentRepository departmentRepository;

    @Override
    public Page<Department> getAllDepartments(Pageable pageable) {
        return departmentRepository.findAll(pageable);
    }

    @Override
    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department updateDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public void deleteDepartmentById(int departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department getDepartmentById(int departmentId) {
        return departmentRepository.findById(departmentId).orElse(null);
    }

    @Override
    public void deleteDepartmentByName(String departmentName) {
        departmentRepository.deleteByName(departmentName);
    }
}
