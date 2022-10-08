package transport;

public class Car extends Transport {


    private String engineVolume;
    private String transmission;
    private String bodyType;

    public Car(String brand, String model, String engineVolume, String bodyColor, String yearOfIssue, String productionCountry) {
        super(model, brand, yearOfIssue, productionCountry, bodyColor);
        if (engineVolume == null) {
            this.engineVolume = "1.6";
        } else {
            this.engineVolume = engineVolume;
            this.transmission = "автомат";
            this.bodyType = "хэтчбек";
        }


    }

    public void setEngineVolume(String engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "автомат";
        } else {
            this.transmission = transmission;
        }
    }


    public String getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }



        @Override
        public void refill () {
            System.out.println("Заправлять бензином на заправке");
        }
    }





























