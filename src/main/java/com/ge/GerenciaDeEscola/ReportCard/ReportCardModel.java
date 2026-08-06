package com.ge.GerenciaDeEscola.ReportCard;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "report_card")
public class ReportCardModel {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

}
