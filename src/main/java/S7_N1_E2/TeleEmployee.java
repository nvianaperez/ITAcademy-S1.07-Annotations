package S7_N1_E2;

public class TeleEmployee extends Employee {

    private static final int INTERNET = 19;

    public TeleEmployee(String name, String lastName, double priceHour) {
        super(name, lastName, priceHour);
    }

    @Override
    public void calculateSalary (double workHours) {
        System.out.println("El salari és: "+workHours*this.getPriceHour()+ INTERNET +" €");
    }

    // Javadoc comment follows
    /**
     * @deprecated
     * explanation of why it was deprecated
     */
    @Deprecated
    @SuppressWarnings("deprecation")
    public void otherDeprecatedMethod () {
        System.out.println("Aquest mètode és obsolet pels treballadors NO presencials");
    }


}
