import java.util.Scanner;

public class CalculadoraTrigonometrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== CALCULADORA TRIGONOMÉTRICA COMPLETA ===");
            System.out.println("1. Seno (sin)");
            System.out.println("2. Coseno (cos)");
            System.out.println("3. Tangente (tan)");
            System.out.println("4. Arcoseno (arcsin)");
            System.out.println("5. Arcocoseno (arccos)");
            System.out.println("6. Arcotangente (arctan)");
            System.out.println("7. Seno Hiperbólico (sinh)");
            System.out.println("8. Coseno Hiperbólico (cosh)");
            System.out.println("9. Tangente Hiperbólica (tanh)");
            System.out.println("0. Salir del programa");
            System.out.print("Selecciona una opción (0-9): ");
            
            int opcion = scanner.nextInt();
            
            if (opcion == 0) {
                System.out.println("Saliendo de la calculadora. ¡Hasta luego!");
                break; 
            }
            
            if (opcion < 1 || opcion > 9) {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
                continue;
            }
            
            if (opcion >= 1 && opcion <= 3) {
                System.out.print("Introduce el ángulo en grados (°): ");
            } else if (opcion >= 4 && opcion <= 6) {
                System.out.print("Introduce el valor numérico (para arcsin/arccos debe ser entre -1 y 1): ");
            } else {
                System.out.print("Introduce el valor numérico o ángulo para la función hiperbólica: ");
            }
            
            double valor = scanner.nextDouble();
            System.out.println("\n--- Resultado ---");
            
            switch (opcion) {
                case 1:
                    double radSin = Math.toRadians(valor);
                    System.out.println("sin(" + valor + "°) = " + Math.sin(radSin));
                    break;
                case 2:
                    double radCos = Math.toRadians(valor);
                    System.out.println("cos(" + valor + "°) = " + Math.cos(radCos));
                    break;
                case 3:
                    if (valor % 180 == 90 || valor % 180 == -90) {
                        System.out.println("tan(" + valor + "°) = Indefinido (Tiende a Infinito)");
                    } else {
                        double radTan = Math.toRadians(valor);
                        System.out.println("tan(" + valor + "°) = " + Math.tan(radTan));
                    }
                    break;
                case 4:
                    if (valor < -1 || valor > 1) {
                        System.out.println("Error: El valor para arcsin debe estar entre -1 y 1.");
                    } else {
                        double resultadoAsin = Math.toDegrees(Math.asin(valor));
                        System.out.println("arcsin(" + valor + ") = " + resultadoAsin + "°");
                    }
                    break;
                case 5:
                    if (valor < -1 || valor > 1) {
                        System.out.println("Error: El valor para arccos debe estar entre -1 y 1.");
                    } else {
                        double resultadoAcos = Math.toDegrees(Math.acos(valor));
                        System.out.println("arccos(" + valor + ") = " + resultadoAcos + "°");
                    }
                    break;
                case 6:
                    double resultadoAtan = Math.toDegrees(Math.atan(valor));
                    System.out.println("arctan(" + valor + ") = " + resultadoAtan + "°");
                    break;
                case 7:
                    double radSinh = Math.toRadians(valor);
                    System.out.println("sinh(" + valor + ") = " + Math.sinh(radSinh));
                    break;
                case 8:
                    double radCosh = Math.toRadians(valor);
                    System.out.println("cosh(" + valor + ") = " + Math.cosh(radCosh));
                    break;
                case 9:
                    double radTanh = Math.toRadians(valor);
                    System.out.println("tanh(" + valor + ") = " + Math.tanh(radTanh));
                    break;
            }
            
            System.out.println("=========================================");
        }
        
        scanner.close();
    }
}