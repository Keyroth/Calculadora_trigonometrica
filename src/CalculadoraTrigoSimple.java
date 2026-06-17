import java.util.Scanner;

public class CalculadoraTrigoSimple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // El bucle while(true) mantendrá el programa corriendo hasta que el usuario decida salir
        while (true) {
            System.out.println("\n=== CALCULADORA TRIGONOMÉTRICA SIMPLE ===");
            System.out.println("1. Seno (sin)");
            System.out.println("2. Coseno (cos)");
            System.out.println("3. Tangente (tan)");
            System.out.println("0. Salir del programa");
            System.out.print("Selecciona una opción (0-3): ");
            
            int opcion = scanner.nextInt();
            
            // Si el usuario presiona 0, rompemos el bucle y cerramos el programa
            if (opcion == 0) {
                System.out.println("Saliendo de la calculadora. ¡Hasta luego!");
                break; 
            }
            
            // Validación inicial de opciones antes de pedir el ángulo
            if (opcion < 1 || opcion > 3) {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
                continue; // Regresa al inicio del bucle sin pedir el ángulo
            }
            
            System.out.print("Introduce el ángulo en grados (°): ");
            double grados = scanner.nextDouble();
            
            // Convertimos el ángulo a radianes para los métodos de Math
            double radianes = Math.toRadians(grados);
            
            System.out.println("\n--- Resultado ---");
            
            switch (opcion) {
                case 1:
                    System.out.println("sin(" + grados + "°) = " + Math.sin(radianes));
                    break;
                case 2:
                    System.out.println("cos(" + grados + "°) = " + Math.cos(radianes));
                    break;
                case 3:
                    // Control para indeterminaciones en 90°, 270°, etc.
                    if (grados % 180 == 90 || grados % 180 == -90) {
                        System.out.println("tan(" + grados + "°) = Indefinido (Tiende a Infinito)");
                    } else {
                        System.out.println("tan(" + grados + "°) = " + Math.tan(radianes));
                    }
                    break;
            }
            
            System.out.println("=========================================");
        }
        
        scanner.close();
    }
}