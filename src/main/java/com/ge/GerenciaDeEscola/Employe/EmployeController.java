package com.ge.GerenciaDeEscola.Eployers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping(name = "/eployers")

public class EmployerController {
    private EployService eployeService;

    public EmployerController(EployService eployService){
        this.eployeService = eployService;
    }

    @GetMapping("/list")
    public List<EployeModel> EployToList (){

        return eployeService.EployToList();
    }
}
