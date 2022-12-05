//package org.example;
//import java.sql.SQLOutput;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//public class MainApp {
//
//    public static void main(String[] args)
//    {
//        System.out.println( "Abstract Class Animal" );
//        MainApp theApp = new MainApp();
//        theApp.start();
//    }
//
//
//    private void start() {
//
//
//        List<Animal> animalList = new ArrayList<>();
//        System.out.println("All the animals");
//        animalList.add(new DairyCow(1,"Dylan","Sorthi",800.45,10));
//        animalList.add(new Goat(2,"Greg","HillBilly",40.00,60));
//        animalList.add(new BeefCow(3,"John","Sorthi",370.78,12));
//        animalList.add(new Sheep(4,"Paul","Hampshire",45.05,8));
//
//        System.out.println("\nAnimals in original order ");
//        display(animalList);
//
////        System.out.println("\nSort By weight");
////        AnimalWeightComparator weightComparator = new AnimalWeightComparator();
////        Collection.sort(animalList,weightComparator);
////        display(animalList);
//
//    }
//
//
//
//
//
//    public void display( List<Animal> animals )
//    {
//        for (Animal animal: animals) { System.out.println(animal); }
//    }
//}
//
