package com.mahima.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahima.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
