package com.example.StudentCrud.repository;

import com.example.StudentCrud.domain.Student;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
