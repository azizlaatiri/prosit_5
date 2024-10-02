import java.util.Scanner;

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




    }


}