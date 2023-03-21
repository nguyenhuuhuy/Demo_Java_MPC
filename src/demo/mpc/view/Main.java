package demo.mpc.view;

import demo.mpc.config.Config;

public class Main {
    public Main() {
        System.out.println("***************************STUDENT MANAGE********************************");
        System.out.println("1. Show list Student");
        System.out.println("2. Create Student");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Sort Student By Name");
        byte chooseMenu;
        while (true){
            try {
                chooseMenu = Byte.parseByte(Config.scanner().nextLine());
                break;
            } catch (NumberFormatException Err){
                System.out.println(Err);
            }
        }
        switch (chooseMenu) {
            case 1:
                new StudentView().showTableStudent();
                break;
            case 2:
                new StudentView().createStudentForm();
                break;
            case 3:
                new StudentView().editStudent();
            case 4:
                new StudentView().deleteStudent();
                break;
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
