import java.util.Scanner;

public class anoNasc {
	public static void main(String args[]){
		
		Scanner ler= new Scanner(System.in);
		int adn, aa, idade;
		
		System.out.println("Digite o ano de nascimento:");
		adn=ler.nextInt();
		
		System.out.println("Digite o ano atual:");
		aa=ler.nextInt();
		
		idade= aa-adn;
		System.out.println("A sua idade � "+idade);
	}
	ler.close ();
}
