package com.sdsu.passwordapi.service;

import com.sdsu.passwordapi.model.User;
import com.sdsu.passwordapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

@Autowired
UserRepository userRepository;


    public User saveUser (User user){
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllusers() {
        return userRepository.findAll();
    }
}

