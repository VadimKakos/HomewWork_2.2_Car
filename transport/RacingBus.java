package transport;

public class RacingBus extends Transport implements Competing{
    public RacingBus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус встал на питстоп");
    }

    @Override
    public void bestTime(double bestTime) {
        System.out.println("Лучшее время = "+ bestTime);
    }

    @Override
    public void maxSpeed(double max) {
        System.out.println("Максимальна скорость = "+ max);
    }

    @Override
    public void getMoving() {
        System.out.println("Запускаю двигатель автобуса");
        System.out.println("Начинаю движение");
    }
    @Override
    public void stop() {
        System.out.println("Останавливаюсь");
        System.out.println("Глушу двигатель автобуса");
    }
}


