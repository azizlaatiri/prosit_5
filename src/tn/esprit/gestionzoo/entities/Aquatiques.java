package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.interfaces.Carnivore;

public abstract class Aquatiques extends Animal implements Carnivore<Food> {
    private String habitat;

    public Aquatiques(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println(name + " (aquatic animal) eats meat.");
        } else {
            System.out.println(name + " (aquatic animal) does not eat this type of food.");
        }
    }

    // Méthode abstraite swim()
    public abstract void swim();  // Obligatoirement redéfinie dans les classes filles

    @Override
    public void displayAnimal() {
        super.displayAnimal();
        System.out.println("L'habitat : " + habitat);
    }

    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Aquatiques)) {
            return false;
        }
        Aquatiques other = (Aquatiques) obj;

        return this.name.equals(other.name) &&
                this.age == other.age &&
                this.habitat.equals(other.habitat);
    }


}
