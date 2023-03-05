package com.example.allqueryproject.controller;

import com.example.allqueryproject.model.Student;
import com.example.allqueryproject.repository.StudentRepo;
import com.example.allqueryproject.service.StudentService;
import jakarta.validation.Valid;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("app/v1")
@RestController
public class StudentController {
    @Autowired
    StudentRepo studentRepo;

    @Autowired
    StudentService studentService;

    @PostMapping("/create-student")
    public ResponseEntity<String> createStudent( @RequestBody Student student) {
        studentService.saveStudent(student);
        return new ResponseEntity<>("student created", HttpStatus.OK);
    }
    @GetMapping("/find-all-students")

    public List<Student> findAllStudent(){
        return studentService.findAll();
    }
    @GetMapping("find-by-firstname")
    public ResponseEntity<Student> findByFirstName( @RequestParam String firstName) {
        Student studentByFirstName = studentService.findStudentByFirstName(firstName);
        return new ResponseEntity<>(studentByFirstName,HttpStatus.OK);
    }
    @GetMapping("find-by-lastname")
    public ResponseEntity<Student> findByLastName( @RequestParam String lastName) {
        Student studentByLastName = studentService.findStudentByLastName(lastName);
        return new ResponseEntity<>(studentByLastName,HttpStatus.OK);
    }
    @GetMapping("find-by-firstname-and-lastname")
    public ResponseEntity<Student> findByFirstNameAndLastName(@RequestParam String firstName, @RequestParam String lastName) {
        Student studentByFirstAndLastName = studentService.findByFirstNameAndLastName(firstName,lastName);
        return new ResponseEntity<>(studentByFirstAndLastName,HttpStatus.OK);
    }
    @GetMapping("find-by-age")
    public ResponseEntity<Student> findByAge(@RequestParam Integer age) {
        Student studentByAge = studentService.findStudentByAge(age);
        return new ResponseEntity<>(studentByAge,HttpStatus.OK);
    }
    @GetMapping("find-by-age-or-firstname")
    public ResponseEntity<Student> findByAgeOrFirstName(@RequestParam Integer age,@RequestParam  String firstName) {
        Student studentByAgeOrFirstName = studentService.findStudentByAgeOrFirstName(age,firstName);
        return new ResponseEntity<>(studentByAgeOrFirstName,HttpStatus.OK);
    }
    @GetMapping("find-by-firstname-starting-with")
    public ResponseEntity<Student> findByFirstNameStartingWith(@RequestParam String firstName) {
        Student studentServiceByFirstNameStartingWith = studentService.findByFirstNameStartingWith(firstName);
        return new ResponseEntity<>(studentServiceByFirstNameStartingWith,HttpStatus.OK);
    }
    @GetMapping("find-by-firstname-ending-with")
    public ResponseEntity<Student> findByFirstNameEndingWith(@RequestParam String firstName) {
        Student studentServiceByFirstNameEndingWith = studentService.findByFirstNameEndingWith(firstName);
        return new ResponseEntity<>(studentServiceByFirstNameEndingWith,HttpStatus.OK);
    }

}

