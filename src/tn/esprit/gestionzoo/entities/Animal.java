package tn.esprit.gestionzoo.entities;
public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        try {
            if (age < 0) {
                throw new IllegalArgumentException("L'âge doit être positif.");
            }
            this.family = family;
            this.name = name;
            this.age = age;
            this.isMammal = isMammal;

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayAnimal(){
        System.out.println("Name: " + name +" "+"Family: "+family+" "+"Age: "+age+ "isMAmmal: "+isMammal);
    }
    @Override
    public String toString(){
        return  ("Name: "+name+ "Age: "+age+" IsMammal :"+isMammal);
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setAge(int age) {

                this.age = age;


    }


    public void setName(String name) {
        this.name = name;
    }
}
