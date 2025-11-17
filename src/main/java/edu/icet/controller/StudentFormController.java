package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins ="http://localhost:5173/")
@RestController
@RequiredArgsConstructor
@RequestMapping("student")
public class StudentFormController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public void addStudents(@RequestBody Student student) {
        studentService.addStudents(student);
    }


    @GetMapping("/getAll")
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @PutMapping("/student/{id}")
    public void updateStudent(@PathVariable int id, @RequestBody Student student) {
        student.setId(id);
        studentService.updateStudent(student);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }
}




