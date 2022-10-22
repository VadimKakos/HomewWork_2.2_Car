package transport;

public class Truck extends Transport implements Competing{



    public enum Capacity {N1(0, 3.5), N2(3.5, 12), N3(12, 100);


        private final double min;
        private final double max;

        Capacity(double min, double max) {
            this.min = min;
            this.max = max;
        }

        public double getMin() {
            return min;
        }

        public double getMax() {
            return max;
        }
    }

    private Capacity capacity;

    public Truck(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public void  findTypeAuto() {
        if (capacity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Вместимость от " + capacity.getMin() + " до " + capacity.getMax());
        }
    }


    @Override
    public void pitStop() {
        System.out.println("Грузовик встал на питстоп");
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
        System.out.println("Запускаю двигатель грузовика");
        System.out.println("Начинаю движение");
    }
    @Override
    public void stop() {
        System.out.println("Останавливаюсь");
        System.out.println("Глушу двигатель грузовика");
    }

    @Override
    public boolean diagnosis() {
        return true;
    }

}
