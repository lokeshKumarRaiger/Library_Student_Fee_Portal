package myProject.example.LibraryStudent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myProject.example.LibraryStudent.Stu.StudentU;
import myProject.example.LibraryStudent.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<StudentU> getAllStudents() {
        return studentRepository.findAll();
    }

    public StudentU getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public StudentU saveStudent(StudentU student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}