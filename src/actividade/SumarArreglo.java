package actividade;

public class SumarArreglo {
	public static void main(String[] args) {
		int[] valores = {2, 4, 6, 8, 1, 2, 11, 22, 66, 23};
        int sum = 0; 
        
        for (int i = 0; i < valores.length; i++) {
            sum += valores[i];
        }
        System.out.println("La suma de valores es " + sum);
    }

}

	