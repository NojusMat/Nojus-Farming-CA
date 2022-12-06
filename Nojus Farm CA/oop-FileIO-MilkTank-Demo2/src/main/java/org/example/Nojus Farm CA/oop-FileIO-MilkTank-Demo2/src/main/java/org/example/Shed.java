package org.example;

import java.util.ArrayList;
public class Shed {
    public ArrayList<Animal> animalList;
    public MilkTank tank;
    public MilkingMachine milkingMachine;

    private String shedName;

    public Shed(String shedName, MilkTank tank) {
        this.shedName = shedName;
        this.tank =tank;
        this.animalList = new ArrayList<>();

    }
    public void installMilkingMachine (MilkingMachine m1){

        this.milkingMachine = m1;
    }

         public void milkAllAnimals(){
             Animal[] animallist = new Animal[0];
             for(Animal animal: animallist) {
                if(animal instanceof IMilkable) {
                    this.milkingMachine.milk((IMilkable)animal);
            }
        }
    }
        @Override
        public String toString () {
            return "Shed{" +
                    " Name ='" + shedName + '\'' +
                    ",Animals =" + animalList +
                    ", Tanks =" + tank +
                    '}';
        }
    }


