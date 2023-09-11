package com.co.models;

public class DataFormModels {
    private String name;
    private String lastname;
    private String age;
    private String email;
    private String salary;
    private String department;

    public DataFormModels(String name, String lastname, String age, String email, String salary, String department) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
        this.salary = salary;
        this.department = department;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


}
