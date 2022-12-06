package org.example;

public class MilkingMachine {
    private MilkTank milkTank;
    public MilkingMachine(){
    }
    public double milk (IMilkable animal) {
        int amount = animal.milk();
        milkTank.addMilkToTank(amount);
        return 0;
    }

    static Object getMilkTank(){

        Object amount = new Object();
        return amount;
    }
    void setMilkTank(MilkTank tank){
        this.milkTank=tank;

    }




}


