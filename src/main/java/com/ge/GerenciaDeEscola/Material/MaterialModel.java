package com.ge.GerenciaDeEscola.Material;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "material")
public class MaterialModel {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

}
