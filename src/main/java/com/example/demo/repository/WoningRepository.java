package com.example.demo.repository;

import com.example.demo.entity.Woning;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
// als je <Woning, String> vergeet achter JpaRepository krijg je:
// nested exception is java.lang.IllegalArgumentException: Not a managed type: class java.lang.Object
public interface WoningRepository extends JpaRepository<Woning, String> {
    List<Woning> findAll();

    Optional<Woning> findByBagId(String bagId);

    Woning findByBouwjaar(int bouwjaar);

    Woning save(Woning woning);
}
