package tn.esprit.gestionzoo.entities;

// Déclaration de la classe Aquatiques comme abstraite
public abstract class Aquatiques extends Animal {
    private String habitat;

    public Aquatiques(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
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
