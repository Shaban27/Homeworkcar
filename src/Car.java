public class Car {
    String brand;
    String model;
    String engineVolume;
    String color;
    String productionYear;
    String productionCountry;

    public Car(String brand, String model, String engineVolume, String color, String productionYear, String productionCountry) {
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

        }


    }

