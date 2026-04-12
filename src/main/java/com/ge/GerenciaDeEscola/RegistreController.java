package com.ge.GerenciaDeEscola;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class RegistreController {

    @GetMapping("/welcome")
    public String menssage(){
        return "Registre Controller funcionando!";
    }
}
