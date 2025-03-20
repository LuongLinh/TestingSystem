package com.rin.TestingSystem.controller;

import com.rin.TestingSystem.dto.UserDTO;
import com.rin.TestingSystem.entity.User;
import com.rin.TestingSystem.services.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public List<UserDTO> getUsers() {
        List<User> users = userService.getUsers();
        return modelMapper.map(users, new TypeToken<List<UserDTO>>() {}.getType());
    }

    @GetMapping("{id}")
    public UserDTO getUserById(@PathVariable int id) {
        User user = userService.getUserById(id);
        return modelMapper.map(user, UserDTO.class);
    }
}
