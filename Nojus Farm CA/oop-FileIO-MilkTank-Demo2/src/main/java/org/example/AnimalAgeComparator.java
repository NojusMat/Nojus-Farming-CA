package org.example;
import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {
    public int compare(Animal animal1, Animal animal2) {

        if (animal1.getAge() < animal2.getAge()) {
            return -1;
        } else if (animal1.getAge() == animal2.getAge()) {
            return 0;
        } else {
            return 1;
        }
    }
}
