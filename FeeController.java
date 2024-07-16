package myProject.example.LibraryStudent.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import myProject.example.LibraryStudent.Stu.Fee;
import myProject.example.LibraryStudent.service.FeeService;

@RestController
@RequestMapping("/fees")
public class FeeController {
    @Autowired
    private FeeService feeService;

    @GetMapping
    public List<Fee> getAllFees() {
        return feeService.getAllFees();
    }

    @GetMapping("/{id}")
    public Fee getFeeById(@PathVariable Long id) {
        return feeService.getFeeById(id);
    }

    @PostMapping
    public Fee createFee(@RequestBody Fee fee) {
        return feeService.saveFee(fee);
    }

    @DeleteMapping("/{id}")
    public void deleteFee(@PathVariable Long id) {
        feeService.deleteFee(id);
    }
}