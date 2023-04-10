package com.javaspringboot.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaspringboot.spring.model.User;
import com.javaspringboot.spring.service.UserService;

@CrossOrigin("*")
@RestController
public class UserController {
    
    private UserService userService;

    public UserController(@Autowired UserService userService){
        this.userService = userService;
    }

    /* Ver todos los usuario */
    @GetMapping("/user")
    public List<User> allUser(){
        return userService.allUsers();
    }

    /* Ver usuario segun id */
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id){
        return userService.findUser(id);
    }

    /* Crear usuario */
    @PostMapping("/user")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    /*Editar usuario */
    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable Long id , @RequestBody User user){
       return userService.createUser(user);
    }

    /* Deletear usuario */
    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable Long id ){
        userService.deleteUser(id);
    }

    /* Cambiar el estado de active */
    @PutMapping("/active/{id}")
    public User changeActive(@PathVariable Long id) {
         return userService.changeActive(id);
    }
}
