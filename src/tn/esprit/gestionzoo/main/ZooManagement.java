package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Aquatiques;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Terrestre;





public class ZooManagement {



    public static void main(String[] args ){



        Animal lion = new Animal("chat","Simba",9,false);
        // lion.family= "Felidae";
        //lion.name= "Simba";
        //lion.age= 12;
        //lion.isMammal= true;
        // System.out.println("Name: "+lion.name+ "Age: "+lion.age+" IsMammal :"+lion.isMammal);
        lion.displayAnimal();
        System.out.println(lion);
        System.out.println(lion.toString());


        Zoo myZoo = new Zoo("Belvedere","Tunis",25);
        //myZoo.animal= lion;
        //  myZoo.city= "Tunis";
        // myZoo.name = "Belvedere";
        //  myZoo.nbrCages=25;
        //  System.out.println("Zoo name is :" +myZoo.name +"City is :" +myZoo.city + "Number of cages is :" +myZoo.nbrCages);

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        Animal tiger = new Animal("Felidae", "Shere Khan", 5, true);
        System.out.println(myZoo.AddAnimal(tiger));
        System.out.println(myZoo.AddAnimal(lion));
        System.out.println(myZoo.AddAnimal(tiger));
        System.out.println(myZoo.AddAnimal(tiger));


        System.out.println(myZoo.removeAnimal(tiger));
        System.out.println(myZoo.removeAnimal(lion));
        System.out.println(myZoo.removeAnimal(tiger));
        System.out.println(myZoo.removeAnimal(tiger));
        System.out.println(myZoo.removeAnimal(tiger));
        if (myZoo.isZooFull()) {
            System.out.println("The zoo is full.");
        } else {
            System.out.println("The zoo is not full.");
        }
        Dolphin dolphin = new Dolphin("mmm", "ddd", 8, true, "lk", 15);
        Penguin penguin = new Penguin("ssss", "ffff", 3, false, "lk", 30);
        Terrestre Terrrsta = new Terrestre("ssss", "ffff", 3, false, 87);
        Aquatiques fish = new Penguin("Bird", "Fish", 8, true, "Ocean", 20.0f); // Exemple d'un pingouin
        Aquatiques shark = new Dolphin("Fish", "Shark", 8, false, "Sea", 100.0f); // Exemple d'un requin
        Aquatiques fish1 = new Penguin("Bird", "Penguin1", 5, true, "Antarctic", 20.0f);
        Aquatiques fish2 = new Penguin("Bird", "Penguin1", 5, true, "Antarctic", 20.0f);
        Aquatiques fish3 = new Penguin("Bird", "Penguin2", 3, true, "Antarctic", 25.0f);
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(shark);




        dolphin.displayAnimal();
        penguin.displayAnimal();
        Terrrsta.displayAnimal();
        dolphin.swim();
        myZoo.addAquaticAnimal(fish);
        myZoo.addAquaticAnimal(fish1);
        myZoo.addAquaticAnimal(fish2);
        myZoo.addAquaticAnimal(fish3);
        myZoo.addAquaticAnimal(penguin);

        myZoo.makeAquaticAnimalsSwim();
        float maxDepth = myZoo.maxPenguinSwimmingDepth();
        System.out.println("The maximum swimming depth of the penguins is: " + maxDepth + " meters.");
        myZoo.displayNumberOfAquaticsByType();
        System.out.println(fish1.equals(fish2)); 
        System.out.println(fish1.equals(fish3));





    }



}