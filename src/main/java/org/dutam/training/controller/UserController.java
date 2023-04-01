package org.dutam.training.controller;

import org.dutam.training.entity.UserEntity;
import org.dutam.training.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public UserEntity postUser(@RequestBody UserEntity user){
        return userService.saveNewUser(user);
    }

    @GetMapping
    public List<UserEntity> getUsers(){
        return userService.findAllUsers();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
    }

    @PutMapping
    public UserEntity putUser(@RequestBody UserEntity user){
        return userService.updateUser(user);
    }

    @GetMapping("/{id}")
    public UserEntity getUserById(@PathVariable Integer id){
        return userService.findUserById(id);
    }

}
