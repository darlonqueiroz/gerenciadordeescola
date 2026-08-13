package com.ge.GerenciaDeEscola.Material;

import graphql.ExecutionResult;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {
    private MaterialRepository materialRepository;

    public MaterialService (MaterialRepository materialRepository){

        this.materialRepository = materialRepository;
    }


    public MaterialModel saveMaterial(MaterialModel materialModel){
        return materialRepository.save(materialModel);
    }

    public MaterialModel getMaterialById(Long id){
        return materialRepository.findById(id).orElse(null);
    }

    public void deleteMaterial(Long id){
        materialRepository.deleteById(id);
    }


    public List<MaterialModel> createMaterial(@Valid MaterialModel material) {
        MaterialModel savedMaterial = materialRepository.save(material);
        return materialRepository.findAll();


    }
}
