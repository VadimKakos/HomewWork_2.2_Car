package transport;

public class Driver<T extends Transport & Competing>{
    private String name;
    private String licence;
    private int experience;

    private T transport;

    public Driver(String name, String licence, int experience, T transport) {
        if (name == null || name.isEmpty()) {
            System.out.println("Неверное имя");
        } else {
            this.name = name;
        }
        this.licence = licence;
        this.experience = experience;
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String isLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    public void getMoving() {
        System.out.println("Начал движение");
    }

    public void stop() {
        System.out.println("закончил движение");
    }

    public void refill() {
        System.out.println("Заправляю авто");
    }

    public void printInfo() {
        System.out.println("Водитель " + name + " Управляет автомобилем " + transport.getBrand() + " и будет учавствовать в заезде");
    }
}
