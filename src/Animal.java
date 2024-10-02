public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family,String name,int age,boolean isMammal){
        if(age >= 0){
            this.family = family;
            this.name = name;
            this.age = age;
        }
        else {System.out.println("il faut un age positif");}
    }
    void displayAnimal(){
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