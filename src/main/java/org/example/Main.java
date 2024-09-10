package org.example;

public class Main {
    public static void main(String[] args) {
        Medication medication1 = new Medication("Acetaminophen", "20$", "in stock");
        Medication medication2 = new Medication("Ibuprofen", "5$", "in stock");
        Medication medication3 = new Medication("Aspirin", "10$", "out of stock");

        Pharmacy medications = new Pharmacy();
        medications.save(medication1);
        medications.save(medication2);
        medications.save(medication3);

        System.out.println("find = " + medications.find(medication1.getName()));

        System.out.println("count = " + medications.getCount());
        medications.printMedications();
        medications.delete(medication1.getName());
        medications.printMedications();

    }
}