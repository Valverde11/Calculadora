import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("CALCULADORA TRIGONOMÉTRICA");
            System.out.println("--------------------------");
            System.out.println("1. Seno (sin)");
            System.out.println("2. Coseno (cos)");
            System.out.println("3. Tangente (tan)");
            System.out.println("4. Arcoseno (arcsin)");
            System.out.println("5. Arcocoseno (arccos)");
            System.out.println("6. Arcotangente (arctan)");
            System.out.println("7. Seno hiperbólico (sinh)");
            System.out.println("8. Coseno hiperbólico (cosh)");
            System.out.println("9. Tangente hiperbólica (tanh)");
            System.out.print("Elige una opción (1-9): ");
            
            int opcion = scanner.nextInt();
            double valor;
            double resultado; 
            String operacion;
            boolean enGrados = false; // Por defecto, trabajamos en radianes
            
            // Solo preguntamos por grados/radianes si es una función trigonométrica o hiperbólica
            if (opcion >= 1 && opcion <= 9) {
                System.out.print("¿Quieres el resultado en grados? (Sí/No): ");
                String eleccion = scanner.next().toLowerCase();
                enGrados = eleccion.equals("sí") || eleccion.equals("si") || eleccion.equals("s");
            }
            
            // Pedir valor según el tipo de función
            if (opcion >= 1 && opcion <= 3 || opcion >= 7 && opcion <= 9) {
                System.out.print("Ingresa el ángulo: ");
                valor = scanner.nextDouble();
                if (enGrados) {
                    valor = Math.toRadians(valor); // Convertir a radianes para cálculo
                }
            } else { // Funciones inversas (ya trabajan con valores puros)
                System.out.print("Ingresa el valor: ");
                valor = scanner.nextDouble();
            }
    
            // Calcular según la opción elegida
            switch (opcion) {
                case 1 -> {
                    resultado = Math.sin(valor);
                    operacion = "Seno";
                }
                case 2 -> {
                    resultado = Math.cos(valor);
                    operacion = "Coseno";
                }
                case 3 -> {
                    resultado = Math.tan(valor);
                    operacion = "Tangente";
                }
                case 4 -> {
                    resultado = Math.asin(valor);
                    operacion = "Arcoseno";
                    resultado = Math.toDegrees(resultado); // Convertimos a grados
                    enGrados = true; // Forzamos grados en el resultado
                }
                case 5 -> {
                    resultado = Math.acos(valor);
                    operacion = "Arcocoseno";
                    resultado = Math.toDegrees(resultado); // Convertimos a grados
                    enGrados = true; // Forzamos grados en el resultado
                }
                case 6 -> {
                    resultado = Math.atan(valor);
                    operacion = "Arcotangente";
                    resultado = Math.toDegrees(resultado); // Convertimos a grados
                    enGrados = true; // Forzamos grados en el resultado
                }
                case 7 -> {
                    resultado = Math.sinh(valor);
                    operacion = "Seno hiperbólico";
                }
                case 8 -> {
                    resultado = Math.cosh(valor);
                    operacion = "Coseno hiperbólico";
                }
                case 9 -> {
                    resultado = Math.tanh(valor);
                    operacion = "Tangente hiperbólica";
                }
                default -> {
                    System.out.println("Opción no válida");
                    return;
                }
            }
    
            // Mostrar resultado en el formato elegido
            System.out.println("\n--- RESULTADO ---");
            if (opcion >= 4 && opcion <= 6) {
                System.out.printf("%s de %.4f = %.4f grados\n", operacion, valor, resultado);
            } else {
                if (enGrados) {
                    System.out.printf("%s de %.2f° = %.4f\n", operacion, Math.toDegrees(valor), resultado);
                } else {
                    System.out.printf("%s de %.4f rad = %.4f\n", operacion, valor, resultado);
                }
            }
        }
    }
}