package org.bootcamp;

import org.bootcamp.abstractClass.Person;
import org.bootcamp.doctor.Doctor;
import org.bootcamp.interfaces.appointment.AppointmentMaker;
import org.bootcamp.interfaces.treatment.TreatmentPrescriber;
import org.bootcamp.interfaces.treatment.TreatmentUser;
import org.bootcamp.pacient.Patient;

public class Main {
    public static void main(String[] args) {
        Person patient1 = new Patient(
                "Suzette",
                "Haldin",
                "18-05-1986",
                "00000000X",
                "98546"
        );

        Person doctor1 = new Doctor(
                "Nazareth",
                "Chornyak",
                "23-08-1975",
                "111111111L",
                "MRN-35461",
                "logopedia"
        );

        patient1.displayInfo();
        ((AppointmentMaker)patient1).makeAppointment();
        doctor1.displayInfo();
        ((TreatmentPrescriber)doctor1).prescribeTreatment();
        ((TreatmentUser)patient1).useTreatment();
    }
}