package com.vmeg.vboard.services.impl;

import com.vmeg.vboard.models.Users;
import com.vmeg.vboard.repositories.UsersRepository;
import com.vmeg.vboard.services.UsersService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;

    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public void save(Users users) {
        users.setPassword(users.getPassword());
        usersRepository.save(users);
    }

    @Override
    public Users findByUsername(String username) {
        return usersRepository.findByUsername(username);
    }
}
