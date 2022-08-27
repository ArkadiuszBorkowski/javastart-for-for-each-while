package ex.logic;

import ex.data.Patient;

public class Hospital {

    private final int maxPatientNumbers = 10;
    private Patient[] patients = new Patient[maxPatientNumbers];
    private int regPatriens = 0; //aktalna liczba pacjentów;

    public void addPatient(Patient patient) {
        if (regPatriens < maxPatientNumbers) {
            patients[regPatriens] = patient;
            regPatriens++;
        } else {
            System.out.println("Osiagnięto limit");
        }

    }

    public void printPatients(){
        for (int i = 0; i < regPatriens; i++) {
            System.out.println(patients[i].getInfo());
        }
    }


}
