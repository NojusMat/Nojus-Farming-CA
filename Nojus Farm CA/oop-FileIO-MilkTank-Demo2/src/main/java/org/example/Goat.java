package org.example;

import java.util.Random;

public class Goat extends Animal implements IMilkable {
    private static int MIN_CAPACITY =2;
    private static int MAX_CAPACITY =3;

//    private int goatNames;
//    String name [] ={"Fred","Noah","Steven","Colin","Kevin","Aaron","Patrick","Matthew","Jose","Hairy","Mary","Paul"};
//
//

    int udderCapacity;

    Goat(int id,String name,String pedigree,double weight,int age ){
        super(id,name,pedigree,weight,age);//calls animal constructor
        int udderCapacity = (int) (Math.random() * ((MAX_CAPACITY - MIN_CAPACITY + 1) + MIN_CAPACITY));
        this.udderCapacity= udderCapacity;
    }

//    public RandomGenerator(){
//        goatNames=12;
//    }

    @Override
    public String generateName() {
//        Random rand = new Random();
//        String name = name[rand.nextInt(goatNames)];
//        System.out.println(name);
//        return name;
        return null;
    }

    @Override
    public int milk(){
        Random r =new Random();
        int random=r.nextInt(MAX_CAPACITY)+MIN_CAPACITY;
        return random;
        // generate random number here

    }
    @Override
    public String toString() {
        return super.toString()+",Goat Udder Capacity ='" + udderCapacity +
                '}';
    }

}
