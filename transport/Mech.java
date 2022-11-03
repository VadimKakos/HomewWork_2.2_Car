package transport;

public class Mech<T extends Transport> {
    private final String name;
    private final String surName;
    private final String company;

    public Mech(String name, String surName, String company) {
        this.name = name;
        this.surName = surName;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getCompany() {
        return company;
    }

    public boolean service(T t) {
        return  t.diagnosis();
    }

    public void repair(T t) {
        t.repair();
    }
}
