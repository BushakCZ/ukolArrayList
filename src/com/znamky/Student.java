package com.znamky;

import java.util.ArrayList;

public class Student {

    private String name;

    public Student(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    ArrayList<Grade> znamka = new ArrayList<>();

    public void addGrade(Grade grade){
        znamka.add(grade);
    }

    public void showAllGrades(){
        znamka.forEach((znamka) -> System.out.println(znamka));
    }

}
