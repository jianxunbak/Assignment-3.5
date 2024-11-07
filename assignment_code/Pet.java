package assignment_code;

public class Pet {
    // instance fields
    private String name;
    private String breed;
    private String gender;
    private int age;
    private boolean isVaccinated;

    // no arg constructor
    public Pet() {
    }

    // all arg constructor
    public Pet(String name, String breed, String gender, int age, boolean isVaccinated) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.isVaccinated = isVaccinated;
    }

    // public methods
    public void sound(String voice) {
        for (int i = 1; i <= 3; i++) {
            System.out.print(voice + " ");
        }
        System.out.print("\n");

    }

    public void food(String food) {
        System.out.println(this.name + " loves eating " + food);
    }

    public void sleep() {
        System.out.println(this.name + " is currently sleeping");
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

}
