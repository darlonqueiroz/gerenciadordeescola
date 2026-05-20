package com.ge.GerenciaDeEscola.ReportCard;

public class ReportCardDTO {
    private String studentName;
    private String grade;

    public ReportCardDTO(String studentName, String grade) {
        this.studentName = studentName;
        this.grade = grade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
