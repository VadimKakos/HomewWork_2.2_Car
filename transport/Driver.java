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

        setLicence(licence);
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
        if (licence == null) {
            throw new IllegalArgumentException("НЕобходимо ввести категорию прав");
        }
        this.licence = licence;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    public void getMoving() {
        transport.getMoving();
    }

    public void stop() {
        transport.stop();
    }

    public void refill() {
        System.out.println(name + " заправляет " + transport.getBrand() + " " + transport.getModel());
    }

    public void printInfo() {
        System.out.println("Водитель " + name + " Управляет автомобилем " + transport.getBrand() + " и будет учавствовать в заезде");
    }
}
