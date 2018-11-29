package com.sdsu.passwordapi.service;

import com.sdsu.passwordapi.model.User;

import java.util.List;

public interface UserService {

     User saveUser (User user);
      List<User> getAllusers ();
}
