package com.vmeg.vboard.services;

import com.vmeg.vboard.models.Users;

public interface UsersService {
    void save(Users users);
    Users findByUsername(String username);
}
