import transport.Car;

public class Main {

    public static void main(String[] args) {
        Car lada = new Car("Lada ", "Grande", 1.7, null, 2015, "России"); lada.setRegistrationNumber("х452хх280");
        Car audi = new Car("Audi ", null, 3.5, "черный", 2020, "Германии");
        Car bmw = new Car("BMW", "Z8", 3.5, "черный", 2021, "Германии");
        Car kia = new Car("Kia ", "Sportage 4 поколение", 1.6, "красный", 2018, "Южной Корее");
        Car hyundai = new Car(null, "Avante ", 1.6, "оранжевый", 2016, null);

        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyundai);

    }
    private static void printInfo (Car car) {
        System.out.println("Марка автомобиля " + car.getBrand() + " модель " + car.getModel() +
                " сборка в " + car.getProductionYear()+ " цвет кузова " + car.getColor() + "  объем двигателя - " + car.getEngineVolume()
                + "литра" + " год выпуска в -" + car.getProductionYear() + " год " + " коробка передач " + car.getTransmission() + " тип кузова "
                + car.getBodyType() + " регистрационный номер " + car.getRegistrationNumber()+ " количество мест " + car.getNumberOfSeats () + " зимняя " +car.isSeasonTyres()
        + car.getKey()+  "доступ с ключом" + car.getKey()+
                "удаленный запусу" + "номер страховки:" + car.getInsurance());


        // - Lada Grande, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя - 1,7
        //- Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя 3.0 литра
        //- BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем – 3.0
        // - Kia Sportage 4 Sportage 4, 2018 год выпуска, сборка в Южной Корее, цвет кузова красный, объем двигателя – 2,4 литра.
        // - Hyundai Avante, сборка в Южной Корее, цвет кузова оранжевый, объем двигателя - 1,6 литра, год выпуска - 2016 год.
        // brand, model, engineVolume, color, productionYear, productionCountry
    }
}