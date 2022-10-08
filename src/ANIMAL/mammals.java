package ANIMAL;

public abstract class mammals extends Animals {

    public String livingEnvironment;
    public int speedOfMovement;

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    public int getSpeedOfMovement() {
        return speedOfMovement;
    }

    public void setSpeedOfMovement(int speedOfMovement) {
        this.speedOfMovement = speedOfMovement;
    }

    public mammals(String nickName, int years, String livingEnvironment, int speedOfMovement) {
        super(nickName, years);
        if (livingEnvironment!=null && !livingEnvironment.isEmpty()&&!livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }else {
            this.livingEnvironment = livingEnvironment;
        }
        this.speedOfMovement = speedOfMovement;
    }



    @Override
    public void walk() {System.out.println("гулять");






    }
    }
