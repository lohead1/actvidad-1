package actividade;
import java.util.Scanner; 
import java.util.Arrays;


public class cuestionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];
        leerArreglo(scanner, arreglo);
        System.out.println(Arrays.toString(arreglo));
    }

    public static void leerArreglo(Scanner scanner, int[] arreglo) {
        System.out.println("Ingrese el primer número:");
        arreglo[0] = scanner.nextInt();

        for (int i = 1; i < arreglo.length; i++) {
            int num;
            System.out.println("Ingrese un número mayor al anterior:");
            num = scanner.nextInt();

            while (num <= arreglo[i - 1]) {
                System.out.println("Volver a ingresar un número mayor al anterior:");
                num = scanner.nextInt();
            }

            arreglo[i] = num;
        }
    }

}
