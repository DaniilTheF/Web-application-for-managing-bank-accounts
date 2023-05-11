package com.example.KourseJWT.controller;

import com.example.KourseJWT.interfaces.AuthService;
import com.example.KourseJWT.model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/auth")
public class AuthenticationController {

    private final AuthService service;

    public AuthenticationController(AuthService service) {
        this.service = service;
    }

    @PostMapping("/authenticate")
    public ResponseEntity<Person> authenticate(@RequestBody Person request){
        return ResponseEntity.ok(service.auth(request));
    }
}