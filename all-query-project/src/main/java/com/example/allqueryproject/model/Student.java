package com.example.allqueryproject.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student_tbl")
public class Student {
    @Id
    @Column(name = "student_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
//    @NotBlank(message = "firstname cannot be null or empty")
    @Column(name = "first_name")
    private String firstName;
//    @NotNull(message = "lastname can not be null")
    @Column(name = "last_name")
    private String lastName;
//    @Size(min=18, max=25 ,message = "students below age of 18 and above 25 cannot take admission in our college ")
    @Column(name = "age")
    private Integer age ;
    @Column(name = "active")
    private Boolean active ;
//    @Pattern(regexp = "\"^(1[0-2]|0[1-9])/(3[01]\"\n" +
//            "                       + \"|[12][0-9]|0[1-9])/[0-9]{4}$\"",message = "you have used wrong date pattern pls use 10/12/2016 this pattern of date because it is only valid accepted ")
    @Column(name = "admission_date")
    private String admissionDate;
}
