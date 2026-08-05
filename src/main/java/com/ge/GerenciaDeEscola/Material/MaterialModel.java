package com.ge.GerenciaDeEscola.Material;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table (name = "material")
public class MaterialModel {
    List<MaterialModel>MaterialList;

}
