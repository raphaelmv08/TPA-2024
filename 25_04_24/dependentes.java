import java.util.Scanner;

public class dependentes {
	public static void main(String args[]){
		
		Scanner ler= new Scanner(System.in);
		int salario, depen, novo;
		
		System.out.println ("Digite o salario");
		salario=ler.nextInt();
		
		System.out.println ("Digite o número de dependentes");
		depen=ler.nextInt();
		
		novo=salario+(depen*55);
		System.out.println ("Seu salario com dependentes é" +novo );
	}
	ler.close ();
}
