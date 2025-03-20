package com.rin.TestingSystem.services;

import com.rin.TestingSystem.entity.Address;

import java.util.List;

public interface IAddressService {
    public Address getAddressById(int id);
    public List<Address> getAddresses();
}
