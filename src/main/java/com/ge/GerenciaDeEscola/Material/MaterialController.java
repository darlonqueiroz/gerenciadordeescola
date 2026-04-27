package com.ge.GerenciaDeEscola.Material;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/materia")
public class MaterialController {

    private MaterialService materialService;


    public MaterialController(MaterialService materialService) {
        this.materialService = materialService;
    }
}
