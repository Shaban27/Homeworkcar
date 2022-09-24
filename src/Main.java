public class Main {

    public static void main(String[] args) {
        Car lada = new Car("Lada ", "Grande", "1,7", null, "2015", "России");
        Car audi = new Car("Audi ", null, "3,0", "черный", "2020", "Германии");
        Car bmw = new Car("BMW", "Z8", "3,0", "черный", "2021", "Германии");
        Car kia = new Car("Kia ","Sportage 4 поколение","1.6","красный","2018","Южной Корее");
        Car hyundai = new Car(null,"Avante ","1,6","оранжевый","2016", null);

        System.out.println("Марка автомобиля " + lada.brand + "модель " + lada.model
                + " год выпуска " + lada.productionYear + " сборка в " + lada.productionCountry
                + " цвет " + lada.color + "  объем двигателя - " + lada.engineVolume);

        System.out.println("Марка автомобиля " + audi.brand + "модель " + audi.model
                + " год выпуска " + audi.productionYear + " сборка в " + audi.productionCountry
                + " цвет " + audi.color + "  объем двигателя  " + audi.engineVolume + " литра");

        System.out.println("Марка автомобиля " + bmw.brand + "модель " + bmw.model +
                " сборка в " + bmw.productionCountry
                + " год выпуска в  " + bmw.productionYear + " году" +
                " цвет кузова " + bmw.color + "  объем двигателя - " + bmw.engineVolume);

        System.out.println("Марка автомобиля " + kia.brand + "модель " + kia.model
                + " год выпуска " + kia.productionYear + " сборка в " + kia.productionCountry
                + " цвет кузова " + kia.color + "  объем двигателя - " + kia.engineVolume);

        System.out.println("Марка автомобиля " + hyundai.brand + " модель " + hyundai.model +
                " сборка в " + hyundai.productionCountry + " цвет кузова " + hyundai.color + "  объем двигателя - " + hyundai.engineVolume + "литра"
                + " год выпуска в -" + hyundai.productionYear + " год");


        // - Lada Grande, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя - 1,7
        //- Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя 3.0 литра
        //- BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем – 3.0
        // - Kia Sportage 4 Sportage 4, 2018 год выпуска, сборка в Южной Корее, цвет кузова красный, объем двигателя – 2,4 литра.
        // - Hyundai Avante, сборка в Южной Корее, цвет кузова оранжевый, объем двигателя - 1,6 литра, год выпуска - 2016 год.
        // brand, model, engineVolume, color, productionYear, productionCountry
    }
}