package com.ge.GerenciaDeEscola.Student;

public class StudantMapper {
    public static StudentModel toModel(Student student) {
        StudentModel model = new StudentModel();
        model.setId(student.getId());
        model.setName(student.getName());
        model.setEmail(student.getEmail());
        model.setPhone(student.getPhone());
        return model;
    }

    public static Student toEntity(StudentModel model) {
        Student student = new Student();
        student.setId(model.getId());
        student.setName(model.getName());
        student.setEmail(model.getEmail());
        student.setPhone(model.getPhone());
        return student;
    }
}
