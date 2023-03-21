package demo.mpc.controller;

import demo.mpc.model.Student;
import demo.mpc.service.IStudentService;
import demo.mpc.service.StudentServiceIMPL;


import java.util.List;

public class StudentController {
    StudentServiceIMPL studentService = new StudentServiceIMPL();
    public List<Student> showListStudent() {
        return studentService.findAll();
    }
    public void createStudent(Student student) {
        studentService.save(student);
    }
    public void deleteStudent(int id) {
        studentService.deleteById(id);
    }
}
