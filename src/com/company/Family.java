package com.company;

import java.util.ArrayList;

public class Family {


        ArrayList<Human> list = new ArrayList<>();

        public void addMember(Human human){
            list.add(human);
        }

        public void freeTime(){
            list.forEach((list) -> list.doSomething());
        }

        public void showAllMembers(){
            for (Human human : list){
                System.out.println(human.getName());
                System.out.println(human.getAge());
                System.out.println(human.getRole());
                System.out.println();
            }
        }

}
