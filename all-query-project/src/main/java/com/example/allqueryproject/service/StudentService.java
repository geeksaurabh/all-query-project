package com.example.allqueryproject.service;

import com.example.allqueryproject.model.Student;
import com.example.allqueryproject.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;
    public Student saveStudent(Student student){
        return  studentRepo.save(student);
    }
    public List<Student> findAll() {
      return  studentRepo.findAll();
    }

    public Student findStudentByFirstName(String firstName) {
       return studentRepo.findStudentByFirstName(firstName);
    }

    public Student findStudentByLastName(String lastName) {
        return studentRepo.findStudentByLastName(lastName);
    }
    public Student findByFirstNameAndLastName(String firstName,String lastName) {
        return studentRepo.findByFirstNameAndLastName(firstName,lastName);
    }

    public Student findStudentByAge(Integer age) {
            return studentRepo.findStudentByAge(age);
    }

    public Student findStudentByAgeOrFirstName(Integer age, String firstName) {
        return studentRepo.findStudentByAgeOrFirstName(age,firstName);
    }

    public Student findByFirstNameStartingWith(String firstName) {
        return studentRepo.findStudentByFirstNameStartingWith(firstName);
    }

    public Student findByFirstNameEndingWith(String firstName) {
        return studentRepo.findByFirstNameEndingWith(firstName);
    }
}
