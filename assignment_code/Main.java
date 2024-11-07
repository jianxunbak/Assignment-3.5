package assignment_code;

public class Main {
    public static void main(String[] args) {
        // Cat
        Pet cat = new Pet("Luna", "Maine Coon", "Female", 3, true);
        System.out.println("Cat's name is " + cat.getName());
        System.out.println(cat.getName() + " is " + cat.getAge() + " years old");
        System.out.println(cat.getName() + "'s breed is " + cat.getBreed());
        System.out.println(cat.getName() + " is " + (cat.isVaccinated() ? "vacinnated" : "not vacinnated"));
        cat.sound("Meow");
        cat.food("Salmon");
        cat.sleep();

        // Dog
        Pet dog = new Pet("Max", "Golden Retriver", "Male", 5, false);
        System.out.println("\nDog's name is " + dog.getName());
        System.out.println(dog.getName() + " is " + dog.getAge() + " years old");
        System.out.println(dog.getName() + "'s breed is " + dog.getBreed());
        System.out.println(dog.getName() + " is " + (dog.isVaccinated() ? "vacinnated" : "not vacinnated"));
        dog.sound("Woof");
        dog.food("Peanut butter");
        dog.sleep();
    }

}
