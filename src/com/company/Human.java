package com.company;

public class Human {

    private String name;
    private int age;
    private String role;

    public Human(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public void doSomething(){
        System.out.println("Working");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
