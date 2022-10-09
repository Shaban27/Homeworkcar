package transport;


public abstract class Transport {

    public String brand;
    public String model;
    public String yearOfIssue;
    protected String productionCountry;
    public String bodyColor;
    public String maximumMovementSpeed;



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(String yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public String getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public void setMaximumMovementSpeed(String maximumMovementSpeed) {
        this.maximumMovementSpeed = maximumMovementSpeed;
    }

    public Transport(String brand, String model, String yearOfIssue, String productionCountry, String bodyColor) {
        this.brand = brand;
        this.model = model;
        if (yearOfIssue == null) {
            this.yearOfIssue = yearOfIssue;
        } else {
            this.yearOfIssue = yearOfIssue;
        }
        if (productionCountry != null && !productionCountry.isEmpty() && !productionCountry.isBlank()) {
            this.productionCountry = productionCountry;
        } else {
            this.productionCountry = productionCountry;
        }
        if (maximumMovementSpeed != null && !maximumMovementSpeed.isEmpty() && !maximumMovementSpeed.isBlank()) {
            this.maximumMovementSpeed = getMaximumMovementSpeed();
        } else {
            this.maximumMovementSpeed = this.maximumMovementSpeed;
        }
        if (bodyColor != null && !bodyColor.isEmpty() && !bodyColor.isBlank()) {
            this.bodyColor = bodyColor;
        } else {
            this.bodyColor = bodyColor;

        }
    }





    public abstract void refill();
}