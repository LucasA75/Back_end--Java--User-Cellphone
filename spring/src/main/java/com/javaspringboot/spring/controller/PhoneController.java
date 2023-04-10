package com.javaspringboot.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaspringboot.spring.model.Phone;
import com.javaspringboot.spring.service.PhoneService;


@CrossOrigin("*")
@RestController
public class PhoneController {
    
    private PhoneService phoneService;

    public PhoneController(@Autowired PhoneService phoneService){
        this.phoneService = phoneService;
    }

    /* Todos los phone */
    @GetMapping("/phone")
    public List<Phone> allPhone(){
        return phoneService.allPhone();
    }

    /* Ingresar un nuevo phone */
    @PostMapping("/phone")
    public Phone addPhone(@RequestBody Phone phone){
       return phoneService.savePhone(phone);
    }


    /* Actualizar un phone */
    @PutMapping("/phone")
    public void actualizarphone(@RequestBody Phone phone){
        phoneService.updatePhone(phone);
    }

}
