package ANIMAL;

import java.util.Objects;

public class Flying extends birds {
    public Flying(String nickName, int years, String livingEnvironment, String movement) {
        super(nickName, years, livingEnvironment);
        this.movement = movement;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public String movement;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flying)) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(getMovement(), flying.getMovement());
    }

    @Override
    public void graze() {

    }


    @Override
    public String toString() {
        return "Flying{" +
                "movement='" + movement + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", nickName='" + nickName + '\'' +
                ", years=" + years +
                '}';
    }

    public void fly() {
        System.out.println("летать");

    }
}
