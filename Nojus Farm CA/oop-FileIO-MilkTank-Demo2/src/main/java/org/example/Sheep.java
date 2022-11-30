package org.example;
public class Sheep extends Animal{

    private String pedigree;
    private double weight;
    private int age;

    public Sheep(int id, String name,String pedigree,double weight,int age) {
        super(id, name);
        this.pedigree = pedigree;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String getPedigree() {
        return pedigree;
    }

    @Override
    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int getAge() {return age;
    }
    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        // call superclass toString method to get Shape details
        return super.toString() + "[ pedigree = " + this.pedigree+ "] "
                +" [ weight ="+this.weight+"]"
                +" [ age ="+this.age+"]";
    }


}

