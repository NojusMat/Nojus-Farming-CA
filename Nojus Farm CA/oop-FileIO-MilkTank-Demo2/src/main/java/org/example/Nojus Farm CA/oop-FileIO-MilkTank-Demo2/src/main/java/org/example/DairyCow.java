package org.example;

import java.util.Random;

public class DairyCow extends Animal implements IMilkable {
    private static int MIN_CAPACITY =20;
    private static int MAX_CAPACITY =40;

    private static int range = MAX_CAPACITY - MIN_CAPACITY+1;

//    private static int MIN_ID =1000;
//    private static int MAX_ID =2000;

    private int udderCapacity;
//    private int randomId;


    DairyCow(String name,String pedigree,double weight,int age ){
        super(name,pedigree,weight,age);//calls animal constructor
        int udderCapacity = (int) (Math.random() * range + MIN_CAPACITY);
        this.udderCapacity= udderCapacity;
//        int randomId = (int) (Math.random() * (MAX_ID-MIN_ID+1)+MIN_ID);
//        this.randomId = randomId;
    }


   public int milk(){
        Random r =new Random();
        int random=r.nextInt(MAX_CAPACITY-MIN_CAPACITY)+MIN_CAPACITY;
       return random;
       // generate random number here

    }

//    private RandomGenerator(){
//        cowNames=12;
//    }
//    private static int cowNames;
//    String names [] ={"Bob","Dylan","Steven","Daisy","Kevin","Jack","Patrick","Albert","Jose","Spotty","Mary","Susan"};
//
//
//
//
    public String generateName(){
//        Random rand = new Random();
//        String names = names[rand.nextInt(cowNames)];
//        System.out.println(names);
//        return names;
        return null;
    }




    @Override
    public String toString() {
        return super.toString()+ ", Cow Udder Capacity ='" + udderCapacity +
                '}';
    }


}
