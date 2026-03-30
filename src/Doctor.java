
    public class Doctor {
        int id;
        String name;
        String specialization;

        public Doctor(int id, String name, String specialization) {
            this.id = id;
            this.name = name;
            this.specialization = specialization;
        }

        public void display() {
            System.out.println("ID: " + id + ", Name: " + name + ", Specialization: " + specialization);
        }
    }
