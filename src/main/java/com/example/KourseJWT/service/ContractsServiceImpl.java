package com.example.KourseJWT.service;

import com.example.KourseJWT.interfaces.ContractsService;
import com.example.KourseJWT.model.Accounts;
import com.example.KourseJWT.model.Contracts;
import com.example.KourseJWT.model.Person;
import com.example.KourseJWT.repository.ContractsRepos;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractsServiceImpl implements ContractsService {
    private final ContractsRepos contractsRepos;

    public ContractsServiceImpl(ContractsRepos contractsRepos) {
        this.contractsRepos = contractsRepos;
    }
    @Transactional
    @Override
    public List<Contracts> allContractsByPersonId(Integer id) {
        Person person = new Person();
        person.setId(id);
        Accounts accounts = new Accounts();
        accounts.setPersonId(person);
        return contractsRepos.findAllByAccountsId_PersonId_Id(id);
    }
    @Transactional
    @Override
    public List<Contracts> getAllContracts() {
        return contractsRepos.findAll();
    }
}
