package transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private Double engineVolume;
    private String color;
    private final Integer productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean seasonTyres;
    private Key key;
    private Insurance insurance;


    public Car(String brand,
               String model,
               Double engineVolume,
               String color,
               Integer productionYear,
               String productionCountry) {

        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (engineVolume == null) {
            this.engineVolume = 1.6;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (productionYear == null) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        this.bodyType = "хэтчбек";
        this.numberOfSeats = 5;
        this.transmission = "автомат";
        this.registrationNumber = "х000хх000";
        this.seasonTyres = true;
        this.key = key;
        this.insurance = insurance;
        }


    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "автомат";
        } else {
            this.transmission = transmission;
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public void setSeasonTyres(boolean seasonTyres) {
        this.seasonTyres = seasonTyres;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isSeasonTyres() {
        return seasonTyres;
    }

    public void changeTyres() {
        seasonTyres = !seasonTyres;

    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public boolean isCorrectRegNumber() {
        //х000хх000
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !!Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isAlphabetic(chars[1]) && Character.isAlphabetic(chars[2]) && Character.isAlphabetic(chars[3]) &&
                Character.isAlphabetic(chars[6]) && Character.isAlphabetic(chars[7]) && Character.isAlphabetic(chars[8]);

    }

      public static class Key {
        private final boolean runEngin;
        private final boolean whithoutKey;




        public boolean isRunEngin() {
            return runEngin;
        }

        public boolean isWhithoutKey() {
            return whithoutKey;
        }

        public Key(boolean runEngin, boolean whithoutKey) {
            this.runEngin = runEngin;
            this.whithoutKey = whithoutKey;

        }
    }


    private static class Insurance {
        private final LocalDate expireDate;
        private final double costs;
        private String number;

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCosts() {
            return costs;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public Insurance(LocalDate expireDate, double costs, String number) {
            this.expireDate = expireDate;
            if (expireDate.isBefore(LocalDate.now())) {
                System.out.println("Новая страховка");
                //  this.expireDate = LocalDate.now().plusDays(180);
            }
            this.costs = costs;

            if (number.length() < 9) {
                System.out.println("Номер страховки некорректный");
                this.number = number;
            }}
            public Insurance() {
                this(null, 5_000, null);
            }

        }

    }






















