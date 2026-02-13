//Inheritance Basics
//public class Person name, phone, email;

//class
//Employee
//title
//employer
//employeeGrade
//salary
//toString (print all values including those of Person)

public class Person {
    private String name;
    private String phone;
    private String email;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
