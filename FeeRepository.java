package myProject.example.LibraryStudent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import myProject.example.LibraryStudent.Stu.Fee;

public interface FeeRepository extends JpaRepository<Fee, Long> {
}