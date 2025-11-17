package edu.icet.service;

import edu.icet.dto.Student;

import java.util.List;

public interface StudentService {
   void addStudents(Student student);

   List<Student> getAll();

   void updateStudent(Student student);

   void deleteStudent(int id);



}


