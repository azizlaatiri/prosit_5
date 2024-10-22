package tn.esprit.gestionzoo.entities;

public class Zoo {
    private String name;
    private String city;
    private final int nbrCages = 25;
    private Animal[] animals;
    private int nbrAnimals;

    // Nouveau tableau pour les animaux aquatiques
    private Animal[] aquaticAnimals = new Animal[10];
    private int nbrAquaticAnimals;

    int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name == animal.name) {
                return i;
            }
        }
        return index;
    }

    int searchAquaticAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i].name == animal.name) {
                return i;
            }
        }
        return index;
    }

    public Zoo(String name, String city, int nbrCages) {
        if (!name.isEmpty()) {
            animals = new Animal[nbrCages];
            this.name = name;
            this.city = city;
        } else {
            System.out.println("Le nom doit être non vide");
        }
    }

    public void displayZoo() {
        System.out.println("Name: " + name + " " + "City: " + city + " " + "Number of cages: " + nbrCages);
        System.out.println("Animals in the zoo:");
    }
    public void addAquaticAnimal(Aquatiques aquatiques) {
        if (nbrAquaticAnimals < aquaticAnimals.length) {
            aquaticAnimals[nbrAquaticAnimals] = aquatiques;
            nbrAquaticAnimals++;
            System.out.println("Aquatic animal added: " + aquatiques.getName());
        } else {
            System.out.println("Cannot add more aquatic animals. The aquatic section is full.");
        }
    }


    @Override
    public String toString() {
        return ("Zoo name is: " + name + " City is: " + city + " Number of cages is: " + nbrCages);
    }

    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }

    public boolean isAquaticSectionFull() {
        return nbrAquaticAnimals >= aquaticAnimals.length;
    }

    public boolean AddAnimal(Animal animal) {
        if (searchAnimal(animal) != -1) {
            return false;
        }
        if (isZooFull()) {
            return false;
        }

        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }
    public void makeAquaticAnimalsSwim() {
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] != null) {
                ((Aquatiques) aquaticAnimals[i]).swim();
            }
        }
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;  // Valeur initiale pour la profondeur maximale
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];  // Cast de l'animal
                float depth = penguin.getMaxSwimmingDepth();  // Obtenir la profondeur
                if (depth > maxDepth) {
                    maxDepth = depth;  // Mettre à jour la profondeur maximale
                }
            }
        }
        return maxDepth;  // Retourner la profondeur maximale trouvée
    }
    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++; // Incrémente le compteur des dauphins
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++; // Incrémente le compteur des pingouins
            }
        }

        // Afficher les résultats
        System.out.println("Number of Dolphins: " + dolphinCount);
        System.out.println("Number of Penguins: " + penguinCount);
    }


    public boolean addAquaticAnimal(Animal animal) {
        if (searchAquaticAnimal(animal) != -1) {
            return false;
        }
        if (isAquaticSectionFull()) {
            return false;
        }

        aquaticAnimals[nbrAquaticAnimals] = animal;
        nbrAquaticAnimals++;
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

    public boolean removeAquaticAnimal(Animal animal) {
        int index = searchAquaticAnimal(animal);
        if (index == -1) {
            return false;
        }

        for (int i = index; i < nbrAquaticAnimals - 1; i++) {
            aquaticAnimals[i] = aquaticAnimals[i + 1];
        }

        nbrAquaticAnimals--;
        aquaticAnimals[nbrAquaticAnimals] = null;
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

    public Animal[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public int getNbrAquaticAnimals() {
        return nbrAquaticAnimals;
    }
}
