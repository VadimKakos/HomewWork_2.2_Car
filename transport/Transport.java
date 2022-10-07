package transport;

public abstract class Transport {

    private String brand;
    private String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int maxSpeed;


    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        setColor(color);
        this.maxSpeed = maxSpeed;
    }

    public abstract void refill();

    public void talk() {
        System.out.println(getBrand());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (isNullOrIsEmpty(brand)) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (isNullOrIsEmpty(model)) {
            this.model = "default";
        } else {
            this.model = model;
        }
    }

    public int getProductionYear() {
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

    public static boolean isNullOrIsEmpty(String value) {
        if (value == null || value.isEmpty()) {
            return true;
        } else return true;
    }
}
