class Employee {
    private String name;
    private double salary;
    public Employee(String name,double initialSalary)
    {
        this.name=name;
        setSalary(initialSalary);
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double newSalary)
    {
        if(newSalary>=0)
        {
            this.salary=newSalary;
        }
        else
        {
            System.out.println("Error: Salary cannot be negative! Keeping old value.");
        }
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Employee emp=new Employee("Alice",50000);
        System.out.println("Employee Name:"+emp.getName());
        System.out.println("Initial Salary: $"+emp.getSalary());
        emp.setSalary(65000);
        System.out.println("Updated Salary: $"+emp.getSalary());
        emp.setSalary(-500);
        System.out.println("Salary after invalid update: $"+emp.getSalary());
    }
}