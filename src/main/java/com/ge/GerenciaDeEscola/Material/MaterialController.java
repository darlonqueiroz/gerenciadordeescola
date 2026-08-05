package com.ge.GerenciaDeEscola.Material;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/material")
public class MaterialController {

    private MaterialService materialService;


    public MaterialController(MaterialService materialService) {
        this.materialService = materialService;
    }

    @GetMapping("/listmaterial")
    public String MaterialToList() {
        return "Lista de Materiais";
    }
}