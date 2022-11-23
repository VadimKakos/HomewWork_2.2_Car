package transport;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;
    private final Set<Driver> drivers = new HashSet<>();
    private final Set<Mech> meches = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();

    public Transport(String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }


    public ArrayList<Transport> getParticipant() {
        return participant;
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public Set<Mech> getMeches() {
        return meches;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public void addDriver(Driver<?>driver) {
        drivers.add(driver);
    }
    public void addMech(Mech<?>mech) {
        meches.add(mech);
    }
    public void addSponsor(Sponsor sponsor ) {
        sponsors.add(sponsor);
    }

    private ArrayList<Transport> participant;


    public abstract void getMoving();

    public abstract void stop();

    public abstract boolean diagnosis();

    public abstract void repair() ;

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
