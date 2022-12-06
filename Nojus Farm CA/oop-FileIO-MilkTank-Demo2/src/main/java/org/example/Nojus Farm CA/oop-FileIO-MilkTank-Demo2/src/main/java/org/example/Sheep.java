package org.example;
public class Sheep extends Animal{

    private String pedigree;
    private double weight;
    private int age;

    public Sheep( String name,String pedigree,double weight,int age) {
        super(name,pedigree,weight,age);
        this.pedigree = pedigree;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String generateName() {
        return null;
    }

//    @Override
//    public String toString() {
//        // call superclass toString method to get Shape details
//        return super.toString() + "[ id = " + this.getId() + "] "
//                + "[ pedigree = " + this.pedigree+ "] "
//                +" [ weight ="+this.weight+"]"
//                +" [ age ="+this.age+"]";
//    }


}

