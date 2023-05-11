package com.example.KourseJWT.controller;

import com.example.KourseJWT.interfaces.AccountsService;
import com.example.KourseJWT.model.Accounts;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/accounts")
public class AccountsController {
    private final AccountsService accountsService;

    public AccountsController(AccountsService accountsService) {
        this.accountsService = accountsService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Accounts>> allAccounts() {
        return new ResponseEntity<>(accountsService.getAllAccounts(), HttpStatus.OK);
    }

    @GetMapping("/all/{id}")
    public ResponseEntity<List<Accounts>> getAllById(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(accountsService.allAccountsById(id), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addNewAccounts(@RequestBody Accounts accounts) {
        accountsService.createAccounts(accounts);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> closeAccounts(@PathVariable("id") Integer id) {
        accountsService.deleteAccount(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/closeDay")
    public ResponseEntity<?> closeDayOperation() {
        return new ResponseEntity<>(accountsService.closeDay(), HttpStatus.OK);
    }
}
