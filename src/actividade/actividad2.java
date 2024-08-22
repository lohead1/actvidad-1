	package actividade;
	import java.util.Scanner;
	
	public class actividad2 {
		public static void main(String[] args ) { 
			System.out.println("ingresar el numero que desea saber si es palindromo");
			Scanner scanner=new Scanner(System.in); 
			int n=scanner.nextInt(); 
			
			int original=n; 
			int inverso=0; 
			
			while(n!=0) {
				inverso=inverso*10 + (n%10); 
				n/=10; 	
			
			}
				
			if (original==inverso) { 
				System.out.println(original + " es un palindromo"); 
				
			}
			else { 
				System.out.println(original + "no es un palindromo"); 
			}
			
		}
	}
