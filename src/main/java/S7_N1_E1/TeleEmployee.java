package S7_N1_E1;

public class TeleEmployee extends Employee{

    private static final int INTERNET = 19;

    public TeleEmployee(String name, String lastName, double priceHour) {
        super(name, lastName, priceHour);
    }

    @Override
    public void calculateSalary (double workHours) {
        System.out.println("El salari és: "+workHours*this.getPriceHour()+ INTERNET +" €");
    }
}
