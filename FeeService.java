package myProject.example.LibraryStudent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myProject.example.LibraryStudent.Stu.Fee;
import myProject.example.LibraryStudent.repository.FeeRepository;

@Service
public class FeeService {
    @Autowired
    private FeeRepository feeRepository;

    public List<Fee> getAllFees() {
        return feeRepository.findAll();
    }

    public Fee getFeeById(Long id) {
        return feeRepository.findById(id).orElse(null);
    }

    public Fee saveFee(Fee fee) {
        return feeRepository.save(fee);
    }

    public void deleteFee(Long id) {
        feeRepository.deleteById(id);
    }
}