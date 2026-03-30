public class Appointment {
    Patient patient;
    Doctor doctor;
    String date;

    public Appointment(Patient patient, Doctor doctor, String date) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    public void display() {
        System.out.println("Appointment: " + patient.name + " with Dr. " + doctor.name + " on " + date);
    }
}