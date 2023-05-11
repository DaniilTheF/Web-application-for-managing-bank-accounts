package com.example.KourseJWT.repository;

import com.example.KourseJWT.model.TypesOfDeposits;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypesOfDepositsRepos extends JpaRepository<TypesOfDeposits,Integer> {
    public TypesOfDeposits findByName(String name);
}
