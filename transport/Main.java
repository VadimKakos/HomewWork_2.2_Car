package transport;

import transport.Car;

import java.security.Key;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        PassengerCars lada = new PassengerCars("Lada", "2110", 1.4);
        PassengerCars skoda = new PassengerCars("Skoda", "rapid", 1.4);
        PassengerCars toyota = new PassengerCars("Toyota", "corolla", 1.4);
        PassengerCars renault = new PassengerCars("Renault", "logan", 1.4);

        Trucks ford = new Trucks("Lada", "Transit", 16);
        Trucks mercedes = new Trucks("Skoda", "Sprinter", 16);
        Trucks kamaz = new Trucks("Kamaz", "54901", 16);
        Trucks volkswagen = new Trucks("Renault", "Crafter", 16);

        Buses simaz = new Buses("Simaz", "2258-539", 12);
        Buses scania = new Buses("Scania", "TOURING", 12);
        Buses man = new Buses("Man", "Lion’s Coach", 12);
        Buses maz = new Buses("Maз", "241", 12);


        lada.getMoving();
        ford.getMoving();
        simaz.stop();

        lada.pitStop();
        lada.bestTime(120);
        lada.maxSpeed(100);


        CDriver trevor = new CDriver("Тревор", "C", 13, kamaz);
        trevor.printInfo();

        BDriver max = new BDriver("Максим", "B", 13, lada);
        max.printInfo();

        DDriver den = new DDriver("Денис", "D", 13, scania);
        den.printInfo();
     /*   Car grande = new Car("Lada", null, 1.7, "жёлтый", 2015, "Россия", 130, "auto", "Hatchback", "x000xx00", 5, "летняя");
        grande.printInfo();

        Car audi = new Car("audi", "A8 50 L TDI quattro", 0, "чёрный", 2020, "Германия", 130, "auto", "Hatchback", "x000xx00", 5, "летняя");
        audi.printInfo();

        Car bmw = new Car("BMW", "Z8", 3.0, "чёрный", 0, "Германия", 130, "auto", "Hatchback", "x000xx00", 5, "летняя");
        bmw.printInfo();

        Car kia = new Car(null, "Sportage", 2.4, "красный", 2018, "Южная Корея", 130, "auto", "Hatchback", "x000xx00", 5, "летняя");
        kia.printInfo();

        Car hyundai = new Car("Hyundai", "Avante", 1.6, null, 2016, "Южная Корея", 130, "auto", "Hatchback", "x000xx00", 5, "летняя");
        hyundai.printInfo();

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



        Bus firstBus = new Bus("НефАЗ", "5299", 2000, "Россия", "", 100);
        Bus secondBus = new Bus("ЛиАЗ", "4293", 2015, "Россия", "", 110);
        Bus thirdBus = new Bus("НефАЗ", "4208", 1989, "Россия", "", 80);

        firstBus.refill();
        firstTrain.refill();
        bmw.refill();


        grande.printInfo();
        firstTrain.printInfo();
        firstBus.printInfo();

    */
    }

}
