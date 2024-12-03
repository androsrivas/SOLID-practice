package org.bootcamp.pacient;

import org.bootcamp.abstractClass.Person;
import org.bootcamp.interfaces.appointment.AppointmentMaker;
import org.bootcamp.interfaces.treatment.TreatmentUser;

public class Patient extends Person implements TreatmentUser, AppointmentMaker {
    private String medicalHistoryNumber;


    public Patient(
            String name,
            String surname,
            String birthday,
            String ID,
            String medicalHistory) {
        super(name, surname, birthday, ID);
        this.medicalHistoryNumber = medicalHistory;
    }

    public String getMedicalHistoryNumber() { return medicalHistoryNumber; }

    public void setMedicalHistoryNumber(String medicalHistoryNumber) { this.medicalHistoryNumber = medicalHistoryNumber; }

    @Override
    public void displayInfo() {
        System.out.println("History number: " + getMedicalHistoryNumber());
        System.out.println("Pacient: " + getName() + " " + getSurname());
        System.out.println("Birthday: " + getBirthday());
    }

    @Override
    public void useTreatment() {
        System.out.println("Pacient " + getName() + " " + getSurname() + " uses the treatment.");
    }

    @Override
    public void makeAppointment() {
        System.out.println("Pacient " + getName() + " " + getSurname() + " makes an appointment.");
    }
}
