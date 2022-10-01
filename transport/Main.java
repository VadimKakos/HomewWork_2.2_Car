package transport;

import transport.Car;

import java.security.Key;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Car grande = new Car("Lada", null, 1.7, "жёлтый", 2015, "Россия", "auto", "Hatchback", "x000xx00", 5, "летняя");
        System.out.println("Марка машины " + grande.getBrand() + "," + " модель " + grande.getModel() + "," + " объём двигателя " + grande.getEngineVolume() + " литров " + " цвет кузова " + grande.getColor() + "," + " год производства " + grande.getProductionYear() + "," + " cтрана сборки " + grande.getProductionCountry() +","+  " коробка передач " + grande.getTransmission() + ","+ " кузов " + grande.getBody() +","+ " гос. номер " + grande.getIdNumber()+ "," + " количество мест " + grande.getSeatsNumber()  +","+ " резина " + grande.getTires());

        Car audi = new Car("audi", "A8 50 L TDI quattro", 0, "чёрный", 2020, "Германия", "auto", "Hatchback", "x000xx00", 5, "летняя");
        System.out.println("Марка машины " + audi.getBrand() + "," + " модель " + audi.getModel() + "," + " объём двигателя " + audi.getEngineVolume() + " литров " + " цвет кузова " + audi.getColor() + "," + " год производства " + audi.getProductionYear() + "," + " cтрана сборки " + audi.getProductionCountry()+  " коробка передач " + audi.getTransmission() + ","+ " кузов " + audi.getBody() +","+ " гос. номер " + audi.getIdNumber()+ "," + " количество мест " + audi.getSeatsNumber()  +","+ " резина " + audi.getTires());

        Car BMW = new Car("BMW", "Z8", 3.0, "чёрный", 0, "Германия", "auto", "Hatchback", "x000xx00", 5, "летняя");
        System.out.println("Марка машины " + BMW.getBrand() + "," + " модель " + BMW.getModel() + "," + " объём двигателя " + BMW.getEngineVolume() + " литров " + " цвет кузова " + BMW.getColor() + "," + " год производства " + BMW.getProductionYear() + "," + " cтрана сборки " + BMW.getProductionCountry()+  " коробка передач " + BMW.getTransmission() + ","+ " кузов " + BMW.getBody() +","+ " гос. номер " + BMW.getIdNumber()+ "," + " количество мест " + BMW.getSeatsNumber()  +","+ " резина " + BMW.getTires());

        Car Kia = new Car(null, "Sportage", 2.4, "красный", 2018, "Южная Корея", "auto", "Hatchback", "x000xx00", 5, "летняя");
        System.out.println("Марка машины " + Kia.getBrand() + "," + " модель " + Kia.getModel() + "," + " объём двигателя " + Kia.getEngineVolume() + " литров " + " цвет кузова " + Kia.getColor() + "," + " год производства " + Kia.getProductionYear() + "," + " cтрана сборки " + Kia.getProductionCountry()+  " коробка передач " + Kia.getTransmission() + ","+ " кузов " + Kia.getBody() +","+ " гос. номер " + Kia.getIdNumber()+ "," + " количество мест " + Kia.getSeatsNumber()  +","+ " резина " + Kia.getTires());

        Car Hyundai = new Car("Hyundai", "Avante", 1.6, null, 2016, "Южная Корея", "auto", "Hatchback", "x000xx00", 5, "летняя");
        System.out.println("Марка машины " + Hyundai.getBrand() + "," + " модель " + Hyundai.getModel() + "," + " объём двигателя " + Hyundai.getEngineVolume() + " литров " + " цвет кузова " + Hyundai.getColor() + "," + " год производства " + Hyundai.getProductionYear() + "," + " трана сборки " + Hyundai.getProductionCountry() + " коробка передач " + Hyundai.getTransmission() + "," + " кузов " + Hyundai.getBody() + "," + " гос. номер " + Hyundai.getIdNumber() + "," + " количество мест " + Hyundai.getSeatsNumber() + "," + " резина " + Hyundai.getTires());

        System.out.println(grande.getTires());
        grande.changeTyre();
        System.out.println(grande.getTires());

        grande.new Key("удалённый запуск двигателя", "бесключевой доступ");
        audi.new Insurance(2023, 13000, 123456789);
        BMW.new Insurance(2023, 13000, 123456789);
        Kia.new Insurance(2023, 13000, 123456789);
        Hyundai.new Insurance(2023, 13000, 123456789);

        Hyundai.getInsurance();

    }
}
