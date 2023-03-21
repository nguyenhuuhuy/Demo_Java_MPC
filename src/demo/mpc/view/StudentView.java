package demo.mpc.view;

import demo.mpc.config.Config;
import demo.mpc.controller.StudentController;
import demo.mpc.model.Student;

import javax.sound.midi.MidiDevice;
import java.util.List;

public class StudentView {
    StudentController studentController = new StudentController();
    List<Student> studentList = studentController.showListStudent();


    public void showTableStudent(){
        System.out.println("********************STUDENT MANAGE****************************");

            System.out.println("===ID===NAME===AGE===");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("   " + studentList.get(i).getId()+"   " + studentList.get(i).getName()+"   " + studentList.get(i).getAge());
        }
        System.out.println("Enter back to comback Menu");
        String backMenu = Config.scanner().nextLine();
        if (backMenu.equalsIgnoreCase("back")){
        new Main();
        }

    }
    public void createStudentForm() {
        while (true){
        int id = studentController.showListStudent().get(studentController.showListStudent().size()-1).getId()+1;
        System.out.println("Enter the name: ");
        String name = Config.scanner().nextLine();
        System.out.println("Enter the age: ");
        int age = Config.scanner().nextInt();
        Student student = new Student(id,name,age);
        studentController.createStudent(student);
        System.out.println("Create success!");
        System.out.println("Enter any key to continue create student or quit to comeback Menu!");
        String backMenu = Config.scanner().nextLine();
        if (backMenu.equalsIgnoreCase("quit"));
        new Main();
        break;
        }
    }

    public void deleteStudent() {
        System.out.println("Chọn tên muốn xóa");
        int getId = Config.scanner().nextInt();
        List<Student> studentList = studentController.showListStudent();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == getId ) {
                studentList.remove(i);
                break;
            }
        }
        this.showTableStudent();
        System.out.println("Enter back to comback Menu");
        String backMenu = Config.scanner().nextLine();
        if (backMenu.equalsIgnoreCase("back")){
            new Main();
        }
    }

    public void editStudent() {
        System.out.println("nhập id sinh viên cần sửa: ");
        int id = Integer.parseInt(Config.scanner().nextLine());
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id){
                studentList.get(i).toString();
            }
        }
        System.out.println("Nhập tên mới: ");
        String newName = Config.scanner().nextLine();
        System.out.println("Nhập tuổi mới: ");
        int newAge = Integer.parseInt(Config.scanner().nextLine());
        Student student = new Student(id,newName,newAge);
        studentController.createStudent(student);
        System.out.println("Enter back to comback Menu");
        String backMenu = Config.scanner().nextLine();
        if (backMenu.equalsIgnoreCase("back")){
            new Main();
        }
    }
}
