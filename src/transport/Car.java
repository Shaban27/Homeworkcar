package transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private String engineVolume;
    private String color;
    private final String productionYear;
    private final String productionCountry;
    private String transmission;
    private String bodyTape;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean rubberSign;
    private Key key;
    private Insurance insurance;

        public Car (String brand, String model, String engineVolume,
                                    String color, String productionYear, String productionCountry, Key key,Insurance insurance){


        if (bodyTape == null) {
            this.bodyTape = "нет";
        } else {
            this.bodyTape = bodyTape;
        }
        if (registrationNumber == null) {
            this.registrationNumber = "х005хх00";
        } else {
            this.registrationNumber = registrationNumber;

            this.numberOfSeats = Integer.parseInt("5");
        }
        this.rubberSign = Boolean.parseBoolean("седан");

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


        this.engineVolume = engineVolume;

        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        this.productionYear = productionYear;


        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
            if (transmission == null) {
                this.transmission = "автомат";
            } else {
                this.transmission = transmission;
            }
        if (key == null) {
            this.key =  (key);
            }
        else {
            this.key = key;
        }
            if (key == null) {
                this.insurance =  (insurance);
            }
            else {
                this.insurance = insurance;

    }

    public String getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(String engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

        var transmission1 = transmission;
        public void setTransmission(String ) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean getRubberSign() {
        return rubberSign;
    }

    public void setRubberSign(boolean rubberSign) {
        this.rubberSign = rubberSign;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyTape() {
        return bodyTape;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void changeTyres (){
        rubberSign =!rubberSign;
        }
new Key();
    }}
public static class Key {
        private final boolean runEngin;
    private final boolean whithoutKey;

    public Key(boolean runEngin, boolean whithoutKey) {
        this.runEngin = runEngin;
        this.whithoutKey = whithoutKey;
    }
    public boolean isRunEngin() {     return runEngin;
    }
    public boolean isWhithoutKey() {    return whithoutKey;
    }
    public Key() {
        this(false, false);

    }
    private static  class insurance {
        private final LocalDate expireDate;
        private final double costs;
         private final String number;

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCosts() {
            return costs;
        }

        public String getNumber() {
            return number;
        }

        public insurance(LocalDate expireDate, double costs, String number) {
            if (expireDate==null) {
                this.expireDate = LocalDate.now().plusDays(180);
            } else {
                this.expireDate=expireDate;
            this.costs = costs;
            if (number ==null) {
                this.number="123456789";
            } else {
                this.number = number;

            }
            public void checkExpireDate () {
                    if ( expireDate.isBefore(LocalDate.now())) || expireDate.isEqual(LocalDate.now()) {
                        System.out.println("Новая страховка");
                          }
                public void checkNumber () {
                        if (number.length() !=9) {
                            System.out.println("Номер страховки некорректный");
                        }
                    }
        }}}}}













