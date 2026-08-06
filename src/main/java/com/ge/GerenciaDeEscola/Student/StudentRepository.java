package com.ge.GerenciaDeEscola.Student;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository {
        StudentModel save(StudentModel student);
        StudentModel findById(Long id);
        void deleteById(Long id);
}
