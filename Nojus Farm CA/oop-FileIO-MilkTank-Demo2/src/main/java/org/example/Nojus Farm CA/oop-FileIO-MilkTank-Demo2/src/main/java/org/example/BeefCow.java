package org.example;

import java.util.Random;

public class BeefCow extends Animal {

    private String pedigree;
    private double weight;
    private int age;

    public BeefCow( String name,String pedigree,double weight,int age) {
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
//        public String generateName() {
//            Random rand = new Random();
//            String name = name[rand.nextInt(goatNames)];
//            System.out.println(name);
//            return name;
        return null;
    }
//
//    @Override
//    public String toString() {
//        // call superclass toString method to get Shape details
//        return super.toString() + "[ pedigree = " + this.pedigree + "] "
//                + " [ weight =" + this.weight + "]"
//                + " [ age =" + this.age + "]";
//    }
}