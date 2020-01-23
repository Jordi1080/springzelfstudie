package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Perceel {

    @OneToMany
    private Woning woning;
}
