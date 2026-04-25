package com.ge.GerenciaDeEscola.Eployers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping(name = "/eployers")

public class EployController {
    private EployService eployeService;

    public EployController(EployService eployService){
        this.eployeService = eployService;
    }

    @GetMapping("/list")
    public List<EployeModel> EployToList (){
        return eployeService.EployToList();
    }
}
