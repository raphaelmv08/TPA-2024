import java.util.Scanner;

public class desconto {
	
	public static void main(String args[]){
		Scanner ler= new Scanner(System.in);
		double produto, desconto, produtoNovo; 
		
		System.out.println ("Digite o valor do produto");
		produto=ler.nextDouble();
		
		desconto=produto*0.05;
		produtoNovo=produto-desconto;
		
		System.out.println("O valor do produto com desconto é " + produtoNovo);
	}
	ler.close ();
}
