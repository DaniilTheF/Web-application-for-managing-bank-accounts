package com.example.KourseJWT.repository;

import com.example.KourseJWT.model.Accounts;
import com.example.KourseJWT.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountsRepos extends JpaRepository<Accounts,Integer> {
    public List<Accounts> findAllByPersonId(Person personId);
}
