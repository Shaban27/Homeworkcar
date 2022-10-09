package transport;

public class Bus extends Transport{

    public Bus(String brand, String model, String yearOfIssue, String bodyColor, String productionCountry, String maximumMovementSpeed) {
        super(brand, model, yearOfIssue, bodyColor, productionCountry);
      this.maximumMovementSpeed = maximumMovementSpeed;
    }

    @Override
    public void refill() {
        System.out.println("Заправлять бензином");
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfIssue='" + yearOfIssue + '\'' +
                ", productionCountry='" + productionCountry + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", maximumMovementSpeed='" + maximumMovementSpeed + '\'' +
                '}';
    }
}
