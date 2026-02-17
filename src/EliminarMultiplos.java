import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EliminarMultiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pedimos los numeros al usuario
        System.out.println("Introduce una lista de números (separalos por espacios):");
        String entrada = sc.nextLine();


        String[] partes = entrada.split("\\s+");
        List<Integer> numeros = new ArrayList<>();

        for (String parte : partes) {
            try {
                numeros.add(Integer.parseInt(parte));
            } catch (NumberFormatException e) {
                System.out.println("Nota: '" + parte + "' no es un número válido y será ignorado.");
            }
        }

        System.out.print("¿De qué número quieres eliminar los múltiplos? ");
        int divisor = sc.nextInt();

        if (divisor != 0) {
            numeros.removeIf(n -> n % divisor == 0);
        } else {
            System.out.println("No se puede calcular múltiplos de cero.");
        }

        System.out.println("Lista filtrada (sin múltiplos de " + divisor + "):");
        if (numeros.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println(numeros);
        }

        sc.close();
    }
}
