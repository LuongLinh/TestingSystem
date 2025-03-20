package com.rin.TestingSystem.services;

import com.rin.TestingSystem.entity.Address;
import com.rin.TestingSystem.repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService implements IAddressService {
    @Autowired
    private IAddressRepository addressRepository;

    @Override
    public Address getAddressById(int id) {
        return addressRepository.findById(id).orElse(null);
    }

    @Override
    public List<Address> getAddresses() {
        return addressRepository.findAll();
    }

}
