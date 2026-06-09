package com.ge.GerenciaDeEscola.Student;

import com.ge.GerenciaDeEscola.AbstractClasses.Human;

public class StudentModel extends Human{
    private String course;
    private String registrationNumber;

    public StudentModel(String name, int age, String course, String registrationNumber) {
        super(name, age, cpf, email, phoneNumber, address, dateOfBirth, gender);
        this.course = course;
        this.registrationNumber = registrationNumber;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
