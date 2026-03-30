import java.util.*;

public class Main {

    static ArrayList<Patient> patients = new ArrayList<>();
    static ArrayList<Doctor> doctors = new ArrayList<>();
    static ArrayList<Appointment> appointments = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n--- Hospital Management System ---");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Add Doctor");
            System.out.println("4. View Doctors");
            System.out.println("5. Book Appointment");
            System.out.println("6. View Appointments");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: addPatient(); break;
                case 2: viewPatients(); break;
                case 3: addDoctor(); break;
                case 4: viewDoctors(); break;
                case 5: bookAppointment(); break;
                case 6: viewAppointments(); break;
                case 7: System.exit(0);
                default: System.out.println("Invalid choice!");
            }
        }
    }

    static void addPatient() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        patients.add(new Patient(id, name, age, disease));
        System.out.println("Patient added successfully!");
    }

    static void viewPatients() {
        for (Patient p : patients) {
            p.display();
        }
    }

    static void addDoctor() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Specialization: ");
        String spec = sc.nextLine();

        doctors.add(new Doctor(id, name, spec));
        System.out.println("Doctor added successfully!");
    }

    static void viewDoctors() {
        for (Doctor d : doctors) {
            d.display();
        }
    }

    static void bookAppointment() {
        System.out.print("Enter Patient ID: ");
        int pid = sc.nextInt();

        System.out.print("Enter Doctor ID: ");
        int did = sc.nextInt();
        sc.nextLine();

        Patient patient = null;
        Doctor doctor = null;

        for (Patient p : patients) {
            if (p.id == pid) patient = p;
        }

        for (Doctor d : doctors) {
            if (d.id == did) doctor = d;
        }

        if (patient == null || doctor == null) {
            System.out.println("Invalid Patient or Doctor ID!");
            return;
        }

        System.out.print("Enter Date: ");
        String date = sc.nextLine();

        appointments.add(new Appointment(patient, doctor, date));
        System.out.println("Appointment booked successfully!");
    }

    static void viewAppointments() {
        for (Appointment a : appointments) {
            a.display();
        }
    }
}