package baitap.business.implement;

import baitap.business.Design.CRUD;
import baitap.business.config.InputMethods;
import baitap.business.entity.Employee;

public class EmployeeImplement implements CRUD
{
    private  static Employee[] employeeList = new Employee[100];

    private static int size = 0;


    @Override
    public void create()
    {
        if (size == 100){
            System.err.println("mảng đầy");
        }else {

            Employee employee= new Employee();
            inputData(employee);
            employeeList[size]= employee;

        }
        size++;
    }
    public  Employee inputData(Employee employee)
    {
        System.out.println("Nhap ten nhan vien");
        employee.setEmployeeName(InputMethods.getString());
        System.out.println("Nhap ngày sinh NV");
        employee.setEmployeeBirthDate(InputMethods.getDate());
        System.out.println("Nhap địa chỉ");
        employee.setAddress(InputMethods.getString()) ;
        System.out.println("Nhap sđt");
        employee.setNumberPhone(InputMethods.getInteger()) ;
        System.out.println("Nhap luong nhan vien");
        employee.setEmployeeSalary(InputMethods.getDouble()) ;
        System.out.println("Nhap he so luong nhan vien");
        employee.setProductivityNum(InputMethods.getDouble());
        return employee;

    }

    @Override
    public void display()
    {
        if (size == 0){
            System.err.println("Mảng không có phần tử");
        }else {
            for (int i = 0; i < size; i++) {
                System.out.println(employeeList[i]);
            }
        }


    }

    @Override
    public void displayByID()
    {
        System.out.println("Nhap ID muon hien thi");
        int searchID = InputMethods.getInteger();
        for (int i = 0; i < size; i++)
        {
            if (searchID == employeeList[i].getEmployeeID())
            {
                System.out.println(employeeList[i]);
                break;
            }
            else {
                System.out.println("Khong tim thay ID muon hien thi");
            }
        }
    }

    @Override
    public void edit()
    {
        System.out.println("Nhap ID muon sua");
        int searchID = InputMethods.getInteger();
        for (int i = 0; i < size; i++)
        {
            if (searchID == employeeList[i].getEmployeeID())
            {
              inputData(employeeList[i]) ;
                break;
            }
            else {
                System.out.println("Khong tim thay ID muon hien thi");
            }
        }

    }

    @Override
    public void delete()
    {
        System.out.println("Nhap ID muon Xoa");
        int searchID = InputMethods.getInteger();
        for (int i = 0; i < size-1; i++)
        {
            if (searchID == employeeList[i].getEmployeeID())
            {
                for (int j = i; j < size ; j++)
                {
                    employeeList[i] = employeeList[i+1];
                }
            }
            else {
                System.out.println("Khong tim thay ID muon xoa");
            }
            employeeList[i] = null;
        }

    }

    @Override
    public void search()
    {
        System.out.println("Nhap ten muon tim");
        String searchName = InputMethods.getString();
        boolean check = false;
        for (int i = 0; i < size; i++)
        {
            if(employeeList[i].getEmployeeName().contains(searchName))
            {
                System.out.println(employeeList[i]);
                check= true;
            }

        }
        if (!check)
        {
                System.out.println("Khong co bai hat muon tim");

        }


    }

    @Override
    public void sort()
    {
        for (int i = 0; i <size; i++)
        {
            for (int j = i+1; j <size ; j++)
            {
                if (employeeList[i].getEmployeeName().compareTo(employeeList[j].getEmployeeName())>0)
                {
                    Employee temp = employeeList[i];
                    employeeList[i] = employeeList[j];
                    employeeList[j]= temp;

                }
            }
        }
    }
}
