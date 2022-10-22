package transport;


public class RacingBus extends Transport implements Competing{
    public RacingBus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public enum Terrain {
        ESPECIALLY_SMALL(0, 10),SMALL(0, 25), MEDIUM_LARGE(40, 50),
        LARGE(60, 80), PARTICULARLY_LARGE(100, 120),
        ;

        private final int min;
        private final int max;

        Terrain(int min, int max) {
            this.min = min;
            this.max = max;
        }


        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }

    }

    private Terrain terrain;

    public RacingBus(String brand, String model, double engineVolume, Terrain terrain) {
        super(brand, model, engineVolume);
        this.terrain = terrain;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    public void  findTypeAuto() {
        if (terrain == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Грузоподъёмность от " + terrain.getMin() + " до " + terrain.getMax());
        }
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

    @Override
    public boolean diagnosis() {
        System.out.println("автобусы в диагностике не требуются");
        return true;
    }
}


