import java.util.Scanner;

public class M_Km{
	public static void main(String args[]){
		
		Scanner ler= new Scanner(System.in);
		double metros, quilômetros ;
		
		System.out.println("Digita um numero em metros");
		
		metros=ler.nextDouble();
		quilômetros=metros/1000;
		
        System.out.println("O número em quilômetros " + quilômetros);
	}
	ler.close ();
}
