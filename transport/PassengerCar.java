package transport;

public class PassengerCar extends Transport implements Competing{
    public PassengerCar(String brand, String model, double engineVolume) {

        super(brand, model, engineVolume);
    }

    public enum BodyType {
        SEDAN, HATCHBACK, COUPE, WAGON,
        SUV, CROSSOVER, PICKUP, VAN, MINIVAN,
        ;
    }

    private BodyType bodyType;

    public PassengerCar(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void getMoving() {
        System.out.println("Запускаю двигатель автомобиля");
        System.out.println("Начинаю движение");
    }

    @Override
    public void stop() {
        System.out.println("Останавливаюсь");
        System.out.println("Глушу двигатель автомобился");
    }


    @Override
    public void pitStop() {
        System.out.println("Автомобоиль встал на питстоп");
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
