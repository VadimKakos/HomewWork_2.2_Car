package transport;

import transport.Car;

import java.security.Key;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Car grande = new Car("Lada", null, 1.7, "жёлтый", 2015, "Россия", 130, "auto", "Hatchback", "x000xx00", 5, "летняя");
        printAuto(grande);
        Car audi = new Car("audi", "A8 50 L TDI quattro", 0, "чёрный", 2020, "Германия", 130, "auto", "Hatchback", "x000xx00", 5, "летняя");
        printAuto(audi);

        Car bmw = new Car("BMW", "Z8", 3.0, "чёрный", 0, "Германия", 130, "auto", "Hatchback", "x000xx00", 5, "летняя");
        printAuto(bmw);

        Car kia = new Car(null, "Sportage", 2.4, "красный", 2018, "Южная Корея", 130, "auto", "Hatchback", "x000xx00", 5, "летняя");
        printAuto(kia);

        Car hyundai = new Car("Hyundai", "Avante", 1.6, null, 2016, "Южная Корея", 130, "auto", "Hatchback", "x000xx00", 5, "летняя");
        printAuto(hyundai);

        System.out.println(grande.getTires());
        grande.changeTyre();
        System.out.println(grande.getTires());

        grande.new Key("удалённый запуск двигателя", "бесключевой доступ");
        audi.new Insurance(2023, 13000, 123456789);
        bmw.new Insurance(2023, 13000, 123456789);
        kia.new Insurance(2023, 13000, 123456789);
        hyundai.new Insurance(2023, 13000, 123456789);

        hyundai.getInsurance();


        Train firstTrain = new Train("Ласточка", "B-901", 2011,"Россия",null, 301,
                3500, 0, "Белорусский вокзал", "Минск-Пассажирский", 11);

        Train secondTrain = new Train("Ленинград", "D-125", 2019,"Россия",null, 270,
                1700, 0, "Ленинградский вокзал", " Ленинград-Пассажирский", 8);

        printTrain(firstTrain);
        printTrain(secondTrain);


        Bus firstBus = new Bus("НефАЗ", "5299", 2000, "Россия", "", 100);
        Bus secondBus = new Bus("ЛиАЗ", "4293", 2015, "Россия", "", 110);
        Bus thirdBus = new Bus("НефАЗ", "4208", 1989, "Россия", "", 80);

        printBus(firstBus);
        printBus(secondBus);
        printBus(thirdBus);

        firstBus.refill();
        firstTrain.refill();
        bmw.refill();


    }

    public static void printAuto(Car auto) {
        System.out.println("Марка машины " + auto.getBrand() + "," + " модель " + auto.getModel() + "," + " объём двигателя " + auto.getEngineVolume() + " литров " + " цвет кузова " + auto.getColor() + "," + " год производства " + auto.getProductionYear() + "," + " страна сборки " + auto.getProductionCountry() + " максимальная скорость " + auto.getMaxSpeed() + " коробка передач " + auto.getTransmission() + "," + " кузов " + auto.getBody() + "," + " гос. номер " + auto.getIdNumber() + "," + " количество мест " + auto.getSeatsNumber() + "," + " резина " + auto.getTires());
    }

    public static void printTrain(Train train) {
        System.out.println("Тип поезда " + train.getBrand() + " модель " + train.getModel() + " год производства " + train.getProductionYear() + " страна производства " + train.getProductionCountry()
                + " цвет поезда " + train.getColor() + " максимальная скорость " + train.getMaxSpeed() + " цена поездки " + train.getCostOfTravel() + " время поездки " + train.getTravelTime() + " начальная станция " + train.getStartingStationName() + " конечная станция " +
                train.getFinalStationName() + " количество мест " + train.getCarsNumber());
    }

    public static void printBus(Bus bus) {
        System.out.println("Марка машины " + bus.getBrand() + "," + " модель " + bus.getModel() + "," + " цвет кузова " + bus.getColor() + "," + " год производства " + bus.getProductionYear() + "," + " страна сборки " + bus.getProductionCountry() + " максимальная скорость " + bus.getMaxSpeed());
    }



}
