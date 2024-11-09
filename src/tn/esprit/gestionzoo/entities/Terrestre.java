package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.interfaces.Omnivore;

public class Terrestre extends Animal implements Omnivore<Food>  {
    public int nbrLegs;

    public Terrestre(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(name + " eats meat.");
        } else {
            System.out.println(name + "  does not eat this type of food.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(name + " eats plants.");
        } else {
            System.out.println(name + "  does not eat this type of food.");
        }
    }

    @Override
    public void eatPlantAndMeet(Food food) {
        if (food == Food.BOTH) {
            System.out.println(name + " (terrestrial animal) eats both plants and meat.");
        } else {
            System.out.println(name + " (terrestrial animal) does not eat mixed food.");
        }
    }

    @Override
    public void displayAnimal() {
        super.displayAnimal();

        System.out.println(" le nombre de pattes"+nbrLegs );

    }


}