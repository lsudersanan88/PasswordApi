package com.sdsu.passwordapi.service;

import com.sdsu.passwordapi.model.User;
import com.sdsu.passwordapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
 @Autowired
    UserRepository userRepository;

    public User saveUser (User user){
       return userRepository.save(user);
    }
}
