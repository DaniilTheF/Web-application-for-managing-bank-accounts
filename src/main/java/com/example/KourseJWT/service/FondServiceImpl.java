package com.example.KourseJWT.service;

import com.example.KourseJWT.interfaces.FondService;
import com.example.KourseJWT.model.Fond;
import com.example.KourseJWT.repository.FondRepos;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class FondServiceImpl implements FondService {
    private final FondRepos fondRepos;

    public FondServiceImpl(FondRepos fondRepos) {
        this.fondRepos = fondRepos;
    }

    @Transactional
    @Override
    public Fond viewFond() {
        return fondRepos.findById(1).orElse(null);
    }
}
