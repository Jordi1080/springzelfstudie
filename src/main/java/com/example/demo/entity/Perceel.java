package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Perceel {

    @OneToMany
    private List<Woning> woningen;
}
