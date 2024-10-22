package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatiques {
    public float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    @Override
    public void displayAnimal() {
        super.displayAnimal();
        System.out.println("Swimming Speed: " + swimmingSpeed );
    }

    public String toString() {
        return super.toString() + ", Swimming Speed: " + swimmingSpeed + " m/s";
    }
    public void swim() {
        System.out.println("This  dolphin is swimming");
    }
}
