package com.example.KourseJWT.interfaces;

import com.example.KourseJWT.model.TypesOfDeposits;

import java.util.List;

public interface TypesOfDepositsService {
    public List<TypesOfDeposits> getAllTypes();
    public void addNewType(TypesOfDeposits types);
}
