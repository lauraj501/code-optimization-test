public class AgeValidation {
    import java.util.Scanner;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)
        System.out.println("ingrese su edad");
        int Edad = scanner.nextInt();
        final int COMPARACION_EDAD = 18;
        
        if (Edad >= COMPARACION_EDAD) {
            System.out.println("Access granted");
        }
        
        if (Edad < COMPARACION_EDAD) {
            System.out.println("Access denied");
        }
    }
}
