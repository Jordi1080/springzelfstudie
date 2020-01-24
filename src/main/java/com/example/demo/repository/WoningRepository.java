package com.example.demo.repository;

import com.example.demo.entity.Woning;
import org.springframework.stereotype.Repository;

public interface WoningRepository{
    Iterable<Woning> findAll();

    Woning findOne(String id);

    Woning save(Woning woning);
}
