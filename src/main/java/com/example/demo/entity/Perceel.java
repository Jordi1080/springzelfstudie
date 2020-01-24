package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Perceel {

    @OneToMany
    private List<Woning> woningen;
}
