package org.example;

import java.util.Random;

public class DairyCow extends Animal implements IMilkable {
    private static int MIN_CAPACITY =20;
    private static int MAX_CAPACITY =40;
    private int udderCapacity;
    Random rand = new Random();

    DairyCow(int id,String name ){
        super(id,name);//calls animal constructor
        int udderCapacity = (int) (Math.random() * ((MAX_CAPACITY - MIN_CAPACITY + 1) + MIN_CAPACITY));
        this.udderCapacity= udderCapacity;
    }

//    public int  setUdderCapacity(){
//        return udderCapacity;
//    }
//
//
//    public void  GetUdderCapacity(int udderCapacity){
//        this.udderCapacity=udderCapacity;
//    }



   public int milk(){
       return 0;

    }

    @Override
    public String toString() {
        return super.toString()+ ", Cow Udder Capacity ='" + udderCapacity +
                '}';
    }


}
