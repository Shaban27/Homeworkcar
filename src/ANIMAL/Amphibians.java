package ANIMAL;

import java.util.Objects;

public class Amphibians extends Animals {
    public String livingEnvironment;

    public Amphibians (String nickName, int years, String livingEnvironment) {
        super(nickName, years);
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }
    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amphibians)) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(getLivingEnvironment(), that.getLivingEnvironment());
    }

    @Override
    public void graze() {

    }

    @Override
    public void walk() {

    }
    @Override
        public void hunt() {
             System.out.println("охотиться");
        }

    @Override
    public void fly() {

    }

    @Override
    public String toString() {
        return "Amphibians{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", nickName='" + nickName + '\'' +
                ", years=" + years +
                '}';
    }
}


