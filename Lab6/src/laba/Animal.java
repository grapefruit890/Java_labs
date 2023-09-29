package laba;

public class Animal implements Nameble {
    private String name;
    private String animalType;

    public Animal(String animalType, String name) {
        this.animalType = animalType;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
