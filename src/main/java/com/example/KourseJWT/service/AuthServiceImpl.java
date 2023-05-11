package com.example.KourseJWT.service;

import com.example.KourseJWT.Encoder.PasswordEncoder;
import com.example.KourseJWT.interfaces.AuthService;
import com.example.KourseJWT.model.Person;
import com.example.KourseJWT.model.Role;
import com.example.KourseJWT.repository.PersonRepos;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    private final PersonRepos personRepos;

    public AuthServiceImpl(PersonRepos personRepos) {
        this.personRepos = personRepos;
    }

    @Transactional
    @Override
    public Person auth(Person person){
        Person pers = personRepos.findPersonByLogin(person.getLogin()).orElse(null);
        if(pers != null){
            if(PasswordEncoder.HashPassword(person.getPassword()).equals(pers.getPassword())){
                return pers;
        }else return new Person();
        }else return  new Person();
    }
}
