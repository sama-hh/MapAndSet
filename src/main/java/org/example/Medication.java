package org.example;

public class Medication {
    private String name;
    private String price;
    private String availability;

    public Medication(String name, String price, String availability) {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getAvailability() {
        return availability;
    }

    public String getInfo() {
        return getPrice() + " - " + getAvailability();
    }


    @Override
    public String toString() {
        return "Medication{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", availability='" + availability + '\'' +
                '}';
    }
}
