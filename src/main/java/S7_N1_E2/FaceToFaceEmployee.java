package S7_N1_E2;

public class FaceToFaceEmployee extends Employee {

    private static int benzina = 40;

    public FaceToFaceEmployee(String name, String lastName, double priceHour) {
        super(name, lastName, priceHour);
    }

    @Override
    public void calculateSalary (double workHours) {
        System.out.println("El salari és: "+workHours*this.getPriceHour()+benzina+" €");
    }

    // Javadoc comment follows
    /**
     * @deprecated
     * explanation of why it was deprecated
     */
    @Deprecated
    @SuppressWarnings("deprecation")
    public void deprecatedMethod () {
        System.out.println("Aquest mètode és obsolet pels treballadors presencials");
    }

}
