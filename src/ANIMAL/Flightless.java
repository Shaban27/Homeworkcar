package ANIMAL;

import java.util.Objects;

public class Flightless extends birds {
    @Override
    public String toString() {
        return "Flightless{" +
                "movement='" + movement + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", nickName='" + nickName + '\'' +
                ", years=" + years +
                '}';
    }

    public String movement;

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flightless)) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(getMovement(), that.getMovement());
    }

    @Override
    public void graze() {

    }

    @Override
    public int hashCode() {
        return Objects.hash(getMovement());
    }

    public Flightless(String nickName, int years, String livingEnvironment, String movement) {
        super(nickName, years, livingEnvironment);
        this.movement = movement;
    }

    @Override
    public void fly() {
    }

    @Override
    public void walk() {
        System.out.println("гулять");
    }
}


