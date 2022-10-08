package ANIMAL;

import java.util.Objects;

public abstract class Animals {

    public String nickName;
    public int years;

    public void eat() {
        System.out.println("Кушать");
    }

    public void run() {
        System.out.println("Перемещаться");
    }


    public void sleep() {
        System.out.println("Спать");
    }


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {

    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public Animals(String nickName, int years) {
        if (nickName != null && !nickName.isEmpty() && !nickName.isBlank()) {
            this.nickName = nickName;
        } else {
            this.nickName = nickName;
        }
        this.years = years;
    }

    public abstract void hunt();


    public abstract void fly();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animals)) return false;
        Animals animals = (Animals) o;
        return getYears() == animals.getYears() && Objects.equals(getNickName(), animals.getNickName());
    }

    public abstract void graze();
    public abstract void walk();
}





