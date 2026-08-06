package com.ge.GerenciaDeEscola.Eployers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EployRepository extends JpaRepository<EployeModel, Long> {
}
