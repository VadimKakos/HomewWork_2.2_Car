package transport;

public abstract class Transport {
    private  String brand;
    private  String model;
    private  double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }

    public void getMoving() {
        System.out.println("Начал движение");
    }

    public void stop() {
        System.out.println("закончил движение");
    }

    /*

    private final int productionYear;
    private final String productionCountry;
    private String color;
//    private int maxSpeed;


 /*   public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        setColor(color);
        this.maxSpeed = maxSpeed;
   }*/

   // public abstract void refill();

  //  public void talk() {
  //      System.out.println(getBrand());
  //  }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    /*    public int getProductionYear() {
            return productionYear;
        }

        public String getProductionCountry() {
            return productionCountry;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            if (isNullOrIsEmpty(color)) {
                this.color = "default";
            } else {
                this.color = color;
            }
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public void setMaxSpeed(int maxSpeed) {
            if (maxSpeed == 0) {
                this.maxSpeed = 100;
            } else {
                this.maxSpeed = maxSpeed;
            }
        }
    */


//    public abstract double maxSpeed();

//    public abstract void printInfo();
}
