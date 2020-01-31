package com.example.demo.repository;

import com.example.demo.entity.Gebruiker;
import org.springframework.data.repository.CrudRepository;

public interface GebruikerRepository extends CrudRepository<Gebruiker, Long> {
    Gebruiker findByUsername(String username);
}
