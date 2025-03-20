package com.rin.TestingSystem.services;

import com.rin.TestingSystem.entity.User;

import java.util.List;

public interface IUserService {
    public List<User> getUsers();
    public User getUserById(int id);
}
