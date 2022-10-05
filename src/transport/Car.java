package transport;

public class Car extends Transport {


    private Double engineVolume;
    private String transmission;
    private final String bodyType;




    public Car(String brand,
              String model,
               Double engineVolume,
               String bodyColor,
               String yearOfIssue,
               String productionCountry) {
        super(model, brand, bodyColor, yearOfIssue, productionCountry);
        if (engineVolume == null) {
            this.engineVolume = 1.6;
        } else {
            this.engineVolume = engineVolume;
        }
         this.bodyType = "хэтчбек";
        this.transmission = "автомат";
           }

      public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }
        public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "автомат";
        } else {
            this.transmission = transmission;
        }
    }


    public Double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }


    }




























