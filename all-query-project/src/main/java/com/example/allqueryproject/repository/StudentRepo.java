package com.example.allqueryproject.repository;

import com.example.allqueryproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student,Integer> {

//    @Query(value = "SELECT * FROM student_tbl WHERE first_name = :firstName",nativeQuery = true)
    Student findStudentByFirstName(String firstName);

  //  @Query(value = "SELECT * FROM student_tbl WHERE last_name = :firstName",nativeQuery = true)
    Student findStudentByLastName(String lastName);

    //  @Query(value = "SELECT * FROM student_tbl WHERE first_name = :firstName AND last_name = :lastName",nativeQuery = true)
    Student findByFirstNameAndLastName(String firstName,String lastName);

  //  @Query(value = "SELECT * FROM student_tbl WHERE age = :age",nativeQuery = true)
    Student findStudentByAge(Integer age);

   // @Query(value = "SELECT * FROM student_tbl WHERE age = :age OR first_name = :firstName",nativeQuery = true)
    Student findStudentByAgeOrFirstName(Integer age, String firstName);

    //  @Query(value = "SELECT * FROM student_tbl WHERE first_name LIKE firstName%;",nativeQuery = true)
    Student findStudentByFirstNameStartingWith(String firstName);

    ////  @Query(value = "SELECT * FROM student_tbl WHERE first_name LIKE %firstName;",nativeQuery = true)
    Student findByFirstNameEndingWith(String firstName);
}
