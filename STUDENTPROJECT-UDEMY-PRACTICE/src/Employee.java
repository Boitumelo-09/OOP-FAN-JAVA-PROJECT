
//Inheritance Basics
//public class Person name, phone, email;
//Student
//college
//class
//Employee
//title

//employeeGrade
//salary
//toString (print all values including those of Person)

public class Employee extends Person {
    private String employeeJobTitle;
    private String employeeGrade;
    private double employeeSalary;


    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }



    public String getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(String employeeGrade) {
        this.employeeGrade = employeeGrade.toUpperCase();
    }



    public String getEmployeeJobTitle() {
        return employeeJobTitle;
    }

    public void setEmployeeJobTitle(String employeejobTitle) {
        this.employeeJobTitle = employeejobTitle;
    }


    @Override
    public String toString() {
        return "----- Employee Details -----" +
                "\nName : "+getName() +
                "\nPhone : "+getPhone()+
                "\neMail : "+getEmail() +
                "\nJob Title : "+getEmployeeJobTitle()+
                "\nSalary : "+getEmployeeSalary() +
                "\nGrade : "+getEmployeeGrade() ;
    }
}
