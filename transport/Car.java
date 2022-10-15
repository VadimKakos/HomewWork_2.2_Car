package transport;

import java.time.LocalDate;

public class Car {

/*    public class Key {
        private String remoteEngineStart;
        private String keylessEntry;

        public Key(String remoteEngineStart, String keylessEntry) {
            if (remoteEngineStart == null || remoteEngineStart.isEmpty()) {
                remoteEngineStart = "default";
            } else {
                this.remoteEngineStart = remoteEngineStart;
            }
            if (keylessEntry == null || keylessEntry.isEmpty()) {
                keylessEntry = "default";
            } else {
                this.remoteEngineStart = keylessEntry;
            }
        }


        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public String getKeylessEntry() {
            return keylessEntry;
        }
    }

    public class Insurance {
        private Integer validity;
        private Integer salary;
        private Integer number;


        public Insurance(Integer validity, Integer salary, Integer number) {

            if (validity == null) {
                validity = 1;
            } else {
                this.validity = validity;
            }

            if (salary == null) {
                salary = 1;
            } else {
                this.salary = salary;
            }
            if (number == null) {
                number = 1;
            } else {
                this.validity = number;
            }
        }

        public void theExpiryDate() {
            if (LocalDate.now().getYear() > validity) {
                System.out.println("Срочно необходимо оформить новую страховку!");
            }
        }

        public void rightValidity() {
            if (validity - 9 != 0) {
                System.out.println("Номер страховки некорректный!");
            }
        }

        public int getValidity() {
            return validity;
        }

        public int getSalary() {
            return salary;
        }

        public int getNumber() {
            return number;
        }
    }


    private double engineVolume;

    private String transmission;
    private String body;
    private String idNumber;
    private int seatsNumber;
    private String tires;

    public Key key;

    public Insurance insurance;

    public Insurance getInsurance() {
        return insurance;
    }

    public Key getKey() {
        return key;
    }

    Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, int maxSpeed,
        String transmission, String body, String idNumber, int seatsNumber, String tires) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);

        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (transmission == null && transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (body == null && body.isEmpty()) {
            this.body = "default";
        } else {
            this.body = body;
        }
        if (idNumber == null && idNumber.isEmpty()) {
            this.idNumber = "default";
        } else {
            this.idNumber = idNumber;
        }
        if (seatsNumber <= 0) {
            this.seatsNumber = 4;
        } else {
            this.seatsNumber = seatsNumber;
        }
        if (tires.length() == 9) {
            this.tires = tires;
        } else {
            this.tires = "default";
        }
    }

    public String getBody() {
        return body;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }


    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    public void changeTyre() {
        if (this.tires.equals("летняя")) {
            this.tires = "зимняя";
        } else {
            this.tires = "летняя";
        }
    }

    @Override
    public void refill() {
        System.out.println("Заправляюсь бензином/ дизелем/ заряжаюсь");
    }

    @Override
    public void printInfo() {
        System.out.println("Марка машины " + getBrand() + "," + " модель " + getModel() + "," + " объём двигателя " + getEngineVolume() + " литров " + " цвет кузова " + getColor() + "," + " год производства " +
                getProductionYear() + "," + " страна сборки " + getProductionCountry() + " максимальная скорость " + getMaxSpeed() + " коробка передач " +
                getTransmission() + "," + " кузов " + getBody() + "," + " гос. номер " + getIdNumber() + "," + " количество мест " + getSeatsNumber() + "," + " резина " + getTires());

    }
*/}
