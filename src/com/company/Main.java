package com.company;

public class Main {
    public static void main(String[] args) {
        Human Father = new Man("Petr", 85, "Father");
        Human Mother = new Woman("Eva", 75, "Mother");
        Human Son = new Man("Tomas", 45, "Son");
        Human Daughter = new Woman("Marka", 25, "daughter");

        Family myFamily = new Family();

        myFamily.addMember(Father);
        myFamily.addMember(Mother);
        myFamily.addMember(Son);
        myFamily.addMember(Daughter);

        myFamily.freeTime();
        System.out.println();
        myFamily.showAllMembers();
    }
}
