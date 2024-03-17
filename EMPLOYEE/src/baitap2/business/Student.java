package baitap2.business;

public class Student
{

    private String name;
    private int age;

    private String add;

    public Student()
    {
    }
    public Student(String name, int age, String add)
    {
        this.name = name;
        this.age = age;
        this.add = add;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getAdd()
    {
        return add;
    }

    public void setAdd(String add)
    {
        this.add = add;
    }
}