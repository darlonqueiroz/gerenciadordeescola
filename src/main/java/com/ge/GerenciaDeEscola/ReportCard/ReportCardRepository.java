package com.ge.GerenciaDeEscola.ReportCard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportCardRepository extends JpaRepository<ReportCardModel, Long> {
}
