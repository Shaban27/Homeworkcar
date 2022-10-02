public class transprt {

    public String brand;
    public String model;
    private int yearOfIssue;
    private String productionCountry;
    public String bodyColor;
    public int maximumMovementSpeed;

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

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
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

    public int getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public void setMaximumMovementSpeed(int maximumMovementSpeed) {
        this.maximumMovementSpeed = maximumMovementSpeed;
    }

    public transprt(String brand, String model, int yearOfIssue, String productionCountry, String bodyColor, int maximumMovementSpeed) {
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.productionCountry = productionCountry;
        this.bodyColor = bodyColor;
        this.maximumMovementSpeed = maximumMovementSpeed;



    }
}




        //if (model == null) {
        //    this.model = "значение указано корректно";
       // } else {
       //     this.model = model;




//- Марка
//       - Модель
//    - Год выпуска
//   - Страна производства
//  - Цвет кузова
// - Максимальная скорость передвижения