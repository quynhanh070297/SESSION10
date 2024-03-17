
package baitap2.run;

import baitap2.business.Student;

public class StudentManager {

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.startApplication();

    }

    public void startApplication() {
        // Khởi tạo sinh viên
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        //Nhập thông tin cho sinh viên
        student1.setName("Nguyễn Văn Nam");
        student1.setAge(19);
        student1.setAdd("HN");
        displayName(student1);
        student2.setName("Trần Thùy Trang");
        student2.setAge(18);
        student2.setAdd("TH");
        student3.setName("Tống Mạnh Hùng");
        student3.setAge(18);
        student3.setAdd("ND");


        //Hiển thị thông tin sinh viên
        displayName(student2);
        displayName(student3);
    }

    private void displayName(Student student) {
        System.out.println("------------------------------------------");
        System.out.println("     Thông tin Sinh Viên");

        System.out.println("Tên Sinh Viên : " + student.getName());
        System.out.println("Tuổi          : " + student.getAge());
        System.out.println("Địa chỉ       : " + student.getAdd());

    }
}


