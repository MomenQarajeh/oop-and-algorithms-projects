package employeeapp;

public class Employee {
    private String name;
    private Date hireDate;
    private double salary;

    public Employee() {
        name = "someone";
        hireDate = new Date();
        salary = 2000;
    }

    public Employee(String name, Date hireDate, double salary) {
        this.name = name;
        this.hireDate = hireDate;
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary > 0 ? salary : 2000;
    }

    public String getEmployee() {
        return "Name: " + getName() + "\nHire Date: " + getHireDate().getDate() 
                + "\nMonthly salary: " + getSalary();
    } 
}
