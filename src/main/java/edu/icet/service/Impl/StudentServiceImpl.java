package edu.icet.service.Impl;

import edu.icet.dto.Student;
import edu.icet.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public void addStudents(Student student) {
        StudentEntity studentEntity = modelMapper.map(student, StudentEntity.class);
      studentRepository.save(studentEntity);

    }

    @Override
    public List<Student> getAll() {
        ArrayList<Student> StudentList = new ArrayList<>();
        List<StudentEntity> studentEntityList = studentRepository.findAll();

        studentEntityList.forEach(studentEntity -> {
            StudentList.add(modelMapper.map(studentEntity, Student.class));
        });
        return StudentList;
    }

    @Override
    public void updateStudent(Student student) {
    StudentEntity existing = studentRepository.findById(Long.valueOf(student.getId()))
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        existing.setFristName(student.getFristName());
        existing.setLastName(student.getLastName());
        existing.setEmail(student.getEmail());
        existing.setPhoneNumber(student.getPhoneNumber());
        existing.setAddress(student.getAddress());
        existing.setGender(student.getGender());
        existing.setStatus(student.getStatus());
        existing.setDateOfBirth(student.getDateOfBirth());
        existing.setAdmissionDate(student.getAdmissionDate());;

      studentRepository.save(existing);
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById((long) id);
    }

}




