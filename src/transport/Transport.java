package transport;


import java.time.LocalDate;

public class Transport {

    public String brand;
    public String model;
    public String yearOfIssue;
    protected String productionCountry;
    public String bodyColor;
    public int maximumMovementSpeed;

    public Transport(String brand, String model, String yearOfIssue, String productionCountry, String bodyColor) {
        this.brand = brand;
        if (brand == null) ;
        {
            this.model = model;
            this.yearOfIssue = yearOfIssue;
            this.productionCountry = productionCountry;
            this.bodyColor = bodyColor;
            if (maximumMovementSpeed >= 0) {
                this.maximumMovementSpeed = 270;
            } else {
                this.maximumMovementSpeed = maximumMovementSpeed;
            }
        }}

        public String getBrand () {
            return brand;
        }

        public void setBrand (String brand){
            this.brand = brand;
        }

        public String getModel () {
            return model;
        }

        public void setModel (String model){
            this.model = model;
        }

        public String getYearOfIssue () {
            return yearOfIssue;
        }

        public void setYearOfIssue (String yearOfIssue){
            this.yearOfIssue = yearOfIssue;
        }

        public String getProductionCountry () {
            return productionCountry;
        }

        public void setProductionCountry (String productionCountry){
            this.productionCountry = productionCountry;
        }

        public String getBodyColor () {
            return bodyColor;
        }

        public void setBodyColor (String bodyColor){
            this.bodyColor = bodyColor;
        }

        public int getMaximumMovementSpeed () {
            return maximumMovementSpeed;
        }

    public void setMaximumMovementSpeed (int maximumMovementSpeed){


        }

    }







