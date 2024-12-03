package org.bootcamp.doctor;

import org.bootcamp.abstractClass.Person;
import org.bootcamp.interfaces.treatment.TreatmentPrescriber;

public class Doctor extends Person implements TreatmentPrescriber {
    private String medicalRegisteredNumber;
    private String medicalSpeciality;

    public Doctor(
            String name,
            String surname,
            String birthday,
            String ID,
            String medicalRegisteredNumber,
            String medicalSpeciality) {
        super(name, surname, birthday, ID);
        this.medicalRegisteredNumber = medicalRegisteredNumber;
        this.medicalSpeciality = medicalSpeciality;
    }

    public String getMedicalRegisteredNumber() {
        return medicalRegisteredNumber;
    }

    public String getMedicalSpeciality() {
        return medicalSpeciality;
    }

    @Override
    public void displayInfo() {
        System.out.println("Dr.: " + getName() + " " + getSurname());
        System.out.println("Medical license: " + getMedicalRegisteredNumber());
        System.out.println("Speciality: " + getMedicalSpeciality());
    }

    @Override
    public void prescribeTreatment() {
        System.out.println("Dr. " + getSurname() + " prescribes a treatment.");
    }
}
