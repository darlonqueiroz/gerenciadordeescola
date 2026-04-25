package com.ge.GerenciaDeEscola.Material;

import org.springframework.stereotype.Service;

@Service
public class MaterialService {
    private MaterialRepository materialRepository;

    public MaterialService (MaterialRepository,materialRepository){

        this.materialRepository = materialRepository;
    }


}
