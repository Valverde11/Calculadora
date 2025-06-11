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
            
            // Pedir valor según el tipo de función
                if (opcion >= 1 && opcion <= 3 || opcion >= 7 && opcion <= 9) {
                    System.out.print("Ingresa el ángulo en grados: ");
                    valor = scanner.nextDouble();
                    valor = Math.toRadians(valor); // Convertir a radianes
                } else {
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
                        resultado = Math.toDegrees(Math.asin(valor));
                        operacion = "Arcoseno";
                    }
                    case 5 -> {
                        resultado = Math.toDegrees(Math.acos(valor));
                        operacion = "Arcocoseno";
                    }
                    case 6 -> {
                        resultado = Math.toDegrees(Math.atan(valor));
                        operacion = "Arcotangente";
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
    
                // Mostrar resultado
                if (opcion >= 4 && opcion <= 6) {
                    System.out.printf("\nResultado:\n%s de %.4f = %.4f grados", operacion, valor, resultado);
                } else if (opcion >= 7 && opcion <= 9) {
                    System.out.printf("\nResultado:\n%s de %.4f = %.4f", operacion, Math.toDegrees(valor), resultado);
                } else {
                    System.out.printf("\nResultado:\n%s de %.2f° = %.4f", operacion, Math.toDegrees(valor), resultado);
                }
        }
    }
}