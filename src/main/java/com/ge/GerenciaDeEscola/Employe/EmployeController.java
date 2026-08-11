package com.ge.GerenciaDeEscola.Employe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping(name = "/employe")

public class EmployeController {
    private EmployeService employeService;

    public EmployeController(EmployeService employeService){
        this.employeService = employeService;
    }

 //   @GetMapping("/list")
  //  public List<EmployeModel> EmployeToList (){
//
     //    return employeService.EmployeToList();
  //  }

    @GetMapping("/list")
    public List<EmployeModel> EmployeToList() {
        return employeService.EmployeToList();
    }
}
