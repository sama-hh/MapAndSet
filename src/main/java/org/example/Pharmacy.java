package org.example;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    private final Map<String, Medication> medicationsMap;

    public Pharmacy() {
        medicationsMap = new HashMap<>();
    }

    public int getCount() {
        return medicationsMap.size();
    }

    public void save(Medication medication) {
        medicationsMap.put(medication.getName(), medication);
    }

    public Medication find(String medicationName) {
       return medicationsMap.get(medicationName);
    }

    public void delete(String medicationName) {
        medicationsMap.remove(medicationName);
    }

    public void printMedications() {
        System.out.println(medicationsMap);
    }

}
