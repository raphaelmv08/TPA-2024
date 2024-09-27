import java.util.Scanner;

public class area {
	public static void main(String args[]){
		
		Scanner ler= new Scanner(System.in);
		double base, altura, area;
		
		System.out.println("Digite a base do tri�ngulo");
		base=ler.nextDouble();
		
		System.out.println("Digite a altura do tri�ngulo");
		
		altura=ler.nextDouble ();
		area= base*altura/2;
		
		System.out.println	("A área do triangulo   "+ area);
		
	}
	ler.close ();
}