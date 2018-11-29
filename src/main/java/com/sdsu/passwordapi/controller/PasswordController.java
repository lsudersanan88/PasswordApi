package com.sdsu.passwordapi.controller;

import com.sdsu.passwordapi.model.User;
import com.sdsu.passwordapi.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PasswordController {
    @Autowired
    UserServiceImp userServiceImp;


    @PostMapping("/addUser")
 public ResponseEntity<User> addUser (@RequestBody User user)
 {
    if(user!= null)
    {
        userServiceImp.saveUser(user);
        return (new ResponseEntity(user.getUid(),HttpStatus.CREATED));
    }

      return (new ResponseEntity<>(HttpStatus.NOT_FOUND));
 }


    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> getAllUsers ()
    {
        List<User> users = userServiceImp.getAllusers();
         if(users.size()!= 0)
        {
            return (new ResponseEntity(users,HttpStatus.OK));
        }

        return (new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


}
