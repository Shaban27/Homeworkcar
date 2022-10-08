package ANIMAL;

import java.util.Objects;

public abstract class birds extends Animals {
    public String livingEnvironment;
    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    public birds(String nickName, int years, String livingEnvironment) {
        super(nickName, years);
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    @Override
    public void hunt() {
        System.out.println("охотиться");
    }

    @Override
    public void walk() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof birds)) return false;
        if (!super.equals(o)) return false;
        birds birds = (birds) o;
        return Objects.equals(getLivingEnvironment(), birds.getLivingEnvironment());
    }

    }






