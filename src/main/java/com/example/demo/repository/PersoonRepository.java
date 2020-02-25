package com.example.demo.repository;

import com.example.demo.entity.Persoon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PersoonRepository extends JpaRepository<Persoon, String> {
    List<Persoon> findAll();

    Persoon findById(Long id);

    Persoon findByNaam(String name);

    Persoon save(Persoon persoon);
}
