package com.ge.GerenciaDeEscola.Employe;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeService {

    private EmployeRepository employeRepository;

    public EmployeService(EmployeRepository employeRepository) {

        this.employeRepository = employeRepository;

    }

    public List<EmployeModel> EmployeToList(){
            return employeRepository.findAll();
    }
}
