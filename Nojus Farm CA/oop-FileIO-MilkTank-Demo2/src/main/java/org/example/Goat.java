package org.example;

public class Goat extends Animal implements IMilkable {
    private static int MIN_CAPACITY =2;
    private static int MAX_CAPACITY =3;
    int udderCapacity;

    Goat(int id,String name,int udderCapacity){
        super(id,name);//calls animal constructor
        this. udderCapacity = (int)(Math.random()*(MAX_CAPACITY-MIN_CAPACITY+1)+MIN_CAPACITY);
//        this.udderCapacity = new Random(MIN_CAPACITY,MAX_CAPACITY);

    }
    @Override
    public int milk() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+",Goat Udder Capacity ='" + udderCapacity +
                '}';
    }

}
