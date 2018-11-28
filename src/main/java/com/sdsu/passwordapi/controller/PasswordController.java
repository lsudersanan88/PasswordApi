package com.sdsu.passwordapi.controller;

import com.sdsu.passwordapi.model.User;
import com.sdsu.passwordapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordController {
    @Autowired
    UserService userService;
    @GetMapping
 public ResponseEntity<User> addUser (@RequestBody User user)
 {
    if(user!= null)
    {
        userService.saveUser(user);
        return (new ResponseEntity(user.getUid(),HttpStatus.CREATED));
    }

      return (new ResponseEntity<>(HttpStatus.NOT_FOUND));
 }




}
