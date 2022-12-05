package org.example;

import java.util.ArrayList;
import java.util.List;
public abstract class Animal {

    private int id;
    private String name;
    private String pedigree;
    private double weight;

    private int age;

    public Animal(int id, String name,String pedigree,double weight,int age) {
        this.id = id;
        this.name = name;
        this.pedigree = pedigree;
        this.weight = weight;
        this.age = age;

    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }


    public int getId() {
        return id;}

    public void setId(int id)
    {
        this.id=id;
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
                "Animal: " +
                " ID: " +id+ '\'' +
                ", Name: " + name +'\'' +
                ", Pedigree: " + pedigree +'\'' +
                ", Weight: " + weight +'\'' +
                ", Age: " + age +'\'' +
                '}';
    }


}
