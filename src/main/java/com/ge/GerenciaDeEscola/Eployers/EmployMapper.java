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

        public static EmployDTO toEmployDTO(EmployModel model) {
            EmployDTO dto = new EmployDTO();
            dto.setId(model.getId());
            dto.setName(model.getName());
            dto.setCpf(model.getCpf());
            dto.setEmail(model.getEmail());
            dto.setPhone(model.getPhone());
            dto.setPosition(model.getPosition());
            return dto;
        }
}
