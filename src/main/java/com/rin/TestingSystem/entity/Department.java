package com.rin.TestingSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Department")
@NoArgsConstructor // tạo constructor
//@Setter
//@Getter
public class Department {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // auto increment
    @Column(name = "DepartmentID")
    private int id;

    @Column(name = "DepartmentName", length = 50, nullable = false)
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
