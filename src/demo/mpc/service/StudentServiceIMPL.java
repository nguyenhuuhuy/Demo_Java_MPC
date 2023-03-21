package demo.mpc.service;

import demo.mpc.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceIMPL implements IStudentService{
    public static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1,"Ha",5));
        studentList.add(new Student(2,"long",10));
    }
    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public void save(Student student) {
//       boolean checkId = true;
//        for (int i = 0; i < studentList.size(); i++) {
//            if (studentList.get(i).getId() == student.getId()){
//                studentList.set(i,student);
//                checkId = false;
//            }
//        }
//        if (checkId) {
//            studentList.add(student);
//        }
        if(findById(student.getId())!= null){
            int index = studentList.indexOf(findById(student.getId()));
            studentList.set(index,student);
        } else {
            studentList.add(student);
        }
    }

    @Override
    public Student findById(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id){
                return studentList.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId()==id){
                studentList.remove(i);
            }
        }
    }
}
