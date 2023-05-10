package S7_N1_E2;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("María", "Martínez", 24.5);
        TeleEmployee t1 = new TeleEmployee("Pedro", "Hernández", 22.5);
        FaceToFaceEmployee f1 = new FaceToFaceEmployee("David", "Gómez", 35.4);

        e1.calculateSalary(40);
        t1.calculateSalary(40);
        f1.calculateSalary(40);

        t1.otherDeprecatedMethod();
        f1.deprecatedMethod();

    }
}
