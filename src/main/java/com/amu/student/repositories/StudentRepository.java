package com.amu.student.repositories;

import com.amu.student.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findAllBySchoolId(Long schoolId);
}
