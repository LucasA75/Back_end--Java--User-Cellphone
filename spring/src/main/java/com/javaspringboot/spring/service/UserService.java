package com.javaspringboot.spring.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaspringboot.spring.model.User;
import com.javaspringboot.spring.repository.UserRepository;

@Service
@Transactional
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> allUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(Long id){
         userRepository.deleteById(id);
    }

    public User createUser(User user){
       return userRepository.save(user);
    }

    public User findUser(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            return optionalUser.get();
        } else {
            throw new NoSuchElementException("User no encontrado con ID: " + id);
        }
    }

    /* Cambiar el si esta activo o no */
    public User changeActive(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            Boolean estadoUser = user.isActive();
            if(estadoUser != true){
                  user.setActive(true);
                  return user;
            }else{
                user.setActive(false);
                return user;
            }
        } else {
            throw new NoSuchElementException("User no encontrado con ID: " + id);
        }
    }

}
