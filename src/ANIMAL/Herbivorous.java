package ANIMAL;

import java.util.Objects;

public class Herbivorous extends mammals{
    public String typeOffood;

    public Herbivorous(String nickName, int years, String livingEnvironment, int speedOfMovement, String typeOffood) {
        super(nickName, years, livingEnvironment, speedOfMovement);
        this.typeOffood = typeOffood;
    }

    @Override
    public void hunt() {

    }

    @Override
    public void fly() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Herbivorous)) return false;
        if (!super.equals(o)) return false;
        Herbivorous that = (Herbivorous) o;
        return Objects.equals(typeOffood, that.typeOffood);
    }


    @Override
    public String toString() {
        return "Herbivorous{" +
                "еypeOffood='" + typeOffood + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", speedOfMovement=" + speedOfMovement +
                ", nickName='" + nickName + '\'' +
                ", years=" + years +
                '}';
    }

    @Override
    public void graze() {System.out.println("пастись");

    }
}



