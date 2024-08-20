package LabAssignment1;
import java.util.*;

public class Clinic {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //
        PetRecord petFile = new PetRecord();
        Pet pet;
        //
        boolean x = true;
        while(x){
            System.out.println("[1]Dog [2]Cat [3]Exit");
            System.out.print("Choose your pet: ");
            int choice = sc.nextInt();
            //
            switch(choice){
                case 1: pet = new Dog();
                    petFile.setPetID("D01");
                    petFile.setPetName("Becca");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("Aspin");
                    //
                    System.out.println("Pet id is " + petFile.getPetID());
                    System.out.println("Pet name is " + petFile.getPetName());
                    System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                    System.out.println("Communication sound: "+ petFile.getPet().makeSound());
                    System.out.println("Play mode: " + petFile.getPet().play());
                    System.out.println("Breeed: " + ((Dog) pet).getBreed());
                    System.out.println();
                    break;
                case 2: pet = new Cat();
                    petFile.setPetID("C01");
                    petFile.setPetName("Salem");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoLives(9);
                    //
                    System.out.println("Pet id is " + petFile.getPetID());
                    System.out.println("Pet name is " + petFile.getPetName());
                    System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                    System.out.println("Communication sound: "+ petFile.getPet().makeSound());
                    System.out.println("Play mode: " + petFile.getPet().play());
                    System.out.println("No.lives: "+((Cat) pet).getNoLives());
                    System.out.println();
                    break;
                case 3:
                    x = false;
                    System.exit(69);
                default:
                    System.out.println("Invalid Choice... Choose again");
            }
        }
    }
}
