package com.rin.TestingSystem.repository;

import com.rin.TestingSystem.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface IAddressRepository extends JpaRepository<Address, Integer> {
}
