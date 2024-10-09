package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatiques {
    public float swimmingDepth;


    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    public void displayAnimal() {
        super.displayAnimal();
        System.out.println("Swimming Depth: " + swimmingDepth );

    }
    public String toString() {
        return super.toString() + ", Swimming Depth: " + swimmingDepth + " meters";
    }}