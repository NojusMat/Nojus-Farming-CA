package org.example;

import java.util.ArrayList;
import java.util.List;
public abstract class Animal {
    private ArrayList<Animal> animalList;
    private int id;
    private String name;
    public Animal(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public void add(Animal a) {
        this.animalList.add(a);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }


    public int getId() {
        return id;}

    public void setId(int id){
        this.id=id;
    }

    public String getPedigree() {

        return null;
    }
    public void setPedigree(String pedigree) {
    }

    public double getWeight() {

        return 0;
    }
    public void setWeight(double weight) {
    }


    public int getAge() {
        return 0;
    }
    public void setAge(int age) {
    }

    public String toString() {
        return this.getClass().getName() +
                "Animal{" +
                "ID: ='" +id+ '\'' +
                ", Name ='" + name +
                '}';
    }


}
