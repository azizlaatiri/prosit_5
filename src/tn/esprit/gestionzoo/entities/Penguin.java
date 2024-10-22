package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatiques {
    private float maxSwimmingDepth; // Renomme l'attribut pour plus de clarté

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float maxSwimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.maxSwimmingDepth = maxSwimmingDepth; // Initialisation de la profondeur maximale
    }

    // Getter pour la profondeur maximale de nage
    public float getMaxSwimmingDepth() {
        return maxSwimmingDepth;
    }

    @Override
    public void displayAnimal() {
        super.displayAnimal();
        System.out.println("Maximum Swimming Depth: " + maxSwimmingDepth + " meters");
    }

    @Override
    public String toString() {
        return super.toString() + ", Maximum Swimming Depth: " + maxSwimmingDepth + " meters";
    }

    @Override
    public void swim() {
        System.out.println("The penguin is swimming gracefully in the ocean!");
    }
}
