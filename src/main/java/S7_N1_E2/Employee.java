package S7_N1_E2;

public class Employee {

    private String name;
    private String lastName;
    private double priceHour;

    public Employee(String name, String lastName, double priceHour) {
        this.name = name;
        this.lastName = lastName;
        this.priceHour = priceHour;
    }

    public void calculateSalary (double workHours) {
        System.out.println("El salari és: "+workHours*getPriceHour()+" €");
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getPriceHour() {
        return priceHour;
    }

}
