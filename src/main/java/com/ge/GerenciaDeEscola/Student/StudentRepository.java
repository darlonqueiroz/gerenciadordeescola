package com.ge.GerenciaDeEscola.Student;

public interface StudentRepository {
        StudentModel save(StudentModel student);
        StudentModel findById(Long id);
        void deleteById(Long id);
}
