package LabAssignment1;

public class Cat implements Pet{

    private int noLives;
    //
    public int getNoLives() {
        return noLives;
    }
    public void setNoLives(int noLives) {
        this.noLives = noLives;
    }
    //
    @Override
    public String makeSound() {
        return "Meow Meow!!";
    }
    public String play(){
        return "Catching/pursuing moving objects";
    }
}

