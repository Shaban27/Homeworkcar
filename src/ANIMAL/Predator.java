package ANIMAL;

import java.util.Objects;

public class Predator extends mammals {
    public String typeOffood;

    public String getTypeOffood() {
        return typeOffood;
    }

    public void setTypeOffood(String typeOffood) {
        this.typeOffood = typeOffood;
    }

    @Override
    public void hunt() {
        System.out.println("Охотиться");

    }

    @Override
    public void fly() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Predator)) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return Objects.equals(getTypeOffood(), predator.getTypeOffood());
    }

    @Override
    public void graze() {

    }


    @Override
    public String toString() {
        return "Predator{" +
                "typeOffood='" + typeOffood + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", speedOfMovement=" + speedOfMovement +
                ", nickName='" + nickName + '\'' +
                ", years=" + years +
                '}';
    }

    public Predator(String nickName, int years, String livingEnvironment, int speedOfMovement, String typeOffood) {
        super(nickName, years, livingEnvironment, speedOfMovement);
        if (typeOffood!=null && !typeOffood.isEmpty()&&!typeOffood.isBlank()) {
            this.typeOffood = typeOffood;
        }else {
            this.typeOffood = typeOffood;
        }}}





