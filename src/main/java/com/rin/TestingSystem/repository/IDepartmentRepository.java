package com.rin.TestingSystem.repository;

import com.rin.TestingSystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {
    @Query("DELETE FROM Department WHERE name= ?1")
    void deleteByName(String departmentName);
}
