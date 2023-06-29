package com.example.BiletiniAl.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "otobus")
@Getter
@Setter
public class Otobus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marka;
    private String model;


}

