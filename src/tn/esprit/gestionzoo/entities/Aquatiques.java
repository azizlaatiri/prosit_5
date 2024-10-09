package tn.esprit.gestionzoo.entities;

public class Aquatiques extends Animal {
    public String habitat;

    public Aquatiques(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    public void displayAnimal() {
        super.displayAnimal();

        System.out.println(" l'habitat"+habitat );
    }
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }
    public void swim() {
        System.out.println("This aquatic animal is swimming");
    }
}

