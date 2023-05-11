package com.example.KourseJWT.interfaces;

import com.example.KourseJWT.model.Contracts;

import java.util.List;

public interface ContractsService {
    public List<Contracts> allContractsByPersonId(Integer id);
    public List<Contracts> getAllContracts();
}
