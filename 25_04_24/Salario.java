import java.util.Scanner;

public class Salario {
	
	public static void main(String args[]){
		Scanner ler= new Scanner(System.in);
		
		double aumento, salarioNovo;
		int salarioAtual;
		
		System.out.println("Digite o salário atual");
		salarioAtual=ler.nextInt();
		
        aumento=salarioAtual/100*12;
        salarioNovo=aumento+salarioAtual;
        
        System.out.println("Seu salário novo é : " + salarioNovo);
	}
	ler.close ();
}
