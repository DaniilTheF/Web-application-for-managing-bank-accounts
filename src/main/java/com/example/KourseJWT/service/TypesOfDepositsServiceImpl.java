package com.example.KourseJWT.service;

import com.example.KourseJWT.interfaces.TypesOfDepositsService;
import com.example.KourseJWT.model.TypesOfDeposits;
import com.example.KourseJWT.repository.TypesOfDepositsRepos;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypesOfDepositsServiceImpl implements TypesOfDepositsService {
    private final TypesOfDepositsRepos depositsRepos;

    public TypesOfDepositsServiceImpl(TypesOfDepositsRepos depositsRepos) {
        this.depositsRepos = depositsRepos;
    }
    @Transactional
    @Override
    public List<TypesOfDeposits> getAllTypes() {
        return depositsRepos.findAll();
    }
    @Transactional
    @Override
    public void addNewType(TypesOfDeposits types) {
          depositsRepos.save(types);
    }
}
