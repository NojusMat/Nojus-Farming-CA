package org.example;

import java.util.ArrayList;
public class Shed {
    public ArrayList<Animal> animalList;
    public MilkTank tank;
    public MilkingMachine milkingMachine;

    public Shed(MilkTank tank) {
        this.tank =tank;
        this.animalList = new ArrayList<>();

    }
    public installMilkingMachine (MilkingMachine m){

        this.milkingMachine = m;
    }


     public MilkingMachine() {
        for (Animal animal : animalList) {
            if (animal instanceof IMilkable) {
                MilkingMachine.milk(IMilkable);
                int totalMilk +=amount;
            }
        }
    }

         public milkAllAnimals(){
            for(Animal animal: animallist) {
                if(animal instanceof IMilkable) {
                    this.milkingMAchine.milk(animal);
                    
            }
                
        }
    }
    
        public String toString () {
            return "Shed{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}

