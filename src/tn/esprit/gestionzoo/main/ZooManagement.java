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
        Aquatiques Aqua = new Aquatiques("mmm", "ddd", 8, true, "lk");
        Terrestre Terrrsta = new Terrestre("ssss", "ffff", 3, false, 87);


        dolphin.displayAnimal();
        penguin.displayAnimal();
        Aqua.displayAnimal();
        Terrrsta.displayAnimal();
        dolphin.swim();
        Aqua.swim();




    }



}