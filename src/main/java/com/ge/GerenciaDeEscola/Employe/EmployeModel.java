package com.ge.GerenciaDeEscola.Employe;

import com.ge.GerenciaDeEscola.AbstractClasses.Human;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table (name = "tb_eployers")
public class EmployeModel extends Human{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String office;
    private BigDecimal salary;

    public EmployeModel(Long id, String name, String cpf, String email, String phoneNumber, String address, String dateOfBirth, String gender, String office, BigDecimal salary) {
        super(name,  cpf, email, phoneNumber, address, dateOfBirth, gender);

        this.id = id;
        this.office = office;
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    
}
