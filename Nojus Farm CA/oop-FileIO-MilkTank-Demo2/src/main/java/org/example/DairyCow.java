package org.example;

import java.util.Random;

public class DairyCow extends Animal implements IMilkable {
    private static int MIN_CAPACITY =20;
    private static int MAX_CAPACITY =40;
    private int udderCapacity;

//    private int cowNames;
//    String name [] ={"Bob","Dylan","Steven","Daisy","Kevin","Jack","Patrick","Albert","Jose","Spotty","Mary","Susan"};
//


    DairyCow(int id,String name,String pedigree,double weight,int age ){
        super(id,name,pedigree,weight,age);//calls animal constructor
        int udderCapacity = (int) (Math.random() * ((MAX_CAPACITY - MIN_CAPACITY + 1) + MIN_CAPACITY));
        this.udderCapacity= udderCapacity;
    }

   public int milk(){
        Random r =new Random();
        int random=r.nextInt(MAX_CAPACITY)+MIN_CAPACITY;
       return random;
       // generate random number here

    }

//    public RandomGenerator(){
//        cowNames=12;
//    }

    @Override
    public String generateName(){
//        Random rand = new Random();
//        String name = name[rand.nextInt(cowNames)];
//        System.out.println(name);
//        return name;
        return null;
    }


    @Override
    public String toString() {
        return super.toString()+ ", Cow Udder Capacity ='" + udderCapacity +
                '}';
    }


}
