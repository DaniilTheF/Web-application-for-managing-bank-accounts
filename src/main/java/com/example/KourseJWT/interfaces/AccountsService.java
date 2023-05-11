package com.example.KourseJWT.interfaces;

import com.example.KourseJWT.model.Accounts;
import com.example.KourseJWT.model.Person;

import java.util.List;

public interface AccountsService {
    public List<Accounts> allAccountsById(Integer id);
    public void createAccounts(Accounts accounts);
    public void deleteAccount(Integer id);
    public List<Accounts> getAllAccounts();
    public List<Accounts> closeDay();
}
