package com.ge.GerenciaDeEscola.Material;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/list")
    public String listMaterials() {
        return "List of materials";
    }

    @PostMapping ("/create")
    public String createMaterial(@RequestBody @Valid MaterialModel material) {
        materialService.createMaterial(material);
        return "Material created successfully";


    }
}