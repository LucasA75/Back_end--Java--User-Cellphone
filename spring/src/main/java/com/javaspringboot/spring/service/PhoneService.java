package com.javaspringboot.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaspringboot.spring.model.Phone;
import com.javaspringboot.spring.repository.PhoneRepository;

@Service
@Transactional
public class PhoneService {

    private PhoneRepository phoneRepository;

    public PhoneService(PhoneRepository phoneRepository){
        this.phoneRepository = phoneRepository;
    }

    /* Ingresar un nuevo empleado */
    public Phone savePhone(Phone phone){
        return phoneRepository.save(phone);
    }

    /* Editar un phone */
    public Phone updatePhone(Phone phone){
        return phoneRepository.save(phone);
    }

    /* Mostrar todos los phone */
    public List<Phone> allPhone(){
           return phoneRepository.findAll();
    }

    
}
