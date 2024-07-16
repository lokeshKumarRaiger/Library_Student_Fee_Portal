package myProject.example.LibraryStudent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import myProject.example.LibraryStudent.Stu.StudentU;

public interface StudentRepository extends JpaRepository<StudentU, Long> {
	
}
