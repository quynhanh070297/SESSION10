package baitap.business.entity;

import java.util.Date;

public class Employee
{
    private static int employeeCount = 0;
    private int employeeID;
    private String employeeName;
    private Date employeeBirthDate;
    private String address;
    private int numberPhone;
    private double employeeSalary;
    private double productivityNum;

    public Employee()
    {

        this.employeeID = ++employeeCount;
    }

    public Employee(int employeeID, String employeeName, Date employeeBirthDate, String address, int numberPhone, double employeeSalary, double productivityNum)
    {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeBirthDate = employeeBirthDate;
        this.address = address;
        this.numberPhone = numberPhone;
        this.employeeSalary = employeeSalary;
        this.productivityNum = productivityNum;
    }

    public int getEmployeeCount()
    {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount)
    {
        this.employeeCount = employeeCount;
    }

    public int getEmployeeID()
    {
        return employeeID;
    }

    public void setEmployeeID(int employeeID)
    {
        this.employeeID = employeeID;
    }

    public String getEmployeeName()
    {
        return employeeName;
    }

    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;
    }

    public Date getEmployeeBirthDate()
    {
        return employeeBirthDate;
    }

    public void setEmployeeBirthDate(Date employeeBirthDate)
    {
        this.employeeBirthDate = employeeBirthDate;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public int getNumberPhone()
    {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone)
    {
        this.numberPhone = numberPhone;
    }

    public double getEmployeeSalary()
    {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary)
    {
        this.employeeSalary = employeeSalary;
    }

    public double getProductivityNum()
    {
        return productivityNum;
    }

    public void setProductivityNum(double productivityNum)
    {
        this.productivityNum = productivityNum;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", employeeName='" + employeeName + '\'' +
                ", employeeBirthDate=" + employeeBirthDate +
                ", address='" + address + '\'' +
                ", numberPhone=" + numberPhone +
                ", employeeSalary=" + employeeSalary +
                ", productivityNum=" + productivityNum +
                '}';
    }
}
