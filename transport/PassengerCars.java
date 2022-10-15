package transport;

public class PassengerCars extends Transport implements Competing{
    public PassengerCars(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }


    @Override
    public void pitStop() {
        System.out.println("встал на питстоп");
    }

    @Override
    public void bestTime(double bestTime) {
        System.out.println("Лучшее время = "+ bestTime);
    }


    @Override
    public void maxSpeed(double max) {
        System.out.println("Максимальна скорость = "+ max);
    }
}
