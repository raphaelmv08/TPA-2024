import java.util.Scanner;
public class Dias {
	
	public static void main(String args[]){
		Scanner ler= new Scanner(System.in);
		
		double ano, meses;
		int dias;
		
		System.out.println("Escreva a quantidade de dias:");
		dias=ler.nextInt();
		
		meses = dias/30;
		ano = meses/12;
		ano = dias/365;
		
		System.out.println("ano " +ano );
		System.out.println("meses " +meses);
	}
	ler.close ();
}
