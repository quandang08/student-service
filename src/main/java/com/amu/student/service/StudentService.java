package com.amu.student.service;

import com.amu.student.repositories.StudentRepository;
import com.amu.student.entities.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
    @Autowired
    private final StudentRepository studentRepository;

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    public List<Student> findAllStudentsBySchool(Long schoolId) {
        return studentRepository.findAllBySchoolId(schoolId);
    }
}
