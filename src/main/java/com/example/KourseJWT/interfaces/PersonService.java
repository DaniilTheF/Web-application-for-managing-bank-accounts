package com.example.KourseJWT.interfaces;

import com.example.KourseJWT.model.Person;

import java.util.List;

public interface PersonService {
    public Person oneClientById(Integer id);
    public void createClient(Person person);
    public void updateClient(Person person);
    public void deleteClient(Integer id);
    public List<Person> allClients();
}
