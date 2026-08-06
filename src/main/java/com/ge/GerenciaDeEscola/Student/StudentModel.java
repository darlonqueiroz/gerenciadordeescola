package com.ge.GerenciaDeEscola.Student;

import com.ge.GerenciaDeEscola.AbstractClasses.Human;
import jakarta.persistence.*;

@Entity
@Table (name = "tb_students")
public class StudentModel extends Human{

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String course;
    private String registrationNumber;

    public StudentModel () {

    }

    public StudentModel(String name, String course, String registrationNumber, String cpf, String email, String phoneNumber, String address, String dateOfBirth, String gender) {
        super(name, cpf, email, phoneNumber, address, dateOfBirth, gender);
        this.course = course;
        this.registrationNumber = registrationNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
