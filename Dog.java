package LabAssignment1;

public class Dog implements Pet{

    private String breed;
    //
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    //
    Dog(){
    }
    //
    @Override
    public String makeSound() {
        return "Arf Arf!!";
    }
    public String play(){
        return "Catching/pursuing moving objects";
    }
}
