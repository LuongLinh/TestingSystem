package com.rin.TestingSystem.repository;

import com.rin.TestingSystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {
}
