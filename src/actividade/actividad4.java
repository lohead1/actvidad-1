package actividade;
import java.util.Scanner;

public class actividad4 {
	public static void main(String[] args) { 
		System.out.println("ingresar el tamñao del arreglo"); 
		Scanner scanner=new Scanner(System.in); 
		int n= scanner.nextInt(); 
		
		int [] a = new int [n]; 
		System.out.println("ingresar los valores para el arreglo"); 
		leerArreglo(scanner, a); 
		
		double promedio = calcularPromedio(a);
        System.out.println("El promedio de los elementos es: " + promedio);
    }
		

    public static void leerArreglo(Scanner scanner, int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {	
            arreglo[i] = scanner.nextInt();
        }
    }

    public static double calcularPromedio(int[] arreglo) {
        int suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        return (double) suma / arreglo.length;
    }
		
}

	