package ex.app;


import ex.data.Patient;
import ex.logic.Hospital;


import java.util.Scanner;

class HospitalApp {
    public static void main(String[] args) {

        final int exit = 0;
        final int addPatient = 1;
        final int printPatients = 2;

        Scanner input = new Scanner(System.in);
        int option = -1;

        Hospital hospital = new Hospital();

        while (option != exit){
            System.out.println("Dostępne opcje: ");
            System.out.println(exit +  " - wyjście z programu");
            System.out.println(addPatient + " - dodanie pacjenta");
            System.out.println(printPatients + " - wyświetlenie listy pacjentów");

            System.out.println("Wybierz opcje");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case addPatient:
                    Patient patient = new Patient();
                    System.out.println("Imię");
                    patient.setFirstName(input.nextLine());
                    System.out.println("Nazwisko");
                    patient.setLastName(input.nextLine());
                    System.out.println("Pesel");
                    patient.setPesel(input.nextLine());
                    hospital.addPatient(patient);
                    break;
                case printPatients:
                    hospital.printPatients();
                    break;
                case exit:
                    System.out.println("Zamykam program");
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja");
            }

        }

        input.close();
    }
}