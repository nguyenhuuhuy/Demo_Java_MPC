package demo.mpc.service;

import demo.mpc.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    void save(Student student);
    Student findById(int id);
    void deleteById(int id);
}
