package edu.icet.entity;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class StudentEntity {
    private Integer id;
    private String fristName;
    private String lastName;
    private  String email;
    private String phoneNumber;
    private String address;
    private String gender;
    private  String status;
    private LocalDate dateOfBirth;      // LocalDate type
    private LocalDate admissionDate;

}
