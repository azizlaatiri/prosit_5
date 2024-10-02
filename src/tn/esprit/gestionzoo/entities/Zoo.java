package tn.esprit.gestionzoo.entities;

public class Zoo {
    private String name;
    private String city;
    private final int nbrCages = 25;
    private Animal[] animals;
    private int nbrAnimals;
    int searchAnimal(Animal animal){
        int index = -1;
        for(int i = 0; i < nbrAnimals; i++){
            if(animals[i].name == animal.name)
                return i;
        }
        return index;
    }

    public Zoo(String name,String city, int nbrCages){
        if(name != ""){
            animals = new Animal[nbrCages];
            this.name = name;
            this.city = city;
        }
        else {System.out.println("le nom doit etre non vide");}
    }
    public void displayZoo(){
        System.out.println("Name: " + name +" "+"City: "+city+" "+"Number of cages: "+nbrCages);
        System.out.println("Animals in the zoo:");

    }
    @Override

    public String toString(){
        return  ("Zoo name is :" +name +"City is :" +city + "Number of cages is :" +nbrCages);


    }
    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }
    public boolean AddAnimal(Animal animal) {
        if (searchAnimal(animal) != -1) {
            return false;
        }
        if (isZooFull()) {
            return false;
        }
        if (nbrAnimals >= nbrCages) {
            return false;
        }

        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false;
        }

        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }

        nbrAnimals--;
        animals[nbrAnimals] = null;
        return true;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else if (z1.nbrAnimals < z2.nbrAnimals) {
            return z2;
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

}
