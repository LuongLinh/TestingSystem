package com.rin.TestingSystem.controller;

import com.rin.TestingSystem.dto.AddressDTO;
import com.rin.TestingSystem.dto.UserDTO;
import com.rin.TestingSystem.entity.Address;
import com.rin.TestingSystem.services.AddressService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/addresses")
public class AddressController {
    @Autowired
    public AddressService addressService;
    @Autowired
    private ModelMapper modelMapper;

    public AddressController(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public List<AddressDTO> getAddresses() {
        List<Address> addresses = addressService.getAddresses();
        return modelMapper.map(addresses, new TypeToken<List<AddressDTO>>() {}.getType());
    }

    @GetMapping("{id}")
    public AddressDTO getAddressById(@PathVariable int id) {
        Address address = addressService.getAddressById(id);
        return modelMapper.map(address, AddressDTO.class);
    }
}
