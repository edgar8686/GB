package Lesson5;

public class Employee {
    private String firstLastName;
    private String position;
    private String email;
    private String  numberPhone;
    private double salary;
    private int age;

    public Employee(String firstLastName, String position, String email, String  numberPhone,
                    double salary, int age) {
        this.firstLastName = firstLastName;
        this.position = position;
        this.email = email;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.age = age;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String  getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void consoleEmployee() {
        System.out.println(firstLastName + ", " + position + ", " + email + ", " + numberPhone + ", " + salary + ", " + age);
    }

}
