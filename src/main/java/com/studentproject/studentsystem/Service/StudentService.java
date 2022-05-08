package com.studentproject.studentsystem.Service;

import com.studentproject.studentsystem.model.Student;

import java.util.List;

public interface StudentService  {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

}
