import java.util.Scanner;

public class Calculadora{
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
                    valor = Math.toRadians(valor); 
                                } else {
                                    System.out.print("Ingresa el valor: ");
                                    valor = scanner.nextDouble();
                                }
                            
                        }
                    }
                }
