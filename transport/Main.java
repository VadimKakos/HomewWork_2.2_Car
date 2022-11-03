package transport;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PassengerCar lada = new PassengerCar("Lada", "2110", 1.4);
        Mech<PassengerCar> Jen = new Mech<PassengerCar>("Женя", " Мильковский ", " of heroes");
        Sponsor SQL = new Sponsor("SQL", 100);
        BDriver Max = new BDriver("Максим", "B", 13, lada);
        lada.addDriver(Max);
        lada.addMech(Jen);
        lada.addSponsor(SQL);

        PassengerCar skoda = new PassengerCar("Skoda", "rapid", 1.4);
        Mech<PassengerCar> vad = new Mech<PassengerCar>("Вадим", " Кос ", " of heroes");
        Sponsor ss = new Sponsor("ss", 200);
        BDriver ram = new BDriver("Рамис", "B", 13, skoda);
        skoda.addDriver(ram);
        skoda.addMech(vad);
        skoda.addSponsor(ss);

        PassengerCar toyota = new PassengerCar("Toyota", "corolla", 1.4);
        Mech<PassengerCar> an = new Mech<PassengerCar>("Андрей", " Кос ", " of heroes");
        Sponsor qq = new Sponsor("qq", 300);
        BDriver zus = new BDriver("Рамис", "B", 13, toyota);
        toyota.addDriver(zus);
        toyota.addMech(an);
        toyota.addSponsor(qq);

        PassengerCar renault = new PassengerCar("Renault", "logan", 1.4);
        Mech<PassengerCar> al = new Mech<PassengerCar>("Алексей", " Кос ", " of heroes");
        Sponsor ww = new Sponsor("ww", 400);
        BDriver aal = new BDriver("Альберт", "B", 13, renault);
        renault.addDriver(aal);
        renault.addMech(al);
        renault.addSponsor(ww);


        Truck ford = new Truck("Lada", "Transit", 16, Truck.Capacity.N2);
        Mech<Truck> rob = new Mech<Truck>("Роберто", " Кос ", " of heroes");
        Sponsor ee = new Sponsor("ee", 500);
        CDriver rom = new CDriver("Ромеро", "C", 13, ford);
        ford.addDriver(rom);
        ford.addMech(rob);
        ford.addSponsor(ee);

        Truck mercedes = new Truck("Skoda", "Sprinter", 16, Truck.Capacity.N2);
        Mech<Truck> kar = new Mech<Truck>("Карлос", " Кос ", " of heroes");
        Sponsor rr = new Sponsor("rr", 600);
        CDriver lad = new CDriver("лада", "C", 13, mercedes);
        mercedes.addDriver(lad);
        mercedes.addMech(kar);
        mercedes.addSponsor(rr);

        Truck kamaz = new Truck("Kamaz", "54901", 16,Truck.Capacity.N1);
        Mech<Truck> mech5 = new Mech<Truck>("mech5", " Кос ", " of heroes");
        Sponsor sponsor = new Sponsor("sponsor", 700);
        CDriver car = new CDriver("car", "C", 13, kamaz);
        kamaz.addDriver(car);
        kamaz.addMech(mech5);
        kamaz.addSponsor(sponsor);

        Truck volkswagen = new Truck("Renault", "Crafter", 16, Truck.Capacity.N3);
        Mech<Truck> mech = new Mech<Truck>("mech", " Кос ", " of heroes");
        Sponsor sponsor1 = new Sponsor("sponsor1", 800);
        CDriver cDriver = new CDriver("cDriver", "C", 13, volkswagen);
        volkswagen.addDriver(cDriver);
        volkswagen.addMech(mech);
        volkswagen.addSponsor(sponsor1);

        RacingBus simaz = new RacingBus("Simaz", "2258-539", 12);
        Mech<RacingBus> mech1 = new Mech<RacingBus>("mech1", " Кос ", " of heroes");
        Sponsor sponsor2 = new Sponsor("sponsor2", 900);
        DDriver driver = new DDriver("driver", "D", 13, simaz);
        simaz.addDriver(driver);
        simaz.addMech(mech1);
        simaz.addSponsor(sponsor2);

        RacingBus scania = new RacingBus("Scania", "TOURING", 12);
        Mech<RacingBus> mech2 = new Mech<RacingBus>("mech2", " Кос ", " of heroes");
        Sponsor sponsor3 = new Sponsor("sponsor3", 1000);
        DDriver dDriver = new DDriver("dDriver", "C", 13, scania);
        scania.addDriver(dDriver);
        scania.addMech(mech2);
        scania.addSponsor(sponsor3);

        RacingBus man = new RacingBus("Man", "Lion’s Coach", 12);
        Mech<RacingBus> mech3 = new Mech<RacingBus>("mech3", " Кос ", " of heroes");
        Sponsor sponsor4 = new Sponsor("sponsor4", 1100);
        DDriver dDriver1 = new DDriver("dDriver1", "C", 13, man);
        man.addDriver(dDriver1);
        man.addMech(mech3);
        man.addSponsor(sponsor4);

        RacingBus maz = new RacingBus("Maз", "241", 12);
        Mech<RacingBus> mech4 = new Mech<RacingBus>("mech3", " Кос ", " of heroes");
        Sponsor sponsor5 = new Sponsor("sponsor5", 1200);
        DDriver dDriver2 = new DDriver("dDriver2", "C", 13, maz);
        maz.addDriver(dDriver2);
        maz.addMech(mech4);
        maz.addSponsor(sponsor5);

        printInfo(maz);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addPassengerCar(lada);
        serviceStation.addTruck(volkswagen);
        serviceStation.service();
        serviceStation.service();
        //lada.getMoving();
       // ford.getMoving();
       // simaz.stop();

        //lada.pitStop();
        //lada.bestTime(120);
       // lada.maxSpeed(100);




        CDriver trevor = new CDriver("Тревор", "C", 13, kamaz);
     //   trevor.printInfo();

        BDriver max = new BDriver("Максим", "B", 13, lada);
      //  max.printInfo();

        DDriver den = new DDriver("Денис", "D", 13, scania);
       // den.printInfo();

        den.getMoving();
      //  den.stop();

      //  trevor.refill();

        kamaz.findTypeAuto();
      //  service(lada, skoda, ford, mercedes, simaz, scania);



      //  ArrayList<Transport> transports = (ArrayList<Transport>) List.of(lada, skoda, toyota, renault, ford, mercedes, kamaz, volkswagen, simaz, scania, man, maz);



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

    private static void printInfo(Transport transport) {
        System.out.println("Информация по автомобилю " + transport.getBrand());
        System.out.println("Водители: ");
        for (Driver<?> driver : transport.getDrivers()) {
            System.out.println(driver.getName());
        }
        System.out.println("Спонсоры: ");
        for (Sponsor sponsor : transport.getSponsors()) {
            System.out.println(sponsor.getName());
        }
        System.out.println("Механики: ");
        for (Mech<?> mech : transport.getMeches()) {
            System.out.println(mech.getName() + " "+ mech.getSurName() + " "+ mech.getCompany());
        }

    }

    public static void service(Transport ... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }

    public static void serviceTransport(Transport transport) {
        try {
            if (!transport.diagnosis()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + transport.getModel() + "не прошёл диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }



}
