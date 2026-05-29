package com.ge.GerenciaDeEscola.Eployers;

import com.ge.GerenciaDeEscola.AbstractClasses.Human;

public class EmployMapper extends Human {
    public static EmployModel toEmployModel(EmployDTO dto) {
        EmployModel model = new EmployModel();
        model.setId(dto.getId());
        model.setName(dto.getName());
        model.setCpf(dto.getCpf());
        model.setEmail(dto.getEmail());
        model.setPhone(dto.getPhone());
        model.setPosition(dto.getPosition());
        return model;
    }
}
