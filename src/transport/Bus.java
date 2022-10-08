package transport;

public class Bus extends Transport{

    public Bus(String model, String brand,  String  yearOfIssue,String productionCountry, String bodyColor, String maximumMovementSpeed) {
        super(model, brand, productionCountry,  yearOfIssue, maximumMovementSpeed);
        this.bodyColor = bodyColor;
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
