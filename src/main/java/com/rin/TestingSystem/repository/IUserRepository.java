package com.rin.TestingSystem.repository;

import com.rin.TestingSystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {
}
