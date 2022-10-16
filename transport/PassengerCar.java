package transport;

public class PassengerCar extends Transport implements Competing{
    public PassengerCar(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
