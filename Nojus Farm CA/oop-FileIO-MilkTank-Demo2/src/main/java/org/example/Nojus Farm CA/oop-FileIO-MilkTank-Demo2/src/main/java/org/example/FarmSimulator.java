package org.example;

import java.util.ArrayList;
import java.util.List;

public class FarmSimulator {

    public static void main(String[] args)
    {
        FarmSimulator theApp = new FarmSimulator();
        theApp.start();
    }

    private void start() {


        List<Animal> animalList = new ArrayList<>();
        System.out.println("All the animals");
        animalList.add(new DairyCow("Dylan","Sorthi",800.45,10));
        animalList.add(new DairyCow("Betsy","Angus",842.45,15));
        animalList.add(new DairyCow("Mary","Sorthi",750.55,5));
        animalList.add(new DairyCow("Sarah","Angus",698.57,4));
        animalList.add(new Goat("Greg","HillBilly",40.00,6));
        animalList.add(new BeefCow("Bob","Sorthi",370.78,12));
        animalList.add(new Sheep("Paul","Hampshire",45.05,8));

        display(animalList);

//        System.out.println("\nSort By weight");
//        AnimalWeightComparator weightComparator = new AnimalWeightComparator();
//        Collection.sort(animalList,weightComparator);
//        display(animalList);

        MilkTank tank1 = new MilkTank();

        String MilkTank = "";
        Shed Shed1 = new Shed(MilkTank,tank1);
        MilkingMachine m1 = new MilkingMachine();
        Shed1.installMilkingMachine(m1);
        Shed1.milkAllAnimals();



    }






    public void display( List<Animal> animals )
    {
        for (Animal animal: animals) { System.out.println(animal); }
    }
}
