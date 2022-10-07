package transport;

public class Train extends Transport {
    private int costOfTravel;
    private int travelTime;
    private String startingStationName;
    private String finalStationName;
    private int carsNumber;

    public Train(String brand, String model, int productionYear,String productionCountry,String color,int maxSpeed, int costOfTravel, int travelTime, String startingStationName, String finalStationName, int carsNumber) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);


        if (costOfTravel == 0) {
            costOfTravel = 1;
        }else{

            this.costOfTravel = costOfTravel;}
        if (travelTime == 0) {
            travelTime = 1;
        }else{
            this.travelTime = travelTime;
        }
        if (isNullOrIsEmpty(startingStationName)) {
            this.startingStationName = "Defoult";
        } else {
            this.startingStationName = startingStationName;
        }
        if (isNullOrIsEmpty(finalStationName)) {
            this.finalStationName = "Defoult";
        } else {
            this.finalStationName = finalStationName;
        }
        if (carsNumber == 0) {
            carsNumber = 1;
        }else{
            this.carsNumber = carsNumber;}
    }

    public int getCostOfTravel() {
        return costOfTravel;
    }

    public void setCostOfTravel(int costOfTravel) {
        this.costOfTravel = costOfTravel;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public String getStartingStationName() {
        return startingStationName;
    }

    public void setStartingStationName(String startingStationName) {
        this.startingStationName = startingStationName;
    }

    public String getFinalStationName() {
        return finalStationName;
    }

    public void setFinalStationName(String finalStationName) {
        this.finalStationName = finalStationName;
    }

    public int getCarsNumber() {
        return carsNumber;
    }

    public void setCarsNumber(int carsNumber) {
        this.carsNumber = carsNumber;
    }

    @Override
    public void refill() {
        System.out.println("Заправляюсь дизелем");
    }
}
