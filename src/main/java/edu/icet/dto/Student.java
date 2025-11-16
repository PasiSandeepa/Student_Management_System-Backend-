package edu.icet.dto;

import lombok.*;

import java.time.LocalDate;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
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
