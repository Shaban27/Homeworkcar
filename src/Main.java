import ANIMAL.Amphibians;
import ANIMAL.Flightless;
import ANIMAL.Flying;
import ANIMAL.Herbivorous;
import ANIMAL.Predator;
import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {

    public static void main(String[] args) {
        Car lada = new Car("Lada ", "Grande", "1.7", null, "2019", "России");
        Car audi = new Car("Audi ", null, "3.5", "черный", "2020", "Германии");
        Car bmw = new Car("BMW", "Z8", "3.5", "черный", "2021", "Германии");
        Car kia = new Car("Kia ", "Sportage 4 поколение", "1.6", "красный", "2018", "Южной Корее");

        Train train = new Train("Поезд Ласточка", " B-901", "2011 год выпуска", "в России ",
                "скорость передвижения – 301 км/ч", "поезд отходит в 10:00 ч.", "от Белорусского вокзала",
                "и следует до станции Минск-Пассажирский.", "поездки - 3500 рублей", "в поезде 11 вагонов");
        Train train1 = new Train("Поезд Ленинград", "модель D-125", "2019 год выпуска", "в России ",
                "скорость передвижения 270 км/ч", "поезд отходит в 10:00 ч.", " от Ленинградского вокзала",
                "и следует до станции Ленинград-Пассажирский.", " поездки - 1700 рублей", "в поезде 8 вагонов.");

        Bus bus = new Bus("Ик-008", "Икарус", "2020", "красный", "Россия", "301");
        Bus bus1 = new Bus("ЖК-008", "Дэу", "2019", "синий", "Россия", "301");

        Amphibians amphibians = new Amphibians("лягушка", 2, "болото");
        Amphibians amphibians1 = new Amphibians("уж пресноводный", 3, "в лесу");

        Flying flying = new Flying("чайка", 1, "на причале", "летает");
        Flying flying1 = new Flying("альбатрос", 1, "на скале", "летает");
        Flying flying2 = new Flying("сокол", 2, "в поле", "летаеь");

        Flightless flightless = new Flightless("павлин", 1, "в дворце", "не летает");
        Flightless flightless1 = new Flightless("пингвин", 2, "В Антарктиде", "не латает, а плавает");
        Flightless flightless2 = new Flightless("птица ДОДО", 0, "вымерли", "никогда не летала");

        ANIMAL.Herbivorous herbivorous = new ANIMAL.Herbivorous("Газель", 1, "в Африке", 120, "травоядный");
        ANIMAL.Herbivorous herbivorous1 = new ANIMAL.Herbivorous("Жираф", 5, "в Африке", 50, "травоядный");
        ANIMAL.Herbivorous herbivorous2 = new ANIMAL.Herbivorous("лошадь", 1, "в поле", 120, "травоядный");

        ANIMAL.Predator predator = new ANIMAL.Predator("Гиена", 6, "в Африке", 40, "хищник");
        ANIMAL.Predator predator1 = new ANIMAL.Predator("Тигр", 2, "в тайге", 100, "хищник");
        ANIMAL.Predator predator2 = new ANIMAL.Predator("Медведь", 10, "в тайге", 50, "всеядный");


        printInfo(lada);
        lada.refill();
        printInfo(audi);
        audi.refill();
        printInfo(bmw);
        bmw.refill();
        printInfo(kia);
        kia.refill();
        printInfo(train);
        train.refill();
        printInfo(train1);
        train1.refill();
        printInfo(bus);
        bus.refill();
        printInfo(bus1);
        bus1.refill();
        printInfo(amphibians);
        printInfo(amphibians1);
        amphibians.eat();
        amphibians.run();
        amphibians.sleep();
        amphibians.hunt();
        printInfo(flying);
        printInfo(flying1);
        printInfo(flying2);
        flightless.eat();
        flightless.run();
        flightless.sleep();
        flightless.hunt();
        flightless.fly();
        printInfo(flightless);
        printInfo(flightless1);
        printInfo(flightless2);
        flightless.eat();
        flightless.run();
        flightless.sleep();
        flightless.eat();
        flightless.hunt();
        flightless.walk();
        printInfo(herbivorous);
        printInfo(herbivorous1);
        printInfo(herbivorous2);
        herbivorous.eat();
        herbivorous.run();
        herbivorous.sleep();
        herbivorous.walk();
        herbivorous.graze();
        printInfo(predator);
        printInfo(predator1);
        printInfo(predator2);
        predator.eat();
        predator.run();
        predator.sleep();
        predator.walk();
        predator.hunt();
    }

    private static void printInfo(Predator predator) {
        System.out.println(predator);
    }

    private static void printInfo(ANIMAL.Herbivorous herbivorous) {
        System.out.println(herbivorous);
    }

    private static void printInfo(Flightless flightless) {
        System.out.println(flightless);
    }

    private static void printInfo(Flying flying) {
        System.out.println(flying);

    }

    private static void printInfo(Amphibians amphibians) {
        System.out.println(amphibians);
    }

    private static void printInfo(Car car) {
        System.out.println("марка" + car.getBrand() + " модель " + car.getModel() +
                " цвет кузова " + car.getBodyColor() + "  объем двигателя - " + car.getEngineVolume()
                + "литра" + " год выпуска в -" + car.getYearOfIssue() + " год " + " коробка передач " + car.getTransmission() + " тип кузова "
                + car.getBodyType());
    }

    private static void printInfo(Train train) {
        System.out.println("марка" + train.getBrand() + " модель " + train.getModel() + " год выпуска " + train.getYearOfIssue() + " страна производства " + train.getProductionCountry()
                + " скорость передвижения –  " + train.getMaximumMovementSpeed() + " время отправления" + train.getTravelTime() + "убытие от станции " + train.getDepartureStationName()
                + "прибфтие на станцию" + train.getEndingStation() + " Цена" + train.getTripPrace() + " Число вагонов " + train.getNumberOfWagons());
    }

    private static void printInfo(Bus bus) {
        System.out.println(bus);

    }


    }
