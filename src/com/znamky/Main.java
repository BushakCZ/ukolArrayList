package com.znamky;

public class Main {

    public static void main(String[] args) {
        Teacher myTeacher = new Teacher("Honza");
        Student myStudent = new Student("Petr");
        Grade myGrade = new Grade("Kruznice", "Pro", 5, myTeacher);

        myStudent.addGrade(myGrade);
        myStudent.showAllGrades();
    }
}
