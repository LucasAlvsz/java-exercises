package com.exercicios.api.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class CarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String fabricante;

    @Column(nullable = false)
    private String dataFabricacao;

    @Column(nullable = false)
    private double valor;

    @Column(nullable = false)
    private int anoModelo;
}
