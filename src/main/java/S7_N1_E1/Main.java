package S7_N1_E1;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("Ana", "Martínez", 24.5);
        TeleEmployee t1 = new TeleEmployee("Juan", "Hernández", 22.5);
        FaceToFaceEmployee f1 = new FaceToFaceEmployee("Marc", "Gómez", 35.4);

        e1.calculateSalary(35);
        t1.calculateSalary(35);
        f1.calculateSalary(35);
    }
}
