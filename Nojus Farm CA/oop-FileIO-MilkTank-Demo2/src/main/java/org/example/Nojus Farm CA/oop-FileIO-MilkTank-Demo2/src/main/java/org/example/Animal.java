package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public abstract class Animal {
    private String name;
    private String pedigree;
    private double weight;

    private static int MIN_ID =1000;
    private static int MAX_ID =10000;
    private int randomId;

    private int age;

    public Animal( String name,String pedigree,double weight,int age) {
       this.name = name;
        this.pedigree = pedigree;
        this.weight = weight;
        this.age = age;
        int randomId = (int) (Math.random() * (MAX_ID-MIN_ID+1)+MIN_ID);
        this.randomId = randomId;

    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }



    public void setPedigree(String pedigree) {
    }


    public void setWeight(double weight) {
    }

    public void setAge(int age) {
    }

    public abstract String generateName();

    public String toString() {
        return this.getClass().getName() +
                ": " +
                " ID: " +randomId+ '\'' +
//                ", Name: " + name +'\'' +
                ", Pedigree: " + pedigree +'\'' +
                ", Weight: " + weight +'\'' +
                ", Age: " + age +'\''
                ;
    }


}
