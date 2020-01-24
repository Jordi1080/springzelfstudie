package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Perceel {

    @Id
    private int id;

    @OneToMany
    private List<Woning> woningen;
}
