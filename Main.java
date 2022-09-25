public class Main {
    public static void main(String[] args) {

        Car grande = new Car("Lada", null, 1.7, "жёлтый", 2015, "Россия");
        System.out.println("Марка машины "+grande.brand+","+" модель "+grande.model+","+" объём двигателя "+grande.engineVolume+" литров "+" цвет кузова "+grande.color+","+" год производства "+grande.productionYear+","+" трана сборки "+grande.productionCountry);

        Car audi = new Car("audi", "A8 50 L TDI quattro", 0, "чёрный", 2020, "Германия");
        System.out.println("Марка машины "+audi.brand+","+" модель "+audi.model+","+" объём двигателя "+audi.engineVolume+" литров "+" цвет кузова "+audi.color+","+" год производства "+audi.productionYear+","+" трана сборки "+audi.productionCountry);

        Car BMW = new Car("BMW", "Z8", 3.0, "чёрный", 0, "Германия");
        System.out.println("Марка машины "+BMW.brand+","+" модель "+BMW.model+","+" объём двигателя "+BMW.engineVolume+" литров "+" цвет кузова "+BMW.color+","+" год производства "+BMW.productionYear+","+" трана сборки "+BMW.productionCountry);

        Car Kia = new Car(null, "Sportage", 2.4, "красный", 2018, "Южная Корея");
        System.out.println("Марка машины "+Kia.brand+","+" модель "+Kia.model+","+" объём двигателя "+Kia.engineVolume+" литров "+" цвет кузова "+Kia.color+","+" год производства "+Kia.productionYear+","+" трана сборки "+Kia.productionCountry);

        Car Hyundai = new Car("Hyundai", "Avante", 1.6, null, 2016, "Южная Корея");
        System.out.println("Марка машины "+Hyundai.brand+","+" модель "+Hyundai.model+","+" объём двигателя "+Hyundai.engineVolume+" литров "+" цвет кузова "+Hyundai.color+","+" год производства "+Hyundai.productionYear+","+" трана сборки "+Hyundai.productionCountry);
    }
}
