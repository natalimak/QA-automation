package hw5;

import java.util.ArrayList;

public class Hw5_3_main {
    public static void main(String[] args) {
    Dog dog1=new Dog("Rexi", "black", 3);
    Dog dog2=new Dog("Sukki", "white", 0);

    ArrayList<Dog> list=new ArrayList<Dog>(); //creating new generic arraylist type Dog
        list.add(dog1);
        list.add(dog2);
      //print only dog2
        System.out.println("Dog2: "+list.get(1).name+ ","+list.get(1).color+","+list.get(1).age);

      //print only dog1
        System.out.println("Dog1: "+list.get(0).name+ ","+list.get(0).color+","+list.get(0).age);

        //print all in list
        for (Dog dog:list)
            System.out.println(dog.getName());

        //print List size
        System.out.println("List size: " + list.size());

        list.clear();

        //print List size after clean of list
        System.out.println("New List size: "+list.size());

        }


    }

