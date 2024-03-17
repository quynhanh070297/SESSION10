package baitap.run;

import baitap.business.Design.CRUD;
import baitap.business.config.InputMethods;
import baitap.business.implement.EmployeeImplement;

public class ImployeeManager
{
    public static CRUD employee = new EmployeeImplement();


    public static void main(String[] args)
    {
        while (true)
        {
            System.out.println("***************MENU***************");
            System.out.println("1.Thêm mới nhân viên");
            System.out.println("2.Hiển thị danh sách nhân viên");
            System.out.println("3.Xem thông tin theo mã nhân viên");
            System.out.println("4.Cập nhật thông tin nhân viên");
            System.out.println("5.Xoá nhân viên theo tên ");
            System.out.println("6.Tìm kiếm nhân viên theo (Tương đối)");
            System.out.println("7.Sắp xếp và hiển thị danh sách nhân viên theo tên từ a-z");
            System.out.println("8.Thoát");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    employee.create();
                    break;
                case 2:
                    employee.display();
                    break;
                case 3:
                    employee.displayByID();
                    break;
                case 4:
                    employee.edit();
                    break;
                case 5:
                    employee.delete();
                    break;
                case 6:
                    employee.search();
                    break;
                case 7:
                    employee.sort();
                    break;
                case 8:
                    System.out.println("Thoat");
                    return;
                default:
                    System.out.println("Nhap sai");


            }
        }
    }
}
