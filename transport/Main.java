package transport;

public class Main {
    public static void main(String[] args) {

        PassengerCar lada = new PassengerCar("Lada", "2110", 1.4);
        PassengerCar skoda = new PassengerCar("Skoda", "rapid", 1.4);
        PassengerCar toyota = new PassengerCar("Toyota", "corolla", 1.4);
        PassengerCar renault = new PassengerCar("Renault", "logan", 1.4);

        Truck ford = new Truck("Lada", "Transit", 16, Truck.Capacity.N2);
        Truck mercedes = new Truck("Skoda", "Sprinter", 16, Truck.Capacity.N2);
        Truck kamaz = new Truck("Kamaz", "54901", 16,Truck.Capacity.N1);
        Truck volkswagen = new Truck("Renault", "Crafter", 16, Truck.Capacity.N3);

        RacingBus simaz = new RacingBus("Simaz", "2258-539", 12);
        RacingBus scania = new RacingBus("Scania", "TOURING", 12);
        RacingBus man = new RacingBus("Man", "Lion’s Coach", 12);
        RacingBus maz = new RacingBus("Maз", "241", 12);


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

        den.getMoving();
        den.stop();

        trevor.refill();

        kamaz.findTypeAuto();
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
