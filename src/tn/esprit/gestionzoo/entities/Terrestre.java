package tn.esprit.gestionzoo.entities;

public class Terrestre extends Animal {
    public int nbrLegs;

    public Terrestre(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public void displayAnimal() {
        super.displayAnimal();

        System.out.println(" le nombre de pattes"+nbrLegs );

    }

}