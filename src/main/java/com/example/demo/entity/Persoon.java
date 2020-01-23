package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Data
public class Persoon {

    @OneToOne
    private Woning woning;
}
