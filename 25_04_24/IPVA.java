import java.util.Scanner;

public class IPVA{
	public static void main(String args[]){
		
		Scanner ler= new Scanner(System.in);
		double preco, ipva;
		
		System.out.println("Digita o valor original do veículo.");
		preco=ler.nextDouble();
		
		ipva= preco* 0.04;
        System.out.println("o preço do ipva é:" + ipva);
        
	}
	ler.close ();
}
