package ex_02_08;

import java.util.*;

public class Mes {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		int d;
		System.out.println("digita um numero de 1 a 12.");
		d = ler.nextInt();
		switch(d){
		case 1:
			System.out.println("Janeiro, 31 dias");
			break;
		case 2:
			System.out.println("Fevereiro, 28 dias");
			break;
		case 3:
			System.out.println("Março, 31 dias");
			break;
		case 4:
			System.out.println("Abril, 30 dias");
			break;
		case 5:
			System.out.println("Maio, 31 dias");
			break;
		case 6:
			System.out.println("junho, 30 dias");
			break;
		case 7:
			System.out.println("Julho, 31 dias");
			break;
		case 8:
			System.out.println("Agosto, 31 dias");
			break;
		case 9:
			System.out.println("Setembro, 30 dias");
			break;
		case 10:
			System.out.println("Outubro, 31 dias");
			break;
		case 11:
			System.out.println("Novembro, 30 dias");
			break;
		case 12:
			System.out.println("Dezembro, 31 dias");
			break;
			default:
				System.out.println("Dia inválido");
				
			
			
			
		}
	}

}
