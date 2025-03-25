package com.rin.TestingSystem.controller;

import com.rin.TestingSystem.entity.Department;
import com.rin.TestingSystem.services.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/departments")
public class DepartmentController {
    @Autowired
    private IDepartmentService departmentService;

    @GetMapping
    public Page<Department> getAllDepartment(Pageable pageable) {
        return departmentService.getAllDepartments(pageable);
    }

    @PostMapping
    public ResponseEntity<Department> addDepartment(@RequestBody Department department) {
        Department response = departmentService.addDepartment(department);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public Department updateDepartment(@PathVariable int id, @RequestBody Department department) {
        department.setId(id);
        return departmentService.updateDepartment(department);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> deleteDepartmentById(@PathVariable int id) {
        departmentService.deleteDepartmentById(id);
        return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
    }

    @GetMapping("{id}")
    public Department getDepartmentById(@PathVariable int id) {
        return departmentService.getDepartmentById(id);
    }

    @DeleteMapping("name/{name}")
    public void deleteDepartmentByName(@PathVariable String name) {

    }
}
