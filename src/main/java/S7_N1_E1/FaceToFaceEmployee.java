package S7_N1_E1;

public class FaceToFaceEmployee extends Employee{

    private static int benzina = 40;

    public FaceToFaceEmployee(String name, String lastName, double priceHour) {
        super(name, lastName, priceHour);
    }

    @Override
    public void calculateSalary (double workHours) {
        System.out.println("El salari és: "+workHours*this.getPriceHour()+benzina+" €");
    }

    public static int getBenzina() {
        return benzina;
    }

    public static void setBenzina(int benzina) {
        FaceToFaceEmployee.benzina = benzina;
    }
}
