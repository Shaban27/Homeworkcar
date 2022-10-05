import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {

    public static void main(String[] args) {
        Car lada = new Car("Lada ", "Grande", 1.7, null, 2019, "России");
        Car audi = new Car("Audi ", null, 3.5, "черный", 2020, "Германии");
        Car bmw = new Car("BMW", "Z8", 3.5, "черный", 2021, "Германии");
        Car kia = new Car("Kia ", "Sportage 4 поколение", 1.6, "красный", 2018, "Южной Корее");

        Train train = new Train("Поезд Ласточка", "модель B-901", "2011 год выпуска", "в России",
                "скорость передвижения – 301 км/ч", "поезд отходит в 10:00 ч.", "от Белорусского вокзала",
                "и следует до станции Минск-Пассажирский.", "Цена поездки - 3500 рублей", "в поезде 11 вагонов");
        Train train1 = new Train("Поезд Ленинград", "модель D-125", "2019 год выпуска", "в России",
                "скорость передвижения – 270 км/ч,", "поезд отходит в 10:00 ч.", " от Ленинградского вокзала",
                "и следует до станции Ленинград-Пассажирский.", " поездки - 1700 рублей", "в поезде 8 вагонов.");

        Bus bus=new Bus("Ик-008","Икарус", "Россия, год выпуска", "2020", "красный", 301);
        Bus bus1=new Bus("ЖК-008","Дэу", "Россия, год выпуска", "2019", "синий", 301);


        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(train);
        printInfo(train1);
        printInfo(bus);
        printInfo(bus1);
    }

    private static void printInfo(Car car) {
        System.out.println("Марка автомобиля " + car.getBrand() + " модель " + car.getModel() +
               " цвет кузова " + car.getBodyColor() + "  объем двигателя - " + car.getEngineVolume()
                + "литра" + " год выпуска в -" + car.getYearOfIssue() + " год " + " коробка передач " + car.getTransmission() + " тип кузова "
                + car.getBodyType());
    }

    private static void printInfo(Train train) {
        System.out.println("Марка" + train.getBrand() + " модель" + train.getModel() + "год выпуска" + train.getYearOfIssue() + "страна производства " + train.getProductionCountry()
                + "максимальная скорость" + train.getMaximumMovementSpeed() + " время отправления" + train.getTravelTime() + "убытие от станции" + train.getDepartureStationName()
                + "прибфтие на станцию" + train.getEndingStation() + " Цена" + train.getTripPrace() + "Число вагонов" + train.getNumberOfWagons());
    }
    private static void printInfo(Bus bus) {
        System.out.println(("Марка" + bus.getBrand() +
                "модель" + bus.getModel() +
                "страна производства " + bus.getProductionCountry() +
                "год выпуска" + bus.getYearOfIssue() +
                "цвет" + bus.getBodyColor()
                + "максимальная скорость" + bus.getMaximumMovementSpeed()));

    }
}