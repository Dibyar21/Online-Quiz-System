package myPackage;

public class Student {

    private String name;
    private String registrationNumber;

    public Student(String name, String registrationNumber) {

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be empty.");
        }

        if (registrationNumber == null || registrationNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Registration number cannot be empty.");
        }

        this.name = name.trim();
        this.registrationNumber = registrationNumber.trim();
    }

    public String getName() {
        return name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void displayStudentDetails() {
        System.out.println("\n========== Student Details ==========");
        System.out.println("Name             : " + name);
        System.out.println("Registration No. : " + registrationNumber);
        System.out.println("=====================================");
    }
}
